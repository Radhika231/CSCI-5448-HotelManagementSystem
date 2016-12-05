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
		System.out.println("here 1");
		viewCustomer.getMakeReserv().addActionListener(this);
		System.out.println("here 2");
		viewCustomer.getOrderFood().addActionListener(this);
		System.out.println("here 3");
		//viewCustomer.getBtnLogout().addActionListener(this);
		System.out.println("here 4");
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		System.out.println("here 5");
		String action = actionEvent.getActionCommand().toString();//((JButton) actionEvent.getSource()).getActionCommand();
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
