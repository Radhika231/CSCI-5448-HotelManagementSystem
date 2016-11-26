import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Group;

public class SignUp {

	protected Shell shlSignUp;
	private Text first_name;
	private Text last_name;
	private Text email_id;
	private Text phone_no;
	private Text user_name;
	private Text password;
	private Text retype_password;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SignUp window = new SignUp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlSignUp.open();
		shlSignUp.layout();
		while (!shlSignUp.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlSignUp = new Shell();
		shlSignUp.setSize(872, 484);
		shlSignUp.setText("Sign Up");
		
		Button btnRadioButton = new Button(shlSignUp, SWT.RADIO);
		btnRadioButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton.setBounds(10, 22, 133, 25);
		btnRadioButton.setText("Customer");
		
		Button btnRadioButton_1 = new Button(shlSignUp, SWT.RADIO);
		btnRadioButton_1.setBounds(149, 22, 133, 25);
		btnRadioButton_1.setText("Manager");
		
		Button btnReceptionist = new Button(shlSignUp, SWT.RADIO);
		btnReceptionist.setBounds(274, 22, 133, 25);
		btnReceptionist.setText("Receptionist");
		
		Button btnRadioButton_2 = new Button(shlSignUp, SWT.RADIO);
		btnRadioButton_2.setBounds(423, 22, 133, 25);
		btnRadioButton_2.setText("Catering Staff");
		
		Button btnHouseKeeping = new Button(shlSignUp, SWT.RADIO);
		btnHouseKeeping.setBounds(581, 22, 149, 25);
		btnHouseKeeping.setText("House Keeping");
		
		Button btnHr = new Button(shlSignUp, SWT.RADIO);
		btnHr.setBounds(756, 22, 133, 25);
		btnHr.setText("HR");
		
		Label lblFirstName = new Label(shlSignUp, SWT.NONE);
		lblFirstName.setBounds(40, 102, 103, 25);
		lblFirstName.setText("First Name:");
		
		Label lblLastName = new Label(shlSignUp, SWT.NONE);
		lblLastName.setBounds(40, 133, 103, 25);
		lblLastName.setText("Last Name:");
		
		Label lblEmailId = new Label(shlSignUp, SWT.NONE);
		lblEmailId.setBounds(40, 164, 81, 25);
		lblEmailId.setText("Email ID:");
		
		first_name = new Text(shlSignUp, SWT.BORDER);
		first_name.setBounds(188, 99, 281, 25);
		
		last_name = new Text(shlSignUp, SWT.BORDER);
		last_name.setBounds(188, 133, 281, 25);
		
		email_id = new Text(shlSignUp, SWT.BORDER);
		email_id.setBounds(188, 164, 281, 25);
		
		Label lblPhoneNo = new Label(shlSignUp, SWT.NONE);
		lblPhoneNo.setBounds(40, 195, 92, 25);
		lblPhoneNo.setText("Phone No.:");
		
		Label lblUserName = new Label(shlSignUp, SWT.NONE);
		lblUserName.setBounds(40, 226, 92, 25);
		lblUserName.setText("User Name:");
		
		Label lblPassword = new Label(shlSignUp, SWT.NONE);
		lblPassword.setBounds(40, 257, 81, 25);
		lblPassword.setText("Password:");
		
		Label lblRetypePassword = new Label(shlSignUp, SWT.NONE);
		lblRetypePassword.setBounds(40, 288, 142, 25);
		lblRetypePassword.setText("Retype Password:");
		
		phone_no = new Text(shlSignUp, SWT.BORDER);
		phone_no.setBounds(188, 195, 281, 25);
		
		user_name = new Text(shlSignUp, SWT.BORDER);
		user_name.setBounds(188, 226, 281, 25);
		
		password = new Text(shlSignUp, SWT.BORDER | SWT.PASSWORD);
		password.setBounds(188, 257, 281, 25);
		
		retype_password = new Text(shlSignUp, SWT.BORDER | SWT.PASSWORD);
		retype_password.setBounds(188, 288, 281, 25);
		
		Group group = new Group(shlSignUp, SWT.NONE);
		group.setBounds(27, 319, 463, 47);
		
		Button btnMale = new Button(group, SWT.RADIO);
		btnMale.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnMale.setBounds(10, 12, 133, 25);
		btnMale.setText("Male");
		
		Button btnFemale = new Button(group, SWT.RADIO);
		btnFemale.setBounds(186, 12, 133, 25);
		btnFemale.setText("Female");
		
		Label label = new Label(shlSignUp, SWT.NONE);
		label.setBounds(83, 372, 81, 25);
		
		Button btnSubmit = new Button(shlSignUp, SWT.NONE);
		btnSubmit.setBounds(364, 383, 105, 35);
		btnSubmit.setText("Submit");

	}
}
