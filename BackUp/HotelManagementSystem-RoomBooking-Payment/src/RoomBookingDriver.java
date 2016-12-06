import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * @author meher
 *
 */
public class RoomBookingDriver {

		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//PaymentView paymentPageView = new PaymentView();
					//Payment paymentPageModel = new Payment();
					RoomBookingView roomBookingView = new RoomBookingView();
					Room roomBookingmodel = new Room();	
					roomBookingView.getFrame().setVisible(true);
					RoomBookingController roomBookingController = new RoomBookingController(roomBookingView, roomBookingmodel);
					
					//PaymentController paymentController = new PaymentController(paymentPageView,paymentPageModel,roomBookingmodel);
					roomBookingController.roomBookingControl();
					//paymentController.paymentControl();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
