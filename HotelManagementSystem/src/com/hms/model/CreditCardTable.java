package com.hms.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class CreditCardTable {
		
	@Id
	private String cardNumber;
	private String expiryMonth, expiryYear;
	private String cardHolderName;
	private double totalPayment;
	private String cvv;
	
	
	
	public CreditCardTable(){
		
	}
	
	
	
	public CreditCardTable(String cardNumber, String expiryMonth, String expiryYear, String cardHolderName,
			double totalPayment, String cvv) {
		super();
		this.cardNumber = cardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cardHolderName = cardHolderName;
		this.totalPayment = totalPayment;
		this.cvv = cvv;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public String getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	
	
	
	
}