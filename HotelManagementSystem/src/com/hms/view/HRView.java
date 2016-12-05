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
public class HRView extends UserRole{
	
	//Display home screen for HR using Factory Method
	/**
	 * @wbp.parser.entryPoint
	 */
	public void userScreen()
	{
		ImageIcon iconX = new ImageIcon(getClass().getResource("/images/hotelimage1.jpg"));
		JFrame frame=new JFrame("HR Home Screen");
		Panel p=new Panel();
		p.setBackground(new Color(240, 230, 140));
		p.setLayout(null);
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel(iconX);
		p.add(lblNewLabel);
		lblNewLabel.setBounds(0, 0, 820, 273);
		
		JButton createPayslip=new JButton("Create Payslip");
		createPayslip.setForeground(new Color(255, 255, 255));
		createPayslip.setBackground(new Color(0, 0, 128));
		createPayslip.setBounds(87, 394, 243, 49);
		p.add(createPayslip);
		
		JButton organizeTraining=new JButton("Organize Training");
		organizeTraining.setBackground(new Color(0, 0, 128));
		organizeTraining.setForeground(new Color(255, 255, 255));
		organizeTraining.setBounds(448, 314, 227, 49);
		
		JButton reqLeave=new JButton("Request Leave");
		reqLeave.setBackground(new Color(0, 0, 128));
		reqLeave.setForeground(new Color(255, 255, 255));
		reqLeave.setBounds(87, 490, 243, 49);
		
		JButton trainingSched=new JButton("View Training Schedule");
		trainingSched.setBackground(new Color(0, 0, 128));
		trainingSched.setForeground(new Color(255, 255, 255));
		trainingSched.setBounds(446, 394, 221, 49);
		
		JButton empInfo=new JButton("View Employee Information");
		empInfo.setBackground(new Color(0, 0, 128));
		empInfo.setForeground(new Color(255, 255, 255));
		empInfo.setBounds(87, 314, 243, 49);
		
		p.add(createPayslip);
		p.add(organizeTraining);
		p.add(reqLeave);
		p.add(trainingSched);
		p.add( empInfo);
		
		
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
