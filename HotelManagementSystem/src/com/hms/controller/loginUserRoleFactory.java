package com.hms.controller;

import com.hms.view.*;
import com.hms.model.*;
import com.hms.view.CustomerView;

//Concrete Class for factory design pattern to instantiate UserRole screen according to user role
//Object instantiation is deferred to sub classes
public class loginUserRoleFactory {

	public loginUserRoleFactory(String role)
	{
	     //Factory Design Pattern
		 if(role.equals("Customer"))
		 {
			UserRole screen= new CustomerView();
			screen.userScreen();
			CustomerController customerController = new CustomerController((CustomerView)screen);
			customerController.control();
		 }
		 else if(role.equals("Manager"))
		 {
			 UserRole screen=new Manager();
			 screen.userScreen();
		 }
		 else if(role.equals("Receptionist"))
		 {
			 UserRole screen=new Receptionist();
			 screen.userScreen(); 
		 }
		 else if(role.equals("HR"))
		 {
			 UserRole screen=new HR();
			 screen.userScreen();
		 }
		 else if(role.equals("Catering"))
		 {
			 UserRole screen=new Catering();
			 screen.userScreen();
			 CateringController cater =new CateringController((Catering)screen);
			 cater.control();
		 }
		 else if(role.equals("HouseKeeping"))
		 {
			 UserRole screen=new HouseKeeping();
			 screen.userScreen();
			 HouseKeepingController hk =new HouseKeepingController((HouseKeeping)screen);
			 hk.control();
		 }
	}
}
