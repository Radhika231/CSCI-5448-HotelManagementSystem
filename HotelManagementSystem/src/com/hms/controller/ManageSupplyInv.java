package com.hms.controller;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hms.view.*;
import com.hms.model.*;


public class ManageSupplyInv {
	
	private List<Inventory> inventoryList;
	JButton update;
	
	//Gets Supply inventory data from database and displays view
	public ManageSupplyInv()
	{
	
		 Inventory inv =new SupplyInventory();
 		 inventoryList = inv.getInventoryTable();
		 
 		 
		   String[] columns = new String[] {"Item No.", "Item", "No. of Items", "Place Order"};
	        int size=(int)inventoryList.size();
	        
	        //actual data for the table in a 2d array
	        Object[][] data = new Object[size][4];
	        int index=0;
	     
	        if(inventoryList.size() > 0)
			{
				for(Inventory inventory : inventoryList)
				{	
					data[index][0]= inventory.getInventory_id();
					data[index][1] = inventory.getItemName();
					data[index][2] = inventory.getItemQuantity();
					data[index][3] = inventory.getNeedsToBeOrdered();
					index++;
				}
	        	
	        	
			}
	        
	        //Create view
	        //Passes parameters for JTable from Supply Inventory table
	        createSupplyInventoryView(data,columns);		
			
	}
	
	
	private void createSupplyInventoryView(Object[][] data, String[] columns) 
	{
		// TODO Auto-generated method stub
		 JFrame frame=new JFrame("Supply Inventory");
	     JPanel mainPanel = new JPanel();
	     mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

	     JPanel panel1 = new JPanel();
	     JPanel panel2 = new JPanel();

	     mainPanel.add(panel1);
	     mainPanel.add(panel2);
	     panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
	     JTable table = new JTable(data, columns);
	     JScrollPane scrollPane = new JScrollPane(table);
	     panel1.add(scrollPane);
	     
	     update=new JButton("UPDATE");
	     update.setHorizontalAlignment(SwingConstants.RIGHT);
	     update.setVerticalAlignment(SwingConstants.BOTTOM);
	     panel2.add(update);
	     frame.getContentPane().add(mainPanel,BorderLayout.CENTER);
			
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(554, 319);
		 frame.setVisible(true);
		
	}
	
	public JButton getUpdateButton()
	{
		return update;
	}
	
	
	 

}
