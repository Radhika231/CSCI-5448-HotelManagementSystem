package com.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

//Class to get user details into database

@Entity
@Table(name="User_Details", uniqueConstraints = {
	    @UniqueConstraint(columnNames={"user_name","email_id"})
})
public class User 
{
	//@Id
    ////@GeneratedValue(strategy=GenerationType.AUTO)
	//@GenericGenerator(name="kaugen" , strategy="increment")
	//@GeneratedValue(generator="kaugen")
    //@Column(name = "Id", unique = true, nullable = false)
	private int id;
	
	@Id
	String user_name;
	String first_name,last_name,password,email_id,phone_no,gender,user_role;
	int failedLogins=0;
	
	
	public User(){
		
	}
	public void setUserDetails(String first_name,String last_name,String user_name,String password,String email_id,String phone_no,String gender,String user_role,int failedLogins)
	{
		this.first_name=first_name;
		this.last_name=last_name;
		this.user_name=user_name;
		this.password=password;
		this.email_id=email_id;
		this.phone_no=phone_no;
		this.gender=gender;
		this.user_role=user_role;
		this.failedLogins=failedLogins;
		
	}


	public int getId() {
		return id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public String getUser_name() {
		return user_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public String getPassword() {
		return password;
	}


	public String getEmail_id() {
		return email_id;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public String getGender() {
		return gender;
	}


	public String getUser_role() {
		return user_role;
	}


	public int getFailedLogins() {
		return failedLogins;
	}

}
