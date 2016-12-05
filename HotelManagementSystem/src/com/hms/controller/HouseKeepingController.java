package com.hms.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.eclipse.swt.widgets.Text;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hms.view.*;
import com.hms.model.*;

public class HouseKeepingController implements ActionListener{
	

	private HouseKeepingView view1;
	public Text user_name;
	UpdateInventoryView upd;
	
	
	public HouseKeepingController(HouseKeepingView view1)
	{
		this.view1 = view1;
	}

	public void control()
	{
		view1.getManageSupplyInvBtn().addActionListener(this);
		view1.getLogoutButton().addActionListener(this); 
	}

	//Observes buttons clicks and responds accordingly
	public void actionPerformed(ActionEvent actionEvent)
	{
		 String command = ((JButton) actionEvent.getSource()).getActionCommand();
		 int itemNum,numSupplies;
		 switch(command)
		 {
			 case "Manage Supply Inventory":
				 ManageSupplyInvController supplyinv=new ManageSupplyInvController();
				 view1.setVisibilityFalse();
				 supplyinv.getUpdateButton().addActionListener(this);
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
				 SupplyInventory supply=new SupplyInventory();
				 supply.updateInventory(itemNum,numSupplies);
				 JFrame frame = new JFrame("Entry Updated");
				 JOptionPane.showMessageDialog(frame, "Entry Updated in Supply Inventory");
				 break;		
			 case "HOME PAGE":
				 Login l=Login.getInstance();
				 l.startSession("HouseKeeping");
				 break;
	         default:
	        	 break;
        	 		 
		 }
	}
	
}
