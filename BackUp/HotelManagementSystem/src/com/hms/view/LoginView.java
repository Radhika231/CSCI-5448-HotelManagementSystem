package com.hms.view;
import java.awt.*;
import javax.swing.*;

public class LoginView 
{
	public JFrame frame;
	private JLabel username,password;
	private final JTextField in_username;
	private final JPasswordField in_password;
	JButton login,signup;
	
	
	//Display Login View
	//Application starts with this view
	public LoginView()
	{
		frame=new JFrame("Home Page");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setBounds(600, 250, 450, 300);
		
		username=new JLabel("User Name:");
		username.setBounds(111, 68, 150, 25);
		username.setFont(new Font("Serif", Font.PLAIN, 20));
		
		
		password=new JLabel("Password:");
		password.setBounds(111, 98, 150, 25);
		password.setFont(new Font("Serif", Font.PLAIN, 20));
		
		in_username=new JTextField(15);
		in_username.setBounds(253, 70, 160, 25);

		
		in_password=new JPasswordField(15);
		in_password.setBounds(253, 105, 160, 25);
		
		Panel p=new Panel();
		p.setBackground(new Color(255, 255, 255));
		p.setLayout(null);
		
		login=new JButton("Login");
		login.setBounds(111, 150, 100, 25);
		
		signup=new JButton("Sign Up");
		signup.setBounds(261, 150, 100, 25);
		
		p.add(username);
		p.add(in_username);
		p.add(password);
		p.add(in_password);
		p.add(login);
		p.add(signup);
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
	
	
	//Notify about button update to observing classes 
	public JButton getLoginButton()
	{
		return login;
	}
	
	public JButton getSignUpButton()
	{
		return signup;
	}
	public String getUserName()
	{
		return in_username.getText();
	}
	public String getPassword()
	{
		return in_password.getText();
	}
	
}
