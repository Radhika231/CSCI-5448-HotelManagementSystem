package com.hms.view;
import java.awt.*;
import javax.swing.*;

public class LoginView 
{
	private JFrame frame;
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
		
		username=new JLabel("User Name:");
		username.setBounds(50, 10, 150, 25);
		username.setFont(new Font("Serif", Font.PLAIN, 20));
		
		
		password=new JLabel("Password:");
		password.setBounds(50, 40, 150, 25);
		password.setFont(new Font("Serif", Font.PLAIN, 20));
		
		in_username=new JTextField(15);
		in_username.setBounds(150, 10, 160, 25);

		
		in_password=new JPasswordField(15);
		in_password.setBounds(150, 40, 160, 25);
		
		Panel p=new Panel();
		p.setLayout(null);
		
		login=new JButton("Login");
		login.setBounds(50, 70, 100, 25);
		
		signup=new JButton("Sign Up");
		signup.setBounds(200, 70, 100, 25);
		
		p.add(username);
		p.add(in_username);
		p.add(password);
		p.add(in_password);
		p.add(login);
		p.add(signup);
		
		frame.add(p,BorderLayout.CENTER);
		
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
