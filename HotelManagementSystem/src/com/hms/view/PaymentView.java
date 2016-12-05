package com.hms.view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class PaymentView {

	private JFrame frame;
	private JLabel lblPaymentTo;
	private JLabel lblPayFor;
	private JLabel lblCurrency;
	private JLabel lblAmount;
	private JLabel lblPaymentDetails;
	private JLabel lblXyzHotel;
	private JLabel lblRoomBooking;
	private JLabel lblNewLabel;
	private JLabel AmountLabel;
	private JPanel panel_1;
	private JLabel lblCardDetails;
	private JLabel lblCa;
	private JEditorPane cardNumberPane,nameHolderPane,cvvPane,expiryMonthPane,expiryYearPane;
	private JLabel lblExpir;
	JButton btnSubmit;
	
	

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	public JEditorPane getCvvPane() {
		return cvvPane;
	}

	public JEditorPane getExpiryMonthPane() {
		return expiryMonthPane;
	}

	public JEditorPane getExpiryYearPane() {
		return expiryYearPane;
	}

	public JEditorPane getCardNumberPane() {
		return cardNumberPane;
	}

	public JEditorPane getNameHolderPane() {
		return nameHolderPane;
	}
	

	public JLabel getAmountLabel() {
		return AmountLabel;
	}

	public void setAmountLabel(JLabel amountLabel) {
		AmountLabel = amountLabel;
	}
	
	
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Create the application.
	 */
	public PaymentView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBackground(SystemColor.window);
		frame.setBounds(200, 150, 600, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocation(450, 200);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		panel.setBounds(12, 5, 576, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblPaymentTo = new JLabel("Pay To:");
		lblPaymentTo.setBounds(193, 47, 70, 15);
		panel.add(lblPaymentTo);
		
		lblPayFor = new JLabel("Pay For:");
		lblPayFor.setBounds(193, 67, 70, 15);
		panel.add(lblPayFor);
		
		lblCurrency = new JLabel("Currency:");
		lblCurrency.setBounds(193, 87, 70, 15);
		panel.add(lblCurrency);
		
		lblAmount = new JLabel("Amount:");
		lblAmount.setBounds(193, 107, 70, 15);
		panel.add(lblAmount);
		
		lblPaymentDetails = new JLabel("Payment Details");
		lblPaymentDetails.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPaymentDetails.setBounds(12, 12, 171, 26);
		panel.add(lblPaymentDetails);
		
		lblXyzHotel = new JLabel("XYZ Hotel");
		lblXyzHotel.setBounds(275, 47, 70, 15);
		panel.add(lblXyzHotel);
		
		lblRoomBooking = new JLabel("Room Booking");
		lblRoomBooking.setBounds(275, 67, 108, 15);
		panel.add(lblRoomBooking);
		
		lblNewLabel = new JLabel("U.S Dollars");
		lblNewLabel.setBounds(275, 87, 96, 15);
		panel.add(lblNewLabel);
		
		AmountLabel = new JLabel("SetAmount");
		AmountLabel.setBounds(275, 107, 70, 15);
		panel.add(AmountLabel);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		panel_1.setBounds(12, 166, 576, 322);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblCardDetails = new JLabel("Card Details");
		lblCardDetails.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCardDetails.setBounds(12, 12, 125, 35);
		panel_1.add(lblCardDetails);
		
		lblCa = new JLabel("Card Number");
		lblCa.setBounds(131, 56, 110, 21);
		panel_1.add(lblCa);
		
		cardNumberPane = new JEditorPane();
		cardNumberPane.setBounds(280, 56, 180, 21);
		panel_1.add(cardNumberPane);
		
		lblExpir = new JLabel("Expiry Date (MM)");
		lblExpir.setBounds(131, 108, 133, 15);
		panel_1.add(lblExpir);
		
		expiryMonthPane = new JEditorPane();
		expiryMonthPane.setBounds(280, 102, 40, 21);
		panel_1.add(expiryMonthPane);
		
		JLabel label = new JLabel("/");
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBounds(327, 102, 18, 21);
		panel_1.add(label);
		
		expiryYearPane = new JEditorPane();
		expiryYearPane.setBounds(340, 102, 60, 21);
		panel_1.add(expiryYearPane);
		
		JLabel lblCvvNumber = new JLabel("CVV");
		lblCvvNumber.setBounds(131, 162, 70, 15);
		panel_1.add(lblCvvNumber);
		
		cvvPane = new JEditorPane();
		cvvPane.setBounds(280, 156, 40, 21);
		panel_1.add(cvvPane);
		
		JLabel lblNameOnCard = new JLabel("Name on Card");
		lblNameOnCard.setBounds(131, 216, 125, 21);
		panel_1.add(lblNameOnCard);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(260, 280, 117, 25);
		panel_1.add(btnSubmit);
		
		nameHolderPane = new JEditorPane();
		nameHolderPane.setBounds(280, 216, 180, 21);
		panel_1.add(nameHolderPane);
	}

}
