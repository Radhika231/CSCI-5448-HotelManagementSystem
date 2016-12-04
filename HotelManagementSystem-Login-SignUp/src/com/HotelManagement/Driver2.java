package com.HotelManagement;
import model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



import controller.*;
import view.*;

public class Driver 
{
 public static void main (String[] args)
 {
	 
	 LoginView home=new LoginView();  //Display Login view for user to login
	 UserLogInSignUpController c =new UserLogInSignUpController(home);  //Pass view to controller
	 c.control(); // Inform controller about button clicks to return new view
	 
 }
}
