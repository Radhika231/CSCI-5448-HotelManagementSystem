package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

//Factory Design Pattern
public class HR extends UserRole{
	
	public void userScreen()
	{
		JFrame frame=new JFrame("HR Home Screen");
		Panel p=new Panel();
		p.setBackground(Color.DARK_GRAY);
		p.setLayout(null);
		
		JButton createPayslip=new JButton("Create Payslip");
		createPayslip.setForeground(Color.BLUE);
		createPayslip.setBounds(92, 58, 243, 49);
		
		JButton organizeTraining=new JButton("Organize Training");
		organizeTraining.setForeground(Color.BLUE);
		organizeTraining.setBounds(413, 58, 215, 49);
		
		JButton reqLeave=new JButton("Request Leave");
		reqLeave.setForeground(Color.BLUE);
		reqLeave.setBounds(92, 160, 243, 49);
		
		JButton trainingSched=new JButton("View Training Schedule");
		trainingSched.setForeground(Color.BLUE);
		trainingSched.setBounds(413, 160, 215, 49);
		
		JButton empInfo=new JButton("View Employee Information");
		empInfo.setForeground(Color.BLUE);
		empInfo.setBounds(92, 259, 243, 49);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(494, 336, 134, 39);
		
		p.add(createPayslip);
		p.add(organizeTraining);
		p.add(reqLeave);
		p.add(trainingSched);
		p.add( empInfo);
		p.add(btnLogout);
		
		
		frame.getContentPane().add(p,BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(727, 447);
		frame.setVisible(true);
	}
}
