import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class RoomBookingSystem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomBookingSystem window = new RoomBookingSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.s
	 */
	public RoomBookingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1000, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 79, 964, 155);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("H:\\Fall2016\\OOAD\\Project\\38849817-H1-Exterior_1-16x7.jpg"));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 964, 57);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Hotel Room Reservation System");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 29));
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 256, 533, 438);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCheckinDate = new JLabel("Check-In Date");
		lblCheckinDate.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCheckinDate.setBounds(25, 79, 92, 33);
		panel_2.add(lblCheckinDate);
		
		JLabel lblCheckoutDate = new JLabel("Check-Out Date");
		lblCheckoutDate.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblCheckoutDate.setBounds(391, 79, 117, 33);
		panel_2.add(lblCheckoutDate);
		
		JButton btnNewButton = new JButton("Show Availability");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(46, 373, 123, 23);
		panel_2.add(btnNewButton);
		
		JButton btnConfirmReservation = new JButton("Confirm Reservation");
		btnConfirmReservation.setBounds(377, 373, 131, 23);
		panel_2.add(btnConfirmReservation);
		
		JLabel lblRoomType = new JLabel("Room Type");
		lblRoomType.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblRoomType.setBounds(25, 183, 92, 14);
		panel_2.add(lblRoomType);
		
		JRadioButton rdbtnSingleBed = new JRadioButton("Single Bed");
		rdbtnSingleBed.setBounds(166, 180, 109, 23);
		panel_2.add(rdbtnSingleBed);
		
		JRadioButton rdbtnDoubleBed = new JRadioButton("Double Bed");
		rdbtnDoubleBed.setBounds(399, 180, 109, 23);
		panel_2.add(rdbtnDoubleBed);
		
		JLabel lblNumberOfOccupants = new JLabel("Rooms");
		lblNumberOfOccupants.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNumberOfOccupants.setBounds(25, 219, 117, 33);
		panel_2.add(lblNumberOfOccupants);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(166, 226, 29, 20);
		panel_2.add(spinner);
		
		JLabel lblAmenities = new JLabel("Amenities");
		lblAmenities.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblAmenities.setBounds(25, 304, 109, 14);
		panel_2.add(lblAmenities);
		
		JRadioButton rdbtnFreeWifi = new JRadioButton("Free Wifi");
		rdbtnFreeWifi.setBounds(166, 301, 109, 23);
		panel_2.add(rdbtnFreeWifi);
		
		JRadioButton rdbtnFreeBreakfast = new JRadioButton("Free Breakfast");
		rdbtnFreeBreakfast.setBounds(310, 301, 109, 23);
		panel_2.add(rdbtnFreeBreakfast);
		
		JLabel lblAdults = new JLabel("Adults");
		lblAdults.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblAdults.setBounds(25, 263, 69, 23);
		panel_2.add(lblAdults);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner_1.setBounds(166, 265, 29, 20);
		panel_2.add(spinner_1);
		
		JLabel lblChildern = new JLabel("Childern");
		lblChildern.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblChildern.setBounds(310, 263, 69, 23);
		panel_2.add(lblChildern);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(451, 265, 29, 20);
		panel_2.add(spinner_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(573, 256, 401, 438);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
	}
}
