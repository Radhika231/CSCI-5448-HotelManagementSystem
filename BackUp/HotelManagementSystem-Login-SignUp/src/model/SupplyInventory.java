package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.HotelManagement.HibernateUtil;

@Entity
@Table(name="SupplyInventory")
public class SupplyInventory extends Inventory
{
	 //Method to get the inventory details from Supply Inventory table in the database
	public List<Inventory> getInventoryTable()
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	 String hql = "FROM SupplyInventory";
	 	 Session session = sessionFactory.openSession();
 		 session.beginTransaction();
    	 Query query = session.createQuery(hql);
    	 List<Inventory> inventoryList = ((org.hibernate.Query)query).list();   	
    	 session.close();
 		 sessionFactory.close();
		 return inventoryList;		
	}
	
	//Method to update supply inventory in the database on click of update button
	public void updateInventory(int itemNum,int numSupplies)
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	 String hql = "Update SupplyInventory set itemQuantity=:numSupplies where inventory_id=:itemNum";
	 	 Session session = sessionFactory.openSession();
 		 session.beginTransaction();
    	 Query query = session.createQuery(hql);
    	 query.setParameter("itemNum", itemNum);
    	 query.setParameter("numSupplies", numSupplies);
    	 session.close();
 		 sessionFactory.close();
	}
}