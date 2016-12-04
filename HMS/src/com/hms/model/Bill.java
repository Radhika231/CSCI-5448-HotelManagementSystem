package com.hms.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Bill {
	
	@Id
	private String custName;
	double bill;
	
	public Bill(String custName) {
		super();
		this.custName = custName;
		this.bill = 0.0;
	}
	
	public double getCustBill(String name){
		double bill = 0;//Read it from the database
		return bill;		
	}
	
	public double computeFoodBill(ArrayList<Food> _foodList){
		double billLocal = 0;
		
		for(Food item : _foodList){
			billLocal += (item.getQuantity() * item.getPrice());
		}	
		//Update bill in the database before returning
		this.bill = billLocal;
		System.out.println("In compute bill: "+ billLocal);
		System.out.println("In compute bill: "+ this.bill);
		return bill;
	}

	public String getCustName() {
		return custName;
	}

	public double getBill() {
		return bill;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

}

/*
 * SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		*/
