import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.HotelManagement.dBClasses.CreditCardTable;
import com.HotelManagement.dBClasses.RoomTable;

public class PaymentPageModel {
	
	
	
	public PaymentPageModel(){
		
	}
	
	
	public  List<CreditCardTable> getCardTable(Session session, String cardNumber)
	{		
		String hibernateQuery = "FROM CreditCardTable AS E WHERE E.cardNumber =:cardnumber";
		Query query 		  = session.createQuery(hibernateQuery);
		query.setParameter("cardnumber",cardNumber);
			
		List <CreditCardTable> creditCardList = ((org.hibernate.Query) query).list();
		
		//System.out.println("RoomList:" + creditCardList.size());
		return creditCardList;	
		
	}	
	
	public void updateCardTable(Session session, String cardNumber,double Payment)
	{
		String hibernateQuery = "UPDATE CreditCardTable set totalPayment=:payment WHERE cardNumber =:cardnumber";
		Query query = session.createQuery(hibernateQuery);
		query.setParameter("cardnumber",cardNumber);
		query.setParameter("payment",Payment);		
		int result = query.executeUpdate();
		
		
		
	}

}
