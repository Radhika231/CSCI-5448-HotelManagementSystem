package com.hms.controller;
import com.hms.view.*;
import com.hms.model.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class OrderFoodController implements ActionListener{
	
	private ActionListener actionListener;
	private OrderFoodView viewOrderFood;
	private Food modelFood;
	private CustomerModel _cust;
	ArrayList<Food> foodList = new ArrayList<Food>();
	private Bill custBill;
	private double b;
	
	public OrderFoodController(OrderFoodView viewOrderFood, Food modelFood, CustomerModel _cust) {
		super();
		this.viewOrderFood = viewOrderFood;
		this.modelFood = modelFood;
		this._cust = _cust;
	}
	
	public void control(){
		viewOrderFood.getBtnConfirmOrder().addActionListener(this);
		viewOrderFood.getBtnGoBack().addActionListener(this);
		viewOrderFood.getChckbxDineIn().addActionListener(this);
		viewOrderFood.getChckbxTakeAway().addActionListener(this);
		viewOrderFood.getbtnCancel().addActionListener(this);
		viewOrderFood.getBtnGoAhead().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String action = actionEvent.getActionCommand().toString();
		System.out.println("Action : " + action);
		
		this.custBill = new Bill("Subir" + System.currentTimeMillis());
		
		//Check boxes
		if(action.equalsIgnoreCase("Take Away")){
			if(viewOrderFood.getChckbxTakeAway().isSelected()){
				viewOrderFood.getChckbxDineIn().setVisible(false);
			}
			else{
				viewOrderFood.getChckbxDineIn().setVisible(true);
			}
		}
		if(action.equalsIgnoreCase("Dine In")){
			if(viewOrderFood.getChckbxDineIn().isSelected()){
				viewOrderFood.getChckbxTakeAway().setVisible(false);
			}
			else{
				viewOrderFood.getChckbxTakeAway().setVisible(true);
			}
		}
		if(!(viewOrderFood.getChckbxDineIn().isSelected()) && !(viewOrderFood.getChckbxTakeAway().isSelected())){
			viewOrderFood.getChckbxDineIn().setVisible(true);
			viewOrderFood.getChckbxTakeAway().setVisible(true);
		}
		
		//Confirm Order
		if(action.equalsIgnoreCase("Confirm Order")){
			
			takeOrders();
			for(Food item : foodList){
				System.out.println(item.getFoodItem().toString() + "  " + item.getQuantity() + "  " + item.getPrice());
			}
			//Billing	
			this.custBill.computeFoodBill(foodList);
			b = this.custBill.getBill();
			
			viewOrderFood.getLblMenu().setVisible(false);
			viewOrderFood.getLblBill().setVisible(true);
			viewOrderFood.getLblBill().setText("Your Bill :" + b);
			
			System.out.println("In Confirm order " + b);
		}
		//Cancel
		if(action.equalsIgnoreCase("Cancel")){
			System.out.println("In Cancel!");
			System.exit(0);
			
			//go to main screen			
		}
		//Go Ahead
		if(action.equalsIgnoreCase("Go Ahead")){
			viewOrderFood.getLblBill().setVisible(false);
			if(viewOrderFood.getChckbxTakeAway().isSelected()){
				//viewOrderFood.getLblStatus().setText("Please Pay at the cashier");
				PaymentView paymentPageView = new PaymentView();
				Payment paymentPageModel = new Payment();
				PaymentController paymentController = new PaymentController(paymentPageView,paymentPageModel);
				paymentController.paymentControl();
				paymentPageView.getFrame().setVisible(true);
				//System.out.println(Double.toString(totalPrice));
				paymentPageView.getAmountLabel().setText(Double.toString(b));
			}
			else{
				viewOrderFood.getLblStatus().setText("Bill has been added to your account");
			}
			System.out.println("In Go Ahead!");
			viewOrderFood.getPanelReview().setVisible(false);
			viewOrderFood.getPanelEntree().setVisible(false);
			viewOrderFood.getPanelSides().setVisible(false);
			viewOrderFood.getPanelDone().setVisible(true);
			viewOrderFood.getChckbxDineIn().setVisible(false);
			viewOrderFood.getChckbxTakeAway().setVisible(false);
			viewOrderFood.getLblMenu().setVisible(false);
			
			//System.out.println("In Controller" + b);
			custBill.setBill(b);
			System.out.println("In Controller " + custBill.getBill());
			System.out.println("In Controller " + custBill.getCustName());
			
			
			//hibernate - store bill
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(custBill);
			session.getTransaction().commit();
			session.close();
			sessionFactory.close();
			
			
			/*try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			JOptionPane.showMessageDialog(viewOrderFood.frame, "Bill has been added to your account");
			viewOrderFood.frame.setVisible(false);
			//show main screen	
			UserRole screen= new CustomerView();
			screen.userScreen();
			CustomerController customerController = new CustomerController((CustomerView)screen);
			customerController.control();
		}
		//Go Back
		if(action.equalsIgnoreCase("Go Back")){
			viewOrderFood.frame.setVisible(false);
			System.out.println("In Go Back!");
			//go to main screen	
			UserRole screen= new CustomerView();
			screen.userScreen();
			CustomerController customerController = new CustomerController((CustomerView)screen);
			customerController.control();
		}
				
		
	}//Action performed ends
	
	public void takeOrders(){
		int quant = 0;
		//Food food  = new Food();
		if((quant = Integer.parseInt((viewOrderFood.getSpinnera1().getValue().toString()))) > 0){
			Food food  = new Food("A1", quant);
			/*SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Food foodDB = session.get(com.hms.model.Food.class, "A1");
			session.close();
			sessionFactory.close();
			
			food.setPrice(foodDB.getPrice());*/
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnera1().setVisible(false);
			viewOrderFood.getLblEa().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnera2().getValue().toString()))) > 0){
			Food food  = new Food("A2", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnera2().setVisible(false);
			viewOrderFood.getLblEb().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnera3().getValue().toString()))) > 0){
			Food food  = new Food("A3", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnera3().setVisible(false);
			viewOrderFood.getLblEc().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnera4().getValue().toString()))) > 0){
			Food food  = new Food("A4", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnera4().setVisible(false);
			viewOrderFood.getLblEd().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnera5().getValue().toString()))) > 0){
			Food food  = new Food("A5", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnera5().setVisible(false);
			viewOrderFood.getLblEe().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnera6().getValue().toString()))) > 0){
			Food food  = new Food("A6", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnera6().setVisible(false);
			viewOrderFood.getLblEf().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnerm1().getValue().toString()))) > 0){
			Food food  = new Food("M1", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnerm1().setVisible(false);
			viewOrderFood.getLblMa().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnerm2().getValue().toString()))) > 0){
			Food food  = new Food("M2", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnerm2().setVisible(false);
			viewOrderFood.getLblMb().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnerm3().getValue().toString()))) > 0){
			Food food  = new Food("M3", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnerm3().setVisible(false);
			viewOrderFood.getLblMc().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnerm4().getValue().toString()))) > 0){
			Food food  = new Food("M4", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnerm4().setVisible(false);
			viewOrderFood.getLblMd().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnerm5().getValue().toString()))) > 0){
			Food food  = new Food("M5", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnerm5().setVisible(false);
			viewOrderFood.getLblMe().setVisible(false);
		}
		if((quant = Integer.parseInt((viewOrderFood.getSpinnerm6().getValue().toString()))) > 0){
			Food food  = new Food("M6", quant);
			foodList.add(food);
		}
		else{
			viewOrderFood.getSpinnerm6().setVisible(false);
			viewOrderFood.getLblMf().setVisible(false);
		}
		viewOrderFood.getBtnConfirmOrder().setVisible(false);
		viewOrderFood.getBtnGoBack().setVisible(false);
		viewOrderFood.getbtnCancel().setVisible(true);
		viewOrderFood.getBtnGoAhead().setVisible(true);
	}//takeOrders ends here
}

/*
 * 	
 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderFood window = new OrderFood();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			OrderFood of = new OrderFood();
			Food _food = new Food();
			ControllerFood confood = new ControllerFood(of, _food);
			
			
			
			
			
		});
		*/
