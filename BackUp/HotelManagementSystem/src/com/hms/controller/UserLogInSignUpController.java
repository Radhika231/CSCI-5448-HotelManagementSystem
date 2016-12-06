package com.hms.controller;
import java.awt.event.*;

import javax.swing.*;
import org.eclipse.swt.widgets.Text;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hms.view.*;
import com.hms.model.*;


public class UserLogInSignUpController implements ActionListener 
{
		private LoginView view1;
		public Text user_name;
		
		public UserLogInSignUpController()
		{
			
		}

		public UserLogInSignUpController(LoginView view1)
		{
			this.view1 = view1;
		}

		public void control()
		{
			view1.getSignUpButton().addActionListener(this); 
			view1.getLoginButton().addActionListener(this); 
		}
	
       //Listens to button clicks for login and sign up and responds accordingly
		public void actionPerformed(ActionEvent actionEvent)
		{
			 String command = ((JButton) actionEvent.getSource()).getActionCommand();
			 if(command=="Login")
			 {
				 AuthenticateLogin auth=new AuthenticateLogin(this.view1);
			 }
			 
			 else if(command=="Sign Up")
			  {
					SignUpView signUpFrame=new SignUpView();
			  }
		}
				

		
		//Inserts sign up details in database
		public void addDetailsToModel(String first_name,String last_name,String user_name,String password,String email_id,String phone_no,String gender,String user_role,int failed_logins)
		{
			 User u=new User();
			 u.setUserDetails(first_name,last_name,user_name,password,email_id,phone_no,gender,user_role,failed_logins);
			 /*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(u);
				session.getTransaction().commit();
				session.close();
				sessionFactory.close();
				*/
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(u);
				session.getTransaction().commit();
				session.close();
				sessionFactory.close();
				
				LoginView view1=new LoginView();
				UserLogInSignUpController c2 =new UserLogInSignUpController(view1);
				c2.control();
								
		}

}
