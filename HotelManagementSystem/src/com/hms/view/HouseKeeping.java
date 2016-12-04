package com.hms.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.hms.model.UserRole;

//Factory Design Pattern
public class HouseKeeping extends UserRole {
	
	JButton supplyInv,btnLogout;
	
	//display home screen for House Keeping Staff using Factory Method
	public void userScreen()
	{
		JFrame frame=new JFrame("HouseKeeping Staff Home Screen");
		Panel p=new Panel();
		p.setBackground(Color.DARK_GRAY);
		p.setLayout(null);
		
		supplyInv=new JButton("Manage Supply Inventory");
		supplyInv.setForeground(Color.BLUE);
		supplyInv.setBounds(92, 58, 243, 49);
		
		JButton viewPayslip=new JButton("View Payslip");
		viewPayslip.setForeground(Color.BLUE);
		viewPayslip.setBounds(413, 58, 215, 49);
		
		JButton reqLeave=new JButton("Request Leave");
		reqLeave.setForeground(Color.BLUE);
		reqLeave.setBounds(92, 160, 243, 49);
		
		JButton trainingSched=new JButton("View Training Schedule");
		trainingSched.setForeground(Color.BLUE);
		trainingSched.setBounds(413, 160, 215, 49);
		
		btnLogout = new JButton("Logout");
		btnLogout.setBounds(494, 336, 134, 39);
		
		p.add(supplyInv);
		p.add(viewPayslip);
		p.add(reqLeave);
		p.add(trainingSched);
		p.add(btnLogout);
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(727, 447);
		frame.setVisible(true);
	}
	
	//Notify about button click updates to Observers
	public JButton getManageSupplyInvBtn()
	{
		return supplyInv;
	}
	public JButton getLogoutButton()
	{
		return btnLogout;
	}

}
