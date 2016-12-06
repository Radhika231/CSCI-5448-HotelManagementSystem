package com.hms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class RoomTable {
	
	
	@Id
	private int roomNum;
	private String roomType;
	private String roomCheckIn;
	private String roomCheckOut;
	private Boolean roomStatus;
	private String wifi,breakfast;
	private double basePrice;
	private double roomPrice;
	private String customerName;
	
	
	
	public RoomTable(){
		
	}
	
	
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomCheckIn() {
		return roomCheckIn;
	}
	public void setRoomCheckIn(String roomCheckIn) {
		this.roomCheckIn = roomCheckIn;
	}
	public String getRoomCheckOut() {
		return roomCheckOut;
	}
	public void setRoomCheckOut(String roomCheckOut) {
		this.roomCheckOut = roomCheckOut;
	}
	public Boolean getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(Boolean roomStatus) {
		this.roomStatus = roomStatus;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	public RoomTable(int roomNum, String roomType, String roomCheckIn, String roomCheckOut, Boolean roomStatus, String wifi,
			String breakfast, double basePrice, double roomPrice, String customerName) {
		super();
		this.roomNum = roomNum;
		this.roomType = roomType;
		this.roomCheckIn = roomCheckIn;
		this.roomCheckOut = roomCheckOut;
		this.roomStatus = roomStatus;
		this.wifi = wifi;
		this.breakfast = breakfast;
		this.basePrice = basePrice;
		this.roomPrice = roomPrice;
		this.customerName = customerName;
	}
	
	
	
	
	
	
	
	
	}
