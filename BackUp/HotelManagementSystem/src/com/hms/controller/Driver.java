package com.hms.controller;
import com.hms.view.*;
import com.hms.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Driver 
{
	static LoginView home;
	
 public static void main (String[] args)
 {
	 
	 home = new LoginView();  //Display Login view for user to login
	 UserLogInSignUpController c = new UserLogInSignUpController(home);  //Pass view to controller
	 c.control(); // Inform controller about button clicks to return new view
	 
 }
}
