package com.hms.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CateringView extends UserRole {

	JButton foodInv;
	JButton btnLogout;
	
	//Home Screen View for Catering Staff using factory method
	/**
	 * @wbp.parser.entryPoint
	 */
	public void userScreen()
	{
		ImageIcon iconX = new ImageIcon(getClass().getResource("/images/hotelimage1.jpg"));
		JFrame frame=new JFrame("Catering Staff Home Screen");
		Panel p=new Panel();
		p.setBackground(new Color(240, 230, 140));
		p.setLayout(null);
		frame.setLocation(400, 50);
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel(iconX);
		p.add(lblNewLabel);
		lblNewLabel.setBounds(0, 0, 820, 273);
		
		foodInv=new JButton("Manage Food Inventory");
		foodInv.setForeground(new Color(255, 255, 255));
		foodInv.setBackground(new Color(0, 0, 128));
		foodInv.setBounds(126, 329, 204, 49);
		
		
		JButton viewPayslip=new JButton("View Payslip");
		viewPayslip.setBackground(new Color(0, 0, 128));
		viewPayslip.setForeground(new Color(255, 255, 255));
		viewPayslip.setBounds(126, 425, 204, 49);
		
		JButton reqLeave=new JButton("Request Leave");
		reqLeave.setBackground(new Color(0, 0, 128));
		reqLeave.setForeground(new Color(255, 255, 255));
		reqLeave.setBounds(442, 329, 215, 49);
		
		JButton trainingSched=new JButton("View Training Schedule");
		trainingSched.setBackground(new Color(0, 0, 128));
		trainingSched.setForeground(new Color(255, 255, 255));
		trainingSched.setBounds(442, 425, 215, 49);
		
		p.add(foodInv);
		p.add(viewPayslip);
		p.add(reqLeave);
		p.add(trainingSched);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(106, 90, 205));
		panel.setBounds(0, 606, 818, 56);
		p.add(panel);
		panel.setLayout(null);
		
		btnLogout = new JButton("Logout");
		btnLogout.setBounds(599, 16, 118, 24);
		panel.add(btnLogout);
		btnLogout.setBackground(new Color(255, 255, 255));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(842, 740);
		frame.setVisible(true);
		
		
	}
	
    //Notify about button click updates to Observers
	
	public JButton getManageFoodInvBtn()
	{
		return foodInv;
	}
	public JButton getLogoutButton()
	{
		return btnLogout;
	}
	
}
