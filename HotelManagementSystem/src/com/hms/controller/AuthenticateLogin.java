package com.hms.controller;

import java.util.List;

//import org.hibernate.Query;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hms.view.*;
import com.hms.model.*;

public class AuthenticateLogin extends UserLogInSignUpController
{
	//Checks if valid user name and password is entered
	//Starts session only if user and password is valid
	public AuthenticateLogin(LoginView view1)
	{
		 String user=view1.getUserName();
		 String password=view1.getPassword();
		
		 if(!user.isEmpty() && !password.isEmpty())
		 {
			 String result = authenticateUser(user,password);	

	    	 if(!result.equals(null))
	    	 {
	    		 view1.frame.setVisible(false);
	    		 Login l=Login.getInstance(view1); //singleton design pattern
	    		 
	    		 l.startSession(result);
	    	 }
	    	 else
	    	 {
	    		 //inserts Failed logins
	    		 insertFailedLogins(user);
	    		 System.out.println("Login Failed");
	    		 view1.frame.setVisible(false);
	    		 LoginView home=new LoginView();  //Display Login view for user to login
	    		 UserLogInSignUpController c =new UserLogInSignUpController(home);  //Pass view to controller
	    		 c.control(); // Inform controller about button clicks to return new view
	    	 }
			/* //List<String>results=authenticateUser(user,password);
			 
	 		
	    	 if(!results.isEmpty())
	    	 {
	    		 Login l=Login.getInstance(); //singleton design pattern
	    		 l.startSession(results.get(0));
	    		
	    	 }
	    	 else
	    	 {
	    		 //inserts Failed logins
	    		 insertFailedLogins(user);
	    		 System.out.println("Login Failed");
	    	 }*/
		 }
		 else if(user.isEmpty())
		 {
			 System.out.println("Enter username");
		 }
		 else if(password.isEmpty())
		  {
			 System.out.println("Enter password"); 
		  }
		 
		 
	}
	
	//Returns role of user if the user name and password is valid
	//public List<String> authenticateUser(String user,String password)
	public String authenticateUser(String user,String password)
	{
		/* SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 String hql = "Select user_role FROM User WHERE user_name= :username AND password= :password";
		 //String hql = "FROM User AS E WHERE E.user_name = :username and E.password =:password";
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 Query query = session.createQuery(hql);
		 query.setParameter("username", user);
		 query.setParameter("password", password);
		 List<String> results = ((org.hibernate.Query) query).list();
		 session.close();
		 sessionFactory.close();
		 */
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User userObj = session.get(com.hms.model.User.class, user);
		System.out.println(userObj.getUser_role());
		String result = null;
		if(userObj.getUser_name().equalsIgnoreCase(user)){
			if(userObj.getPassword().equalsIgnoreCase(password)){
				result = userObj.getUser_role();
			}
		}
		session.close();
		sessionFactory.close();
		return result;
	}
	
	//Function to insert number of failed logins
	public void insertFailedLogins(String username)
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 String hql1="SELECT failedLogins from User u WHERE u.user_name=:username";
		 String hql2 = "UPDATE User_Details set failedLogins=:failedLogins where user_name=:username";
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 Query query1 = session.createQuery(hql1);
		 query1.setParameter("username",username);
		 List failedLogs=((org.hibernate.Query) query1).list();
		 int failed=(Integer)failedLogs.get(0)+1;
		 System.out.println("FAiled="+failed);
		 Query query2=session.createQuery(hql2);
		 query2.setParameter("failedLogins",failed);
		 query2.setParameter("username",username);
		 query2.executeUpdate();
		 session.close();
		 sessionFactory.close();
	}
}

