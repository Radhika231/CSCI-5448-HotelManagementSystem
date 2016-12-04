package controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.HotelManagement.HibernateUtil;

import view.Login;
import view.LoginView;
import view.SignUp;

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
		    	
			 List<String>results=authenticateUser(user,password);
	 		
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
	    	 }
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
	public List<String> authenticateUser(String user,String password)
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 String hql = "Select user_role FROM User WHERE user_name= :username AND password= :password";
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 Query query = session.createQuery(hql);
		 query.setParameter("username", user);
		 query.setParameter("password", password);
		 List<String> results = query.list();
		 session.close();
		 sessionFactory.close();
		 return results;
	}
	
	//Function to insert number of failed logins
	public void insertFailedLogins(String username)
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		 String hql1="SELECT failedLogins from User u WHERE u.user_name=:username";
		 String hql2 = "UPDATE User set failedLogins=:failedLogins where user_name=:username";
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 Query query1 = session.createQuery(hql1);
		 query1.setParameter("username",username);
		 List failedLogs=query1.list();
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

