package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Catering extends UserRole {

	public void userScreen()
	{
		JFrame frame=new JFrame("Catering Staff Home Screen");
		Panel p=new Panel();
		p.setBackground(Color.DARK_GRAY);
		p.setLayout(null);
		
		JButton foodInv=new JButton("Manage Food Inventory");
		foodInv.setForeground(Color.BLUE);
		foodInv.setBounds(92, 58, 243, 49);
		
		JButton viewPayslip=new JButton("View Payslip");
		viewPayslip.setForeground(Color.BLUE);
		viewPayslip.setBounds(413, 58, 215, 49);
		
		JButton reqLeave=new JButton("Request Leave");
		reqLeave.setForeground(Color.BLUE);
		reqLeave.setBounds(92, 160, 243, 49);
		
		JButton trainingSched=new JButton("View Training Schedule");
		trainingSched.setForeground(Color.BLUE);
		trainingSched.setBounds(413, 160, 215, 49);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(494, 336, 134, 39);
		
		p.add(foodInv);
		p.add(viewPayslip);
		p.add(reqLeave);
		p.add(trainingSched);
		p.add(btnLogout);
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(727, 447);
		frame.setVisible(true);
	}
}
