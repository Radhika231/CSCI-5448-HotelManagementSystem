package view;
import java.awt.*;
import javax.swing.*;
import com.HotelManagement.*;

import org.hibernate.SessionFactory;


import controller.*;
import java.util.*;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//Singleton Design Pattern
public class Login extends HomePage 
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
     
     public void startSession(String role)
     {
    	 System.out.println(role);
    	
    	 if(role.equals("Customer"))
    	 {
    		UserRole screen=new Customer();
    		screen.userScreen();
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
    	 }
    	 else if(role.equals("HouseKeeping"))
    	 {
    		 UserRole screen=new HouseKeeping();
    		 screen.userScreen();
    	 }
     }
}
