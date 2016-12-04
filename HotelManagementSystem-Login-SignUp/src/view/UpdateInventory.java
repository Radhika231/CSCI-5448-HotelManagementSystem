package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateInventory {

	private JFrame frame;
	private JTextField textField;
	JButton btnUpdate;
	JSpinner spinner;
	private JButton btnHomePage;


	public UpdateInventory() 
	{
		System.out.println("bla");
		frame = new JFrame("Update Inventory");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterItemNo = new JLabel("Enter Item No.:");
		lblEnterItemNo.setBounds(15, 59, 185, 26);
		frame.getContentPane().add(lblEnterItemNo);
		
		textField = new JTextField();
		textField.setBounds(221, 59, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		spinner = new JSpinner();
		spinner.setBounds(221, 101, 146, 26);
		frame.getContentPane().add(spinner);
		
		JLabel lblEnterNoOf = new JLabel("Enter No. of Supplies:");
		lblEnterNoOf.setBounds(15, 104, 166, 23);
		frame.getContentPane().add(lblEnterNoOf);
		
		btnUpdate = new JButton("SUBMIT");
		btnUpdate.setBounds(27, 174, 115, 29);
		frame.getContentPane().add(btnUpdate);
		
		btnHomePage = new JButton("HOME PAGE");
		btnHomePage.setBounds(221, 174, 146, 29);
		frame.getContentPane().add(btnHomePage);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
	public JButton getNewUpdateButton()
	{
		return btnUpdate;
	}
	public JButton getHomePage()
	{
		return btnHomePage;
	}
	public int getItemNum()
	{
		return (Integer.parseInt(textField.getText()));
	}
	public int getNumSupplies()
	{
		return (Integer) spinner.getValue();
	}

}
