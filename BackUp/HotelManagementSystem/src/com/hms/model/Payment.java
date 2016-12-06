package com.hms.model;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.hms.model.CreditCardTable;
import com.hms.model.RoomTable;

public class Payment {
	
	
	
	public Payment(){
		
	}
	
	
	public  List<CreditCardTable> getCardTable(Session session, String cardNumber)
	{		
		String hibernateQuery = "FROM CreditCardTable AS E WHERE E.cardNumber =:cardnumber";
		Query query 		  = session.createQuery(hibernateQuery);
		query.setParameter("cardnumber",cardNumber);
			
		List <CreditCardTable> creditCardList = ((org.hibernate.Query) query).list();
		
		System.out.println("Credit Card List:" + creditCardList.size());
		return creditCardList;	
		
	}	
	
	public void updateCardTable(Session session, String cardNumber,double Payment)
	{
		System.out.println("In Update Card Table");
		String hibernateQuery = "UPDATE CreditCardTable set totalPayment=:payment WHERE cardNumber =:cardnumber";
		Query query = session.createQuery(hibernateQuery);
		query.setParameter("cardnumber",cardNumber);
		query.setParameter("payment",Payment);		
		int result = query.executeUpdate();
		System.out.println("Credit Rows affected: " + result);	

		
		
		
	}

}
