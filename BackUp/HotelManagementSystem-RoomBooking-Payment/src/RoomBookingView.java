import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import com.toedter.calendar.JCalendar;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.JTableHeader;

import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class RoomBookingView {

	private JFrame frame;
	private JButton btnShowAvailibility;
	private JButton btnMakeReservation;
	private JSpinner numRooms, adults, childern;
	private JCalendar checkInCalendar, checkOutCalendar;
	private JCheckBox chckbxFreeWifi, chckbxFreeBreakfast;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable showAvailtable;
	private JPanel panel_4;
	JTextPane totalPricePane;
	JPanel noAvailPanel;
	
	
	public JPanel getNoAvailPanel() {
		return noAvailPanel;
	}

	public void setNoAvailPanel(JPanel noAvailPanel) {
		this.noAvailPanel = noAvailPanel;
	}

	public JTable getShowAvailtable() {
		return showAvailtable;
	}

	public void setShowAvailtable(JTable showAvailtable) {
		this.showAvailtable = showAvailtable;
	}
			
	public JTextPane getTotalPricePane() {
		return totalPricePane;
	}

	public void setTotalPricePane(JTextPane totalPricePane) {
		this.totalPricePane = totalPricePane;
	}

	public JPanel getPanel_4() {
		return panel_4;
	}

	public JCheckBox getChckbxFreeWifi() {
		return chckbxFreeWifi;
	}

	public JCheckBox getChckbxFreeBreakfast() {
		return chckbxFreeBreakfast;
	}

	public JSpinner getNumRooms() {
		return numRooms;
	}

	public JSpinner getAdults() {
		return adults;
	}

	public JSpinner getChildern() {
		return childern;
	}

	public JCalendar getCheckInCalendar() {
		return checkInCalendar;
	}

	public JCalendar getCheckOutCalendar() {
		return checkOutCalendar;
	}

	public JButton getBtnShowAvailibility() {
		return btnShowAvailibility;
	}
	
	public JButton getBtnMakeReservation() {
		return btnMakeReservation;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomBookingView window = new RoomBookingView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public RoomBookingView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,1000,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 5, 976, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblH = new JLabel("Hotel Room Reservation System");
		lblH.setBounds(241, 5, 493, 29);
		lblH.setFont(new Font("Courier 10 Pitch", Font.BOLD, 29));
		panel.add(lblH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 45, 976, 155);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/media/meher/New Volume/Fall2016/OOAD/Project/38849817-H1-Exterior_1-16x7.jpg"));
		lblNewLabel.setBounds(0, 0, 976, 155);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(432, 210, 207, 33);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(24, 245, 650, 481);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCheckinDate = new JLabel("Check-In Date");
		lblCheckinDate.setBounds(44, 13, 113, 36);
		panel_3.add(lblCheckinDate);
		
		checkInCalendar = new JCalendar();
		checkInCalendar.setBounds(44, 57, 223, 176);
		panel_3.add(checkInCalendar);
		
		JLabel lblCheckoutDate = new JLabel("Check-Out Date");
		lblCheckoutDate.setBounds(352, 13, 113, 36);
		panel_3.add(lblCheckoutDate);
		
		checkOutCalendar = new JCalendar();
		checkOutCalendar.setBounds(352, 57, 223, 176);
		panel_3.add(checkOutCalendar);
		
		JLabel lblNewLabel_1 = new JLabel("Room Type");
		lblNewLabel_1.setBounds(44, 261, 90, 15);
		panel_3.add(lblNewLabel_1);
		
		JRadioButton SingleBed = new JRadioButton("Single Bed",true);
		buttonGroup.add(SingleBed);
		SingleBed.setBounds(189, 257, 149, 23);
		panel_3.add(SingleBed);
		
		
		JRadioButton DoubleBed = new JRadioButton("Double Bed");
		buttonGroup.add(DoubleBed);
		DoubleBed.setBounds(410, 257, 149, 23);
		panel_3.add(DoubleBed);
		
		
		
		JLabel lblNoOfRooms = new JLabel("No Of Rooms");
		lblNoOfRooms.setBounds(44, 296, 103, 20);
		panel_3.add(lblNoOfRooms);
		
		
		
		numRooms = new JSpinner();
		numRooms.setModel(new SpinnerNumberModel(new Integer(1), new Integer(0), null, new Integer(1)));
		numRooms.setBounds(199, 296, 28, 20);
		panel_3.add(numRooms);
		
		JLabel lblAdults = new JLabel("Adults");
		lblAdults.setBounds(44, 331, 70, 20);
		panel_3.add(lblAdults);
		
		adults = new JSpinner();
		adults.setModel(new SpinnerNumberModel(new Integer(1), new Integer(0), null, new Integer(1)));
		adults.setBounds(199, 331, 28, 20);
		panel_3.add(adults);
		
		childern = new JSpinner();
		childern.setBounds(565, 331, 28, 20);
		childern.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		panel_3.add(childern);
		
		JLabel lblNewLabel_2 = new JLabel("Childern");
		lblNewLabel_2.setBounds(410, 334, 70, 15);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Amenities");
		lblNewLabel_3.setBounds(44, 366, 70, 15);
		panel_3.add(lblNewLabel_3);
		
		chckbxFreeWifi = new JCheckBox("Wifi");
		chckbxFreeWifi.setBounds(199, 362, 129, 23);
		panel_3.add(chckbxFreeWifi);
		
		chckbxFreeBreakfast = new JCheckBox("BreakFast");
		chckbxFreeBreakfast.setBounds(410, 362, 139, 23);
		panel_3.add(chckbxFreeBreakfast);
		
		btnShowAvailibility = new JButton("Show Availibility");
	
		btnShowAvailibility.setBounds(199, 416, 163, 25);
		panel_3.add(btnShowAvailibility);
		
		btnMakeReservation = new JButton("Confirm Reservation");
		btnMakeReservation.setBounds(410, 416, 183, 25);
		panel_3.add(btnMakeReservation);
		
		panel_4 = new JPanel();
		panel_4.setBounds(686, 245, 302, 297);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		
		
		
		/*Object [][] data = {
				{"Room No.", "BreakFast","Wifi", "Price"},
		};
		
		Object[] columnNames = {"Room No.",
				                "BreakFast",
				                "Wifi",
				                "Price"};
		
		showAvailtable = new JTable(data,columnNames);
		showAvailtable.setFont(new Font("Dialog", Font.BOLD, 12));
		showAvailtable.setForeground(SystemColor.infoText);
		showAvailtable.setBackground(SystemColor.window);
			
		showAvailtable.setEnabled(false);
		showAvailtable.setBounds(12, 49, 278, 201);
		panel_4.add(showAvailtable);*/
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(133, 262, 70, 15);
		panel_4.add(lblTotal);
		
		totalPricePane = new JTextPane();
		totalPricePane.setBackground(SystemColor.window);
		totalPricePane.setBounds(196, 256, 77, 21);
		panel_4.add(totalPricePane);
		
		noAvailPanel = new JPanel();
		noAvailPanel.setBounds(686, 554, 302, 174);
		frame.getContentPane().add(noAvailPanel);
		noAvailPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setText("No Room Available");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_4.setBounds(50, 44, 205, 70);
		noAvailPanel.add(lblNewLabel_4);
		
		panel_4.setVisible(false);
		noAvailPanel.setVisible(false);
		
		
		
		
	}


}
