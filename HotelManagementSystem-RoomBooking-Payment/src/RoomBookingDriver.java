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
					
					PaymentPageView paymentPageView = new PaymentPageView();
					PaymentPageModel paymentPageModel = new PaymentPageModel();
					RoomBookingView roomBookingView = new RoomBookingView();
					RoomBookingModel roomBookingmodel = new RoomBookingModel();	
					roomBookingView.getFrame().setVisible(true);
					RoomBookingController controller = new RoomBookingController(roomBookingView, roomBookingmodel,
																				paymentPageView,paymentPageModel);
					controller.control();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
