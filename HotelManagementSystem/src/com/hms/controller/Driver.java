package com.hms.controller;

import com.hms.model.*;
import com.hms.model.Customer;
import com.hms.view.*;
import java.awt.EventQueue;

import com.hms.view.OrderFood;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food f = new Food("A1", 1);
					/*SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
					Session session = sessionFactory.openSession();
					session.beginTransaction();
					session.save(f);
					session.getTransaction().commit();
					session.close();
					sessionFactory.close();
					*/
					OrderFood of = new OrderFood();
					of.frame.setVisible(true);
					Food _food = new Food();
					Customer _cust = new Customer();
					ControllerFood confood = new ControllerFood(of, _food, _cust);
					confood.control();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

}
}