package com.hms.model;

import java.util.Date;

public class Customer extends User {
	private int customerRoomNum;
	private String customerRoomType;
	private int customerNumOfRooms;
	private Date checkinDate;
	private Date checkoutDate;
	private boolean roomIn;
	
	public int getCustomerRoomNum() {
		return customerRoomNum;
	}
	public void setCustomerRoomNum(int customerRoomNum) {
		this.customerRoomNum = customerRoomNum;
	}
	public String getCustomerRoomType() {
		return customerRoomType;
	}
	public void setCustomerRoomType(String customerRoomType) {
		this.customerRoomType = customerRoomType;
	}
	public int getCustomerNumOfRooms() {
		return customerNumOfRooms;
	}
	public void setCustomerNumOfRooms(int customerNumOfRooms) {
		this.customerNumOfRooms = customerNumOfRooms;
	}
	public Date getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public boolean isRoomIn() {
		return roomIn;
	}
	public void setRoomIn(boolean roomIn) {
		this.roomIn = roomIn;
	}
	

}
