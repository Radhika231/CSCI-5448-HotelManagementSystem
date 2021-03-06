package com.hms.controller;

import javax.swing.JOptionPane;

import com.hms.controller.*;
import com.hms.view.LoginView;

//Singleton Design Pattern
public class Login extends LoginView 
{  
	 private LoginUserRoleFactory urole;
     private static Login uniqueInstance=null;
     private Login()
     {
    	 
     }
     //looks to be incorrect. Should return an instance of the user-customer or whatever
     //What good is an instance of Login()?? -- ensures only one person logs in, fair enough?!
     public static Login getInstance()
     {
    	 if(uniqueInstance==null)
    	 {
    		 uniqueInstance=new Login();
    	 }
    	 else{
    		 //LoginView viewNew = new LoginView();
    		 //JOptionPane.showMessageDialog(viewNew.frame, "An Instance of this user is already running");
    	 }
    	 return uniqueInstance;
     }
     
     //Start session according to user role using factory method
     public void startSession(String role)
     {
    	 urole=new LoginUserRoleFactory(role);
    	 urole.createUser();
    	
     }
}
