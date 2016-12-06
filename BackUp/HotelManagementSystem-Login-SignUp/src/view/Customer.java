package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

//Factory Design Pattern
public class Customer extends UserRole {
	
	//Display home screen for customer using factory method
	public void userScreen()
	{
		JFrame frame=new JFrame("Customer Home Screen");
		Panel p=new Panel();
		p.setBackground(Color.DARK_GRAY);
		p.setLayout(null);
		
		JButton makeReserv=new JButton("Make Reservation");
		makeReserv.setForeground(Color.BLUE);
		makeReserv.setBounds(67, 58, 204, 49);
		
		JButton orderFood=new JButton("Order Food");
		orderFood.setForeground(Color.BLUE);
		orderFood.setBounds(404, 58, 204, 49);
		
		JButton viewBill=new JButton("View Bill");
		viewBill.setForeground(Color.BLUE);
		viewBill.setBounds(67, 142, 204, 49);
		
		JButton giveRating=new JButton("Give Rating");
		giveRating.setForeground(Color.BLUE);
		giveRating.setBounds(404, 142, 204, 49);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(495, 336, 134, 39);
	
		
		p.add(makeReserv);
		p.add(orderFood);
		p.add(viewBill);
		p.add(giveRating);
		p.add(btnLogout);
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(727, 447);
		frame.setVisible(true);
	}
}
