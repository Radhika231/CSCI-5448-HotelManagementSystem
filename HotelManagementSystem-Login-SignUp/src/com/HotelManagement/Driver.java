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
	 HomePage home=new HomePage();
	 Controller c =new Controller(home);
	 c.control();
	 
 }
}
