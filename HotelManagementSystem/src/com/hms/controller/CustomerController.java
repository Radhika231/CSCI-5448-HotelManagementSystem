package com.hms.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.hms.model.Bill;
import com.hms.model.CustomerModel;
import com.hms.model.Food;
import com.hms.model.Room;
import com.hms.view.*;

public class CustomerController implements ActionListener{
	private CustomerView viewCustomer;
	
	public CustomerController(CustomerView view){
		viewCustomer = view;
	}
	public void control(){
		viewCustomer.getMakeReserv().addActionListener(this);
		viewCustomer.getOrderFood().addActionListener(this);
		viewCustomer.getBtnLogout().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String action = ((JButton) actionEvent.getSource()).getActionCommand();//actionEvent.getActionCommand().toString();
		System.out.println("Action : " + action);
		
		//order food
		if(action.equalsIgnoreCase("Order Food")){
			viewCustomer.frame.setVisible(false);
			OrderFoodView orderFoodView = new OrderFoodView();
			orderFoodView.frame.setVisible(true);
			
			Food _food = new Food();
			CustomerModel _cust = new CustomerModel();
			OrderFoodController orderFoodController = new OrderFoodController(orderFoodView, _food, _cust);
			orderFoodController.control();
		}
		
		//Room booking
		if(action.equalsIgnoreCase("Make Reservation")){
			viewCustomer.frame.setVisible(false);
			RoomBookingView roomBookingView = new RoomBookingView();
			roomBookingView.getFrame().setVisible(true);
			
			Room roomBookingmodel = new Room();	
			RoomBookingController roomBookingController = new RoomBookingController(roomBookingView, roomBookingmodel);
			
			roomBookingView.getFrame().setVisible(true);
			roomBookingController.roomBookingControl();
		}
		
		//Logout
		if(action.equalsIgnoreCase("Logout")){
			System.exit(0);
		}
	}//Action performed ends
}
