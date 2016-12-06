package com.hms.model;

import java.util.Date;

public class Room {
	private int roomNum;
	private String roomType;
	private Date roomCheckin;
	private Date roomCheckout;
	private String roomStatus;
	private int numRooms;
	private double price;
	
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
	public Date getRoomCheckin() {
		return roomCheckin;
	}
	public void setRoomCheckin(Date roomCheckin) {
		this.roomCheckin = roomCheckin;
	}
	public Date getRoomCheckout() {
		return roomCheckout;
	}
	public void setRoomCheckout(Date roomCheckout) {
		this.roomCheckout = roomCheckout;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	public int getNumRooms() {
		return numRooms;
	}
	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
