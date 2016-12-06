package com.hms.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Factory Design Pattern
public class ManagerView extends UserRole {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void userScreen()
	{
		ImageIcon iconX = new ImageIcon(getClass().getResource("/images/hotelimage1.jpg"));
		JFrame frame=new JFrame("Manager Home Screen");
		Panel p=new Panel();
		p.setBackground(new Color(240, 230, 140));
		p.setLayout(null);
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel(iconX);
		p.add(lblNewLabel);
		lblNewLabel.setBounds(0, 0, 820, 273);
		
		JButton leaveReq=new JButton("View Leave Requests");
		leaveReq.setForeground(new Color(255, 255, 255));
		leaveReq.setBackground(new Color(0, 0, 128));
		leaveReq.setBounds(109, 394, 204, 49);
		p.add(leaveReq);
		
		JButton custRating=new JButton("View Customer Ratings");
		custRating.setBackground(new Color(0, 0, 128));
		custRating.setForeground(new Color(255, 255, 255));
		custRating.setBounds(432, 394, 196, 49);
		
		JButton viewAttend=new JButton("View Training List Attendance");
		viewAttend.setBackground(new Color(0, 0, 128));
		viewAttend.setForeground(new Color(255, 255, 255));
		viewAttend.setBounds(109, 491, 204, 49);
		
		JButton viewSched=new JButton("View Training Schedule");
		viewSched.setBackground(new Color(0, 0, 128));
		viewSched.setForeground(new Color(255, 255, 255));
		viewSched.setBounds(432, 491, 196, 49);
		
		JButton viewPayslip=new JButton("View Payslip");
		viewPayslip.setBackground(new Color(0, 0, 128));
		viewPayslip.setForeground(new Color(255, 255, 255));
		viewPayslip.setBounds(432, 305, 196, 49);
		
		JButton customerInfo=new JButton("View Customer Information");
		customerInfo.setBackground(new Color(0, 0, 128));
		customerInfo.setForeground(new Color(255, 255, 255));
		customerInfo.setBounds(109, 305, 204, 49);
		
		p.add(leaveReq);
		p.add(custRating);
		p.add(viewAttend);
		p.add(viewSched);
		p.add(viewPayslip);
		p.add(customerInfo);		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(106, 90, 205));
		panel.setBounds(0, 606, 818, 56);
		p.add(panel);
		panel.setLayout(null);
		
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(599, 16, 118, 24);
		panel.add(btnLogout);
		btnLogout.setBackground(new Color(255, 255, 255));
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(842, 740);
		frame.setVisible(true);
	}
	

}
