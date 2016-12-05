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
public class CustomerView extends UserRole {
	
	private JButton makeReserv;
	private JButton orderFood;
	private JButton btnLogout;
	public JFrame frame;
	
	//Display home screen for customer using factory method
	/**
	 * @wbp.parser.entryPoint
	 */
	
	/*public CustomerView(){
		userScreen();
	}*/
	
	public void userScreen()
	{
		ImageIcon iconX = new ImageIcon(getClass().getResource("/images/hotelimage1.jpg"));
		JFrame frame=new JFrame("Customer Home Screen");
		Panel p=new Panel();
		p.setBackground(new Color(240, 230, 140));
		p.setLayout(null);
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		JLabel lblNewLabel = new JLabel(iconX);
		p.add(lblNewLabel);
		lblNewLabel.setBounds(0, 0, 820, 273);
		
		makeReserv=new JButton("Make Reservation");
		makeReserv.setBackground(new Color(0, 0, 128));
		makeReserv.setBounds(126, 329, 204, 49);
		p.add(makeReserv);
		makeReserv.setForeground(new Color(255, 255, 255));
		
		orderFood=new JButton("Order Food");
		orderFood.setBackground(new Color(0, 0, 128));
		orderFood.setBounds(510, 329, 204, 49);
		p.add(orderFood);
		orderFood.setForeground(new Color(255, 255, 255));
		
		JButton viewBill=new JButton("View Bill");
		viewBill.setBackground(new Color(0, 0, 128));
		viewBill.setBounds(126, 432, 204, 49);
		p.add(viewBill);
		viewBill.setForeground(new Color(255, 255, 255));
		
		JButton giveRating=new JButton("Give Rating");
		giveRating.setBackground(new Color(0, 0, 128));
		giveRating.setBounds(510, 432, 204, 49);
		p.add(giveRating);
		giveRating.setForeground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(106, 90, 205));
		panel.setBounds(0, 606, 818, 56);
		p.add(panel);
		panel.setLayout(null);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(599, 16, 118, 24);
		panel.add(btnLogout);
		btnLogout.setBackground(new Color(255, 255, 255));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(842, 740);
		frame.setVisible(true);
	}

	public JButton getMakeReserv() {
		return makeReserv;
	}

	public JButton getOrderFood() {
		return orderFood;
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}
}
