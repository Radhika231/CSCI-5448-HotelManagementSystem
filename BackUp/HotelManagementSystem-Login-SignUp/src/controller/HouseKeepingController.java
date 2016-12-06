package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.eclipse.swt.widgets.Text;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.HotelManagement.HibernateUtil;

import view.*;

public class HouseKeepingController implements ActionListener{
	

	private HouseKeeping view1;
	public Text user_name;
	UpdateInventory upd;
	
	
	public HouseKeepingController(HouseKeeping view1)
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
				 ManageSupplyInv supplyinv=new ManageSupplyInv();
				 supplyinv.getUpdateButton().addActionListener(this);
				 break;
			 case "Logout":
				 System.exit(0);
				 break;
			 case "UPDATE":
				 upd=new UpdateInventory();
				 upd.getNewUpdateButton().addActionListener(this);
				 upd.getHomePage().addActionListener(this);
				 break;
			 case "SUBMIT":
				 itemNum=upd.getItemNum();
				 numSupplies=upd.getNumSupplies();
				 updateSupplyInventory(itemNum,numSupplies);
				 break;		
			 case "HOME PAGE":
				 Login.startSession("HouseKeeping");
				 break;
	         default:
	        	 break;
        	 		 
		 }
	}
	
	//Updates Supply Inventory
	public void updateSupplyInventory(int itemNum,int numSupplies)
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	 String hql = "Update SupplyInventory set itemQuantity=:numSupplies where inventory_id=:itemNum";
	 	 Session session = sessionFactory.openSession();
 		 session.beginTransaction();
    	 Query query = session.createQuery(hql);
    	 query.setParameter("itemNum", itemNum);
    	 query.setParameter("numSupplies", numSupplies);
    	 query.executeUpdate();
    	 session.close();
 		 sessionFactory.close();
	}
	
}
