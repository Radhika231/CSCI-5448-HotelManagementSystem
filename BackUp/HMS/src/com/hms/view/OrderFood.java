package com.hms.view;
import com.hms.controller.*;
import com.hms.model.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import java.awt.Button;
import javax.swing.JEditorPane;
import java.awt.Scrollbar;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class OrderFood {

	public JFrame frame;
	
	//button
	private JButton btnConfirmOrder;
	private JButton btnGoBack;
	
	//Spinner
	private JSpinner spinnera1;
	private JSpinner spinnera2;
	private JSpinner spinnera3;
	private JSpinner spinnera4;
	private JSpinner spinnera5;
	private JSpinner spinnera6;
	private JSpinner spinnerm1;
	private JSpinner spinnerm2;
	private JSpinner spinnerm3;
	private JSpinner spinnerm4;
	private JSpinner spinnerm5;
	private JSpinner spinnerm6;
	private JCheckBox chckbxDineIn;
	private JCheckBox chckbxTakeAway;
	
	//Labels
	private JLabel lblMenu;
	private JLabel lblEa;
	private JLabel lblEb;
	private JLabel lblEc;
	private JLabel lblEd;
	private JLabel lblEe;
	private JLabel lblEf;
	private JLabel lblMa;
	private JLabel lblMb;
	private JLabel lblMc;
	private JLabel lblMd;
	private JLabel lblMe;
	private JLabel lblMf;
	private JButton btnGoAhead;
	private JButton btnCancel;
	
	//panel
	private JPanel panelReview;
	private JPanel panelEntree;
	private JPanel panelSides;
	private JPanel panelDone;
	private JLabel lblBill;
	private JLabel lblStatus;
	

	
	
	// Create the application.

	public OrderFood() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		lblMenu = new JLabel("MENU");
		lblMenu.setBounds(480, 99, 70, 15);
		frame.getContentPane().add(lblMenu);
		
		panelEntree = new JPanel();
		panelEntree.setBounds(46, 201, 339, 250);
		frame.getContentPane().add(panelEntree);
		panelEntree.setLayout(null);
		
		spinnera1 = new JSpinner();
		spinnera1.setBounds(285, 25, 28, 20);
		panelEntree.add(spinnera1);
		
		lblEa = new JLabel("Samosa Chaat");
		lblEa.setBounds(12, 25, 263, 15);
		panelEntree.add(lblEa);
		
		lblEb = new JLabel("Papdi Chaat");
		lblEb.setBounds(12, 52, 263, 15);
		panelEntree.add(lblEb);
		
		lblEc = new JLabel("Paneer Tikka");
		lblEc.setBounds(12, 79, 197, 15);
		panelEntree.add(lblEc);
		
		spinnera2 = new JSpinner();
		spinnera2.setBounds(285, 52, 28, 20);
		panelEntree.add(spinnera2);
		
		spinnera3 = new JSpinner();
		spinnera3.setBounds(285, 79, 28, 20);
		panelEntree.add(spinnera3);
		
		lblEd = new JLabel("Chicken 65");
		lblEd.setBounds(12, 106, 197, 15);
		panelEntree.add(lblEd);
		
		spinnera4 = new JSpinner();
		spinnera4.setBounds(285, 106, 28, 20);
		panelEntree.add(spinnera4);
		
		lblEe = new JLabel("Caramelized Onion Dip");
		lblEe.setBounds(12, 133, 210, 15);
		panelEntree.add(lblEe);
		
		spinnera5 = new JSpinner();
		spinnera5.setBounds(285, 133, 28, 20);
		panelEntree.add(spinnera5);
		
		lblEf = new JLabel("Hogs in a blanket");
		lblEf.setBounds(12, 160, 197, 15);
		panelEntree.add(lblEf);
		
		spinnera6 = new JSpinner();
		spinnera6.setBounds(285, 160, 28, 20);
		panelEntree.add(spinnera6);
		
		JLabel lblAppetizers = new JLabel("Appetizers");
		lblAppetizers.setBounds(114, 0, 134, 15);
		panelEntree.add(lblAppetizers);
		
		panelSides = new JPanel();
		panelSides.setBounds(550, 201, 339, 250);
		frame.getContentPane().add(panelSides);
		panelSides.setLayout(null);
		
		lblMa = new JLabel("Chicken Biriyani");
		lblMa.setBounds(12, 25, 180, 15);
		panelSides.add(lblMa);
		
		spinnerm1 = new JSpinner();
		spinnerm1.setBounds(285, 25, 28, 20);
		panelSides.add(spinnerm1);
		
		lblMb = new JLabel("Rava Masala Dosa");
		lblMb.setBounds(12, 52, 233, 15);
		panelSides.add(lblMb);
		
		spinnerm2 = new JSpinner();
		spinnerm2.setBounds(285, 52, 28, 20);
		panelSides.add(spinnerm2);
		
		lblMc = new JLabel("Vegetable Pulow");
		lblMc.setBounds(12, 79, 210, 15);
		panelSides.add(lblMc);
		
		spinnerm3 = new JSpinner();
		spinnerm3.setBounds(285, 79, 28, 20);
		panelSides.add(spinnerm3);
		
		lblMd = new JLabel("Alfredo Pasta");
		lblMd.setBounds(12, 106, 166, 15);
		panelSides.add(lblMd);
		
		spinnerm4 = new JSpinner();
		spinnerm4.setBounds(285, 106, 28, 20);
		panelSides.add(spinnerm4);
		
		lblMe = new JLabel("American Chopsuey");
		lblMe.setBounds(12, 132, 180, 15);
		panelSides.add(lblMe);
		
		spinnerm5 = new JSpinner();
		spinnerm5.setBounds(285, 130, 28, 20);
		panelSides.add(spinnerm5);
		
		lblMf = new JLabel("Smoked American Veg Sandwich");
		lblMf.setBounds(12, 159, 233, 15);
		panelSides.add(lblMf);
		
		spinnerm6 = new JSpinner();
		spinnerm6.setBounds(285, 160, 28, 20);
		panelSides.add(spinnerm6);
		
		JLabel lblMainCourse = new JLabel("Main Course");
		lblMainCourse.setBounds(149, 12, 118, 15);
		panelSides.add(lblMainCourse);
		
		chckbxDineIn = new JCheckBox("Dine In");
		chckbxDineIn.setSelected(true);
		chckbxDineIn.setBounds(46, 35, 129, 23);
		frame.getContentPane().add(chckbxDineIn);
		
		chckbxTakeAway = new JCheckBox("Take Away");
		chckbxTakeAway.setBounds(46, 8, 129, 23);
		frame.getContentPane().add(chckbxTakeAway);
		
		panelReview = new JPanel();
		panelReview.setBounds(672, 34, 328, 80);
		frame.getContentPane().add(panelReview);
		panelReview.setLayout(null);
		
		btnGoAhead = new JButton("Go Ahead");
		btnGoAhead.setBounds(12, 0, 117, 25);
		panelReview.add(btnGoAhead);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(186, 0, 117, 25);
		panelReview.add(btnCancel);
		
		btnConfirmOrder = new JButton("Confirm Order");
		btnConfirmOrder.setBounds(0, 0, 149, 25);
		panelReview.add(btnConfirmOrder);
		
		btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(167, 0, 149, 25);
		panelReview.add(btnGoBack);
		
		panelDone = new JPanel();
		panelDone.setBounds(351, 182, 298, 120);
		frame.getContentPane().add(panelDone);
		panelDone.setLayout(null);
		
		JLabel lblCongratulations = new JLabel("Congratulations!");
		lblCongratulations.setBounds(83, 12, 136, 15);
		panelDone.add(lblCongratulations);
		
		JLabel lblFoodOrdered = new JLabel("Food Ordered!");
		lblFoodOrdered.setBounds(97, 41, 122, 15);
		panelDone.add(lblFoodOrdered);
		
		lblStatus = new JLabel("status");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(0, 55, 298, 15);
		panelDone.add(lblStatus);
		
		lblBill = new JLabel("Bill");
		lblBill.setBounds(424, 123, 167, 15);
		lblBill.setVisible(false);
		frame.getContentPane().add(lblBill);
		btnGoAhead.setVisible(false);
		btnCancel.setVisible(false);
		
		panelDone.setVisible(false);
		
	}

	

	public JButton getBtnConfirmOrder() {
		return btnConfirmOrder;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JButton getBtnGoBack() {
		return btnGoBack;
	}

	public JSpinner getSpinnera1() {
		return spinnera1;
	}

	public JSpinner getSpinnera2() {
		return spinnera2;
	}

	public JSpinner getSpinnera3() {
		return spinnera3;
	}

	public JSpinner getSpinnera4() {
		return spinnera4;
	}

	public JSpinner getSpinnera5() {
		return spinnera5;
	}

	public JSpinner getSpinnera6() {
		return spinnera6;
	}

	public JSpinner getSpinnerm1() {
		return spinnerm1;
	}

	public JSpinner getSpinnerm2() {
		return spinnerm2;
	}

	public JSpinner getSpinnerm3() {
		return spinnerm3;
	}

	public JSpinner getSpinnerm4() {
		return spinnerm4;
	}

	public JSpinner getSpinnerm5() {
		return spinnerm5;
	}

	public JSpinner getSpinnerm6() {
		return spinnerm6;
	}

	public JCheckBox getChckbxDineIn() {
		return chckbxDineIn;
	}

	public JCheckBox getChckbxTakeAway() {
		return chckbxTakeAway;
	}

	public JLabel getLblEa() {
		return lblEa;
	}

	public JLabel getLblEb() {
		return lblEb;
	}

	public JLabel getLblEc() {
		return lblEc;
	}

	public JLabel getLblEd() {
		return lblEd;
	}

	public JLabel getLblEe() {
		return lblEe;
	}

	public JLabel getLblEf() {
		return lblEf;
	}

	public JLabel getLblMa() {
		return lblMa;
	}

	public JLabel getLblMb() {
		return lblMb;
	}

	public JLabel getLblMc() {
		return lblMc;
	}

	public JLabel getLblMd() {
		return lblMd;
	}

	public JLabel getLblMe() {
		return lblMe;
	}

	public JLabel getLblMf() {
		return lblMf;
	}

	public JButton getBtnGoAhead() {
		return btnGoAhead;
	}

	public JButton getbtnCancel() {
		return btnCancel;
	}

	public JPanel getPanelReview() {
		return panelReview;
	}

	public JPanel getPanelEntree() {
		return panelEntree;
	}

	public JPanel getPanelSides() {
		return panelSides;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public JPanel getPanelDone() {
		return panelDone;
	}

	public JLabel getLblMenu() {
		return lblMenu;
	}

	public JLabel getLblBill() {
		return lblBill;
	}

	public JLabel getLblStatus() {
		return lblStatus;
	}
}
