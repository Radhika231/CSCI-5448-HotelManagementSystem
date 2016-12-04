package view;
import java.awt.*;
import javax.swing.*;
import com.HotelManagement.*;

import controller.*;

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
     
     public static void startSession(String role)
     {
    	 System.out.println(role);
    	 loginUserRoleFactory urole=new loginUserRoleFactory(role);
    	
     }
}
