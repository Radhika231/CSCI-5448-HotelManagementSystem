package com.hms.controller;

import javax.swing.JOptionPane;

import com.hms.controller.*;
import com.hms.view.LoginView;

//Singleton Design Pattern
public class Login extends LoginView 
{ 
	
    
    private static Login uniqueInstance=null;
     private Login()
     {
    	 
     }
     
     public static Login getInstance(LoginView view)
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
     public static void startSession(String role)
     {
    	 loginUserRoleFactory urole=new loginUserRoleFactory(role);
    	
     }
}
