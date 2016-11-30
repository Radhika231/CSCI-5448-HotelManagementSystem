import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import javax.swing.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.HotelManagement.dBClasses.CreditCardTable;
import com.HotelManagement.dBClasses.RoomTable;


import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

public class RoomBookingController implements ActionListener{

	
	private ActionListener actionListener;
	private RoomBookingView roomBookingView;
	private RoomBookingModel roomBookingModel;
	private PaymentPageView  paymentPageView;
	private PaymentPageModel  paymentPageModel;
	private Session session = null;
	double totalPrice = 0.0;
	private List<RoomTable> roomTableList;
	private List<CreditCardTable> creditCardList;
	
	JTable showAvailtable;
	
	
	public RoomBookingController(RoomBookingView roomBookingView, 
									RoomBookingModel roomBookingModel,
									PaymentPageView paymentPageView,
									PaymentPageModel paymentPageModel){
		
		this.roomBookingModel = roomBookingModel;
		this.roomBookingView  = roomBookingView;
		this.paymentPageView = paymentPageView;
		this.paymentPageModel = paymentPageModel;		
				
	}
	
	public void control(){
	
		roomBookingView.getBtnShowAvailibility().addActionListener(this);
		roomBookingView.getBtnMakeReservation().addActionListener(this);		
		paymentPageView.getBtnSubmit().addActionListener(this);
		
		
	}
	
	public Session createSqlConnection(){
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		return session;
	}
	
	
	
	public void updateview(ActionEvent actionEvent){
		
		
		String actionCommand = ((JButton)actionEvent.getSource()).getActionCommand();
		String roomType = null;
		String cardNumber = null;
		ArrayList<Integer> roomNumber = null;
		ArrayList<Double> roomPrice  = null;
		JPanel showAvailpanel;
		JPanel noAvailPanel;
		JTextPane totalPricePane;
		roomNumber = new ArrayList<Integer>();
		roomPrice = new ArrayList<Double>();
		int index=0;
		
				
		if(actionCommand == "Show Availibility")
		{

			DateFormat df = new SimpleDateFormat("E, MMM dd yyyy");
			totalPrice = 0.0;
			showAvailpanel = roomBookingView.getPanel_4();
			totalPricePane = roomBookingView.getTotalPricePane();
			
			Date checkInDate 		= (Date)  	roomBookingView.getCheckInCalendar().getDate();
			Date checkOutDate 		= (Date) 	roomBookingView.getCheckInCalendar().getDate();			
			int adults 	   			= (Integer) roomBookingView.getAdults().getValue();
			int childern   			= (Integer) roomBookingView.getChildern().getValue();
			int numofRooms 			= (Integer) roomBookingView.getNumRooms().getValue();
			ButtonGroup buttonGroup = 			roomBookingView.getButtonGroup();
			Boolean freeBreakfast  	= 			roomBookingView.getChckbxFreeBreakfast().isSelected();
			Boolean freeWifi		= 			roomBookingView.getChckbxFreeWifi().isSelected();
			String CheckInDate =  df.format(checkInDate);
			String CheckOutDate = df.format(checkOutDate);
			
		
			for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) 
			{
	            AbstractButton button = buttons.nextElement();

	            if (button.isSelected()) {
	            	roomType = button.getText();
	            }
			
			}	
						
			
			session = createSqlConnection();
		
			roomTableList = roomBookingModel.getRoomTable(session,roomType);
			//session.close();
					
			
			Object [][] data = new Object [numofRooms+1][4];
			data[0][0]="Room No.";
			data[0][1]="BreakFast";
			data[0][2]="Wifi";
			data[0][3]="Price";
			Object[] columnNames = {"Room No.",
					                "BreakFast",
					                "Wifi",
					                "Price"};
			
			if(roomTableList.size() > 0)
			{
				for(RoomTable roomTable: roomTableList)
				{	
					double roomTotalPrice = 0;
					if(index == numofRooms){
						break;
					}
					System.out.println(roomTable.getRoomNum());
					roomNumber.add(roomTable.getRoomNum());
					roomPrice.add(roomTable.getBasePrice());
					totalPrice = totalPrice + roomTable.getBasePrice();
					totalPrice += freeWifi ? 5.0 : 0.0;
					totalPrice += freeBreakfast ? 5.0 : 0.0;
					
					roomTotalPrice += roomTable.getBasePrice();
					roomTotalPrice += freeWifi ? 5.0 : 0.0;
					roomTotalPrice += freeBreakfast ? 5.0 : 0.0;

					index++;
					data[index][0] = roomTable.getRoomNum();
					data[index][1] = freeBreakfast ? "Yes":"No";
					data[index][2] = freeWifi ? "Yes":"No";
					data[index][3] = roomTotalPrice + "";
		
				}
						
				showAvailtable = new JTable(data,columnNames);
				showAvailtable.setFont(new Font("Dialog", Font.BOLD, 12));
				showAvailtable.setForeground(SystemColor.infoText);
				showAvailtable.setBackground(SystemColor.window);
					
				showAvailtable.setEnabled(false);
				showAvailtable.setBounds(12, 49, 278, 201);
				showAvailpanel.add(showAvailtable);
				
					
				totalPricePane.setText(Double.toString(totalPrice));
				showAvailpanel.setVisible(true);
							
			}
				
			else
			{
				noAvailPanel = roomBookingView.getNoAvailPanel();
				noAvailPanel.setVisible(true);
				showAvailpanel.setVisible(false);
			}									
			
		}
		
		else if (actionCommand == "Confirm Reservation")
		{
		
			paymentPageView.getFrame().setVisible(true);
			System.out.println(Double.toString(totalPrice));
			paymentPageView.getAmountLabel().setText(Double.toString(totalPrice));			
		}
		
		else if (actionCommand == "Submit")
		{
			
			
			
			paymentPageView.getFrame().setVisible(false);
			cardNumber		 		= paymentPageView.getCardNumberPane().getText();
			String expiryMonth 		= paymentPageView.getExpiryMonthPane().getText();
			String expiryYear   	= paymentPageView.getExpiryYearPane().getText();
			String cvv				= paymentPageView.getCvvPane().getText();
			String cardHolderName	= paymentPageView.getNameHolderPane().getText();
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//frame.getContentPane().setLayout(null);
			
			creditCardList = paymentPageModel.getCardTable(session,cardNumber);
			
			
			for(CreditCardTable creditCardTable: creditCardList)
			{
						
				if (!creditCardTable.getCardHolderName().equals((String)cardHolderName))
				{
					JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
				}
								
				else if(!creditCardTable.getCvv().equals((String)cvv))
				{
					JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
				}				
				else if(!creditCardTable.getExpiryMonth().equals((String)expiryMonth))
				{
					JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
				}
				else if(!creditCardTable.getExpiryYear().equals((String)expiryYear))
				{
					JOptionPane.showMessageDialog(frame, "Payment Failed, Please Try Again");
				}
				
				else
				{
					System.out.println("Payment Successful, Enjoy your Stay");
					JOptionPane.showMessageDialog(frame, "Payment Successful, Enjoy your Stay");
					roomBookingModel.updateRoomTable(session, showAvailtable);
					paymentPageModel.updateCardTable(session,cardNumber,totalPrice);
					session.close();
					
				}
				
				
			}
			
			
			
		}
		
		
	}
	

	
	public void actionPerformed(ActionEvent actionEvent){
	
		updateview(actionEvent);
	}
	 
	
}