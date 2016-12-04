package view;

import controller.*;

//Singleton Design Pattern
public class Login extends LoginView 
{ 
	
    
    private static Login uniqueInstance=null;
     private Login()
     {
    	 
     }
     
     public static Login getInstance()
     {
    	 if(uniqueInstance==null)
    	 {
    		 uniqueInstance=new Login();
    	 }
    	 return uniqueInstance;
     }
     
     //Start session according to user role using factory method
     public static void startSession(String role)
     {
    	 loginUserRoleFactory urole=new loginUserRoleFactory(role);
    	
     }
}
