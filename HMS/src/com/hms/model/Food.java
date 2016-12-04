package com.hms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@Entity
public class Food {
	
	public Food() {
		super();
	}
	@Id
	private String foodItem;
	private int quantity;
	private double price;
	
	public Food(String foodItem, int quantity) {
		super();
		this.foodItem = foodItem;
		this.quantity = quantity;
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Food foodDB = session.get(com.hms.model.Food.class, foodItem);
		session.close();
		sessionFactory.close();
		
		this.price = foodDB.getPrice();
	    //this.price = 0.0;
	}
	
	public String getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
