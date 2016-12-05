package com.hms.controller;

import com.hms.view.*;
import com.hms.model.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.eclipse.swt.widgets.Text;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CateringController implements ActionListener{
	

	private CateringView view1;
	public Text user_name;
	UpdateInventoryView upd;
	
   
	public CateringController(CateringView view1)
	{
		this.view1 = view1;
	}

	//Controls button clicks Manage Food Inventory and Logout
	public void control()
	{
		view1.getManageFoodInvBtn().addActionListener(this);
		view1.getLogoutButton().addActionListener(this); 
	}

	
	//Observes button clicks and performs necessary actions
	public void actionPerformed(ActionEvent actionEvent)
	{
		 String command = ((JButton) actionEvent.getSource()).getActionCommand();
		 int itemNum,numSupplies;
		 
		 switch(command)
		 {
			 case "Manage Food Inventory":
				 ManageFoodInvController foodinv=new ManageFoodInvController();
				 foodinv.getUpdateButton().addActionListener(this);
				 break;
			 case "Logout":
				 System.exit(0);
				 break;
			 case "UPDATE":
				 upd=new UpdateInventoryView();
				 upd.getNewUpdateButton().addActionListener(this);
				 upd.getHomePage().addActionListener(this);
				 break;
			 case "SUBMIT":
				 itemNum=upd.getItemNum();
				 numSupplies=upd.getNumSupplies();
				 FoodInventory food=new FoodInventory();
				 food.updateInventory(itemNum, numSupplies);
				 break;		
			 case "HOME PAGE":
				 Login.startSession("Catering");
				 break;
	         default:
	        	 break;
        	 		 
		 }
	}
	
}
