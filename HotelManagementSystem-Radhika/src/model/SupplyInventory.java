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
	public void updateInventory(int itemNum,int numSupplies)
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	 //String hql = "Select inventory_id, itemName, itemQuantity,needsToBeOrdered FROM Inventory";
    	 String hql = "Update SupplyInventory set itemQuantity=:numSupplies where inventory_id=:itemNum";
	 	 Session session = sessionFactory.openSession();
 		 session.beginTransaction();
    	 Query query = session.createQuery(hql);
    	 query.setParameter("itemNum", itemNum);
    	 query.setParameter("bumSupplies", numSupplies);
    	 session.close();
 		 sessionFactory.close();
	}
}