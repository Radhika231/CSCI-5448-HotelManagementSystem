package com.hms.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hms.model.CreditCardTable;
import com.hms.view.*;
import com.hms.model.*;

public class PaymentController implements ActionListener {
	
	
	private PaymentView  paymentPageView;
	private Payment  paymentPageModel;
	private Session session = null;	
	JTable showAvailtable;	
	private List<CreditCardTable> creditCardList;
	
	

	
	public PaymentController(PaymentView paymentPageView, Payment paymentPageModel) {
		
		this.paymentPageView = paymentPageView;
		this.paymentPageModel = paymentPageModel;
		//this.roomBookingModel = roomBookingModel;
	}


	public void paymentControl(){
		paymentPageView.getBtnSubmit().addActionListener(this);
	}


	public Session createSqlConnection(){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		return session;
	}
	
	

	
	public void processPayment(ActionEvent actionEvent)
	{
	
		System.out.println("In Payment COntroller");
		
		//paymentPageView.getFrame().setVisible(false);
		String cardNumber 		= paymentPageView.getCardNumberPane().getText();
		String expiryMonth 		= paymentPageView.getExpiryMonthPane().getText();
		String expiryYear   	= paymentPageView.getExpiryYearPane().getText();
		String cvv				= paymentPageView.getCvvPane().getText();
		String cardHolderName	= paymentPageView.getNameHolderPane().getText();
		JFrame frame = new JFrame();
		double totalPrice;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		System.out.println(cardNumber);
		System.out.println(expiryYear);
		System.out.println(expiryMonth);
		System.out.println(cvv);
		System.out.println(cardHolderName);
		
		session = createSqlConnection();
		
		creditCardList = paymentPageModel.getCardTable(session,cardNumber);
		

		if(creditCardList.size() == 0){
			JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
		
			RoomBookingController.updatedB(false);
		}
			
		
		
		
		for(CreditCardTable creditCardTable: creditCardList)
		{
					
			if (!creditCardTable.getCardHolderName().equals((String)cardHolderName))
			{
				JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
				RoomBookingController.updatedB(false);
			}
							
			else if(!creditCardTable.getCvv().equals((String)cvv))
			{
				JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
				RoomBookingController.updatedB(false);
			}				
			else if(!creditCardTable.getExpiryMonth().equals((String)expiryMonth))
			{
				JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
				RoomBookingController.updatedB(false);
			}
			else if(!creditCardTable.getExpiryYear().equals((String)expiryYear))
			{
				JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
				RoomBookingController.updatedB(false);
			}
			
			else
			{
				System.out.println("Payment Successful, Enjoy your Stay");
				JOptionPane.showMessageDialog(frame, "Payment Successful, Enjoy your Stay");
				totalPrice = Double.parseDouble((String)(paymentPageView.getAmountLabel().getText()));
				paymentPageModel.updateCardTable(session,cardNumber,totalPrice);
				paymentPageView.getFrame().setVisible(false);
				session.close();
				RoomBookingController.updatedB(true);
				
			}
		}

	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		// TODO Auto-generated method stub
		processPayment(actionEvent);
	}

}
