package com.hms.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

//Factory Design Pattern
public class ManagerView extends UserRole {
	
	public void userScreen()
	{
		JFrame frame=new JFrame("Manager Home Screen");
		Panel p=new Panel();
		p.setBackground(Color.DARK_GRAY);
		p.setLayout(null);
		
		JButton leaveReq=new JButton("View Leave Requests");
		leaveReq.setForeground(Color.BLUE);
		leaveReq.setBounds(92, 58, 243, 49);
		
		JButton custRating=new JButton("View Customer Ratings");
		custRating.setForeground(Color.BLUE);
		custRating.setBounds(413, 58, 215, 49);
		
		JButton viewAttend=new JButton("View Training List Attendance");
		viewAttend.setForeground(Color.BLUE);
		viewAttend.setBounds(92, 160, 243, 49);
		
		JButton viewSched=new JButton("View Training Schedule");
		viewSched.setForeground(Color.BLUE);
		viewSched.setBounds(413, 160, 215, 49);
		
		JButton viewPayslip=new JButton("View Payslip");
		viewPayslip.setForeground(Color.BLUE);
		viewPayslip.setBounds(413, 259, 215, 49);
		
		JButton customerInfo=new JButton("View Customer Information");
		customerInfo.setForeground(Color.BLUE);
		customerInfo.setBounds(92, 259, 243, 49);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(494, 336, 134, 39);
		
		p.add(leaveReq);
		p.add(custRating);
		p.add(viewAttend);
		p.add(viewSched);
		p.add(viewPayslip);
		p.add(customerInfo);
		p.add(btnLogout);
		
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(727, 447);
		frame.setVisible(true);
	}
	

}
