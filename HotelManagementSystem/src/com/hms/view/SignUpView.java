package com.hms.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.hms.controller.*;


public class SignUpView extends LoginView
{
	protected Shell shlSignUp;
	private Text first_name;
	public Text last_name;
	private Text email_id;
	private Text phone_no;
	public Text user_name;
	private Text password;
	private Text retype_password;
	Button btnSubmit;
	
	private String gender=null;
	private String user_role=null;
	int failedLogins;
	
	
	int i;
	
	 public SignUpView()
	 {
				
		 Display display = new Display();
		 Shell shlSignUp = new Shell(SWT.CLOSE | SWT.BORDER );
		 shlSignUp.setSize(872, 484);
		 shlSignUp.setText("Sign Up");
		
		 //call shell for sign up
		 createContents(shlSignUp);

         shlSignUp.open();
         shlSignUp.forceActive();
		
			while (!shlSignUp.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		 
	 }
	 
	 //Function to check if input entered and display error message if input is null
	 public boolean validateInteger( Text f, String errormsg )
	 {
	   try
	   {  
		   
	       i =(f.getText()).length();
	    
	       if ( i > 0 )
	       return true; // user field validated
	    }
	    catch(Exception e)
	    {
	       // if i was <= 0, i.e., input is null do final return below
	    }
	    return failedMessage( f, errormsg );
	 }
	 
	 
	 
	 public boolean failedMessage(Text f, String errormsg)
	 {
		
		 f.setMessage(errormsg);// give user feedback
		 f.setFocus(); // set focus on field, so user can change
	     return false; // return false, as validation has failed
	 }

	 
	 protected void createContents(Shell shlSignUp) 
	 {
		
		    this.shlSignUp=shlSignUp;
      
			shlSignUp.setSize(872, 484);
			shlSignUp.setText("Sign Up");
			
			
			Button btnCustomer = new Button(shlSignUp, SWT.RADIO);
			btnCustomer.setBounds(10, 22, 133, 25);
			btnCustomer.setText("Customer");
			
			Button btnManager = new Button(shlSignUp, SWT.RADIO);
			btnManager.setBounds(149, 22, 133, 25);
			btnManager.setText("Manager");
			
			Button btnReceptionist = new Button(shlSignUp, SWT.RADIO);
			btnReceptionist.setBounds(280, 22, 133, 25);
			btnReceptionist.setText("Receptionist");
			
			Button btnCatering = new Button(shlSignUp, SWT.RADIO);
			btnCatering.setBounds(423, 22, 133, 25);
			btnCatering.setText("Catering Staff");
			
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
			
			
			btnMale.setBounds(10, 12, 133, 25);
			btnMale.setText("Male");
			
			Button btnFemale = new Button(group, SWT.RADIO);
			btnFemale.setBounds(186, 12, 133, 25);
			btnFemale.setText("Female");
			
			Label label = new Label(shlSignUp, SWT.NONE);
			label.setBounds(83, 372, 81, 25);
			
			btnSubmit = new Button(shlSignUp, SWT.NONE);
			btnSubmit.setBounds(364, 383, 105, 35);
			btnSubmit.setText("Submit");
			
			btnCustomer.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					user_role="Customer";
				}
			});
			
			btnManager.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					user_role="Manager";
				}
			});
			
			btnCatering.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					user_role="Catering";
				}
			});
			
			btnReceptionist.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					user_role="Receptionist";
				}
			});
			btnHouseKeeping.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					user_role="HouseKeeping";
				}
			});
			
			btnHr.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					user_role="HR";
				}
			});
			
			btnMale.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					gender="Male";
				}
			});
			
			btnFemale.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					gender="Female";
				}
			});
			btnSubmit.addListener(SWT.Selection, new Listener(){
			      public void handleEvent(Event e) {
			        switch (e.type) {
			        case SWT.Selection:
			        	UserLogInSignUpController adduser=new UserLogInSignUpController();
			        	String new_user_name=user_name.getText();
			        	String new_password=password.getText();
			        	String new_first_name=first_name.getText();
			        	String new_last_name=last_name.getText();
			        	String new_email_id=email_id.getText();
			        	String new_phone_no=phone_no.getText();
			        	String new_retype_password=retype_password.getText();
			          
			        	
			        	
			        	if(validateInteger(first_name,"First name is required")&& validateInteger(last_name,"Last name is required")&&validateInteger(email_id,"Email is required")&& validateInteger(phone_no,"Phone No. is required")&& validateInteger(user_name,"User name is required")&& validateInteger(password,"Password is required")&& validateInteger(retype_password,"Retype password"))
			        	{
			        		validateUserDetails(adduser,new_user_name,new_password,new_first_name,new_last_name,new_phone_no,new_retype_password,new_email_id);
			        	}
			        	
			          break;
			        }
			      }

			      //Method to validate user input during sign up
				private void validateUserDetails(UserLogInSignUpController adduser,String new_user_name, String new_password, String new_first_name,
						String new_last_name, String new_phone_no, String new_retype_password,String new_email_id) 
				{
					// TODO Auto-generated method stub
					
					   if(gender!=null && user_role!=null && (new_password.equals(new_retype_password)))
			    		{
			    	    	shlSignUp.close();
			    	    	adduser.addDetailsToModel(new_first_name,new_last_name,new_user_name,new_password,new_email_id,new_phone_no,gender,user_role,failedLogins);   
			    		}
			    	    if (!new_password.equals(new_retype_password))
			    	    System.out.println("Retyped password doesnt match"+new_password+new_retype_password);
			    	    
			    		if(gender==null)
			    		System.out.println("Select gender");
			            
			    		if(user_role==null)
			    		System.out.println("Select role");
				}
			});
	 }
			
}



