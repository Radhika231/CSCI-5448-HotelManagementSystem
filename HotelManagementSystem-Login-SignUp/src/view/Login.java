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
	JFrame login;
    
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
     
     public void startSession()
     {
    	 login=new JFrame("Login");
		 login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 login.setSize(500, 300);
		 login.setVisible(true);
     }
}
