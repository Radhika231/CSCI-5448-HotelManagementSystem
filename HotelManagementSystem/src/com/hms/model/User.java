package com.hms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

//Class to get user details into database

@Entity
@Table(name="User_Details", uniqueConstraints = {
	    @UniqueConstraint(columnNames={"user_name","email_id"})
	})
public class User 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", unique = true, nullable = false)
	
	private int id;
	
	String first_name,user_name,last_name,password,email_id,phone_no,gender,user_role;
	int failedLogins=0;
	
	
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

}
