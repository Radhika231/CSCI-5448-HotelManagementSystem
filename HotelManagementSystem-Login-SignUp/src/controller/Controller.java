package controller;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.HotelManagement.HibernateUtil;

import model.*;
import view.*;


public class Controller implements ActionListener 
{
		private HomePage view1;
		private SignUp view2;
		
		public Text user_name;

		private ActionListener actionListener;
		
		public Controller()
		{
			
		}

		public Controller(HomePage view1)
		{
			this.view1 = view1;
		}

		public void control()
		{
			view1.getSignUpButton().addActionListener(this); 
			view1.getLoginButton().addActionListener(this); 
		}
	

		public void actionPerformed(ActionEvent actionEvent)
		{
			 String command = ((JButton) actionEvent.getSource()).getActionCommand();
			 if(command=="Login")
			 {
				
				 String user=view1.getUserName();
				 String password=view1.getPassword();
		    	 System.out.println("User"+user);
		    	 if(!user.isEmpty() && !password.isEmpty())
		    	 {
		    		     view1.closeHomePage();
				    	 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
				    	 String hql = "Select user_role FROM User u WHERE user_name= :username AND password= :password";
				    	 Session session = sessionFactory.openSession();
				 		 session.beginTransaction();
				    	 Query query = session.createQuery(hql);
				    	 query.setParameter("username", user);
				    	 query.setParameter("password", password);
				    	 List<String> results = query.list();
				    	 session.close();
				 		 sessionFactory.close();
				 		 
			 		
			    	 if(!results.isEmpty())
			    	 {
			    		 Login l=Login.getInstance(); //singleton design pattern
			    		 l.startSession(results.get(0));
			    		
			    	 }
			    	 else
			    	 {
			    		 System.out.println("User Doesn't Exist");
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
			 else if(command=="Sign Up")
			 {
				
				 SignUp signUpFrame=new SignUp();
							
			 }
			 view1.closeHomePage();
		}
		
		public void addDetailsToModel(String first_name,String last_name,String user_name,String password,String email_id,String phone_no,String gender,String user_role)
		{
			 User u=new User();
			 u.setUserDetails(first_name,last_name,user_name,password,email_id,phone_no,gender,user_role);
			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(u);
				session.getTransaction().commit();
				session.close();
				sessionFactory.close();
				
				view1.closeHomePage();
				HomePage view1=new HomePage();
				Controller c2 =new Controller(view1);
				c2.control();
								
		}

}
