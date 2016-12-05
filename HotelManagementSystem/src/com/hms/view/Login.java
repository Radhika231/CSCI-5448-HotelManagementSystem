package com.hms.view;

import javax.swing.JOptionPane;

import com.hms.controller.*;

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
    		 JOptionPane.showMessageDialog(view.frame, "An Instance of this user is already running");
    	 }
    	 return uniqueInstance;
     }
     
     //Start session according to user role using factory method
     public static void startSession(String role)
     {
    	 loginUserRoleFactory urole=new loginUserRoleFactory(role);
    	
     }
}
