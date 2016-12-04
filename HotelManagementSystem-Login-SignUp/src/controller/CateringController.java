package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

import org.eclipse.swt.widgets.Text;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.HotelManagement.HibernateUtil;

import model.*;
import view.*;

public class CateringController implements ActionListener{
	

	private Catering view1;
	
	public Text user_name;

	private ActionListener actionListener;
	static String itemN,numS;
	


	public CateringController(Catering view1)
	{
		this.view1 = view1;
	}

	public void control()
	{
		view1.getManageFoodInvBtn().addActionListener(this);
		view1.getLogoutButton().addActionListener(this); 
	}

	UpdateInventory upd;
	public void actionPerformed(ActionEvent actionEvent)
	{
		 String command = ((JButton) actionEvent.getSource()).getActionCommand();
		 int itemNum,numSupplies;
		 switch(command)
		 {
			 case "Manage Food Inventory":
				 ManageFoodInv foodinv=new ManageFoodInv();
				 foodinv.getUpdateButton().addActionListener(this);
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
				 updateFoodInventory(itemNum,numSupplies);
				 break;		
			 case "HOME PAGE":
				 Login.startSession("Catering");
				 break;
	         default:
	        	 break;
        	 		 
		 }
	}
	public void updateFoodInventory(int itemNum,int numSupplies)
	{
		 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	 String hql = "Update Inventory set itemQuantity=:numSupplies where inventory_id=:itemNum";
	 	 Session session = sessionFactory.openSession();
 		 session.beginTransaction();
    	 Query query = session.createQuery(hql);
    	 query.setParameter("itemNum", itemNum);
    	 query.setParameter("numSupplies", numSupplies);
    	 query.executeUpdate();
    	 session.close();
 		 sessionFactory.close();
 		 System.out.println("check"+itemNum+numSupplies);
	}
	
}
