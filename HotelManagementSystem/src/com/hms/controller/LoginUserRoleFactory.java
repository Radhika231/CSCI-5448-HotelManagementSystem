package com.hms.controller;

import com.hms.view.*;
import com.hms.model.*;

//Concrete Class for factory design pattern to instantiate UserRole screen according to user role
//Object instantiation is deferred to sub classes
public class LoginUserRoleFactory extends LoginUserRoleFactoryBase{

	String role;
	public LoginUserRoleFactory(String role)
	{
	     this.role = role;
	}

	@Override
	void createUser() {
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
			 UserRole screen=new ManagerView();
			 screen.userScreen();
		 }
		 else if(role.equals("Receptionist"))
		 {
			 UserRole screen=new ReceptionistView();
			 screen.userScreen(); 
		 }
		 else if(role.equals("HR"))
		 {
			 UserRole screen=new HRView();
			 screen.userScreen();
		 }
		 else if(role.equals("Catering"))
		 {
			 UserRole screen=new CateringView();
			 screen.userScreen();
			 CateringController cater =new CateringController((CateringView)screen);
			 cater.control();
		 }
		 else if(role.equals("HouseKeeping"))
		 {
			 UserRole screen=new HouseKeepingView();
			 screen.userScreen();
			 HouseKeepingController hk =new HouseKeepingController((HouseKeepingView)screen);
			 hk.control();
		 }
		
	}
}
