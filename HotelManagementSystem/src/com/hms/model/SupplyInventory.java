package com.hms.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hms.view.*;
import com.hms.controller.*;

@Entity
@Table(name="SupplyInventory")
public class SupplyInventory extends Inventory
{
	 //Method to get the inventory details from Supply Inventory table in the database
	public List<Inventory> getInventoryTable()
	{
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		 Session session = sessionFactory.openSession();
 		 session.beginTransaction();
    	 Query query = session.createQuery("from SupplyInventory");
    	 List<Inventory> inventoryList = ((org.hibernate.Query)query).list();   	
    	 session.close();
 		 sessionFactory.close();
		 return inventoryList;		
	}
	
	//Method to update supply inventory in the database on click of update button
	public void updateInventory(int itemNum,int numSupplies)
	{
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		 Session session = sessionFactory.openSession();
    	 String hql = "Update SupplyInventory set itemQuantity=:numSupplies where inventory_id=:itemNum";
 		 session.beginTransaction();
    	 Query query = session.createQuery(hql);
    	 query.setParameter("itemNum", itemNum);
    	 query.setParameter("numSupplies", numSupplies);
    	 query.executeUpdate();
    	 session.close();
 		 sessionFactory.close();
	}
}