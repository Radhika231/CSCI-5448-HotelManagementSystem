import java.util.Date;

/**
 * 
 */

/**
 * @author Meher
 *
 */
public class Room {
	
	private int roomNum;
	private String roomType;
	private Date roomCheckIn;
	private Date roomCheckOut;
	private boolean roomStatus;
	private int numRooms;
	private double price;
	private boolean freeWifi;
	
	
	
	public Room()
	{
		roomNum =0;	
	}
	
	public Room(int _roomNum, String _roomType, Date _roomCheckIn, Date _roomCheckOut, boolean _roomStatus, 
				double _price, boolean _freeWifi)	
	{
		this.roomNum  		= _roomNum;
		this.roomType 		= _roomType;
		this.roomCheckIn	= _roomCheckIn;
		this.roomCheckOut 	= _roomCheckOut;
		this.roomStatus  	= _roomStatus;
		this.price 			= _price;
		this.freeWifi		= _freeWifi;
	}
	
	/**
	 * @return the roomNum
	 */
	public int getRoomNum() {
		return roomNum;
	}
	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}
	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	/**
	 * @return the roomCheckIn
	 */
	public Date getRoomCheckIn() {
		return roomCheckIn;
	}
	/**
	 * @param roomCheckIn the roomCheckIn to set
	 */
	public void setRoomCheckIn(Date roomCheckIn) {
		this.roomCheckIn = roomCheckIn;
	}
	/**
	 * @return the roomCheckOut
	 */
	public Date getRoomCheckOut() {
		return roomCheckOut;
	}
	/**
	 * @param roomCheckOut the roomCheckOut to set
	 */
	public void setRoomCheckOut(Date roomCheckOut) {
		this.roomCheckOut = roomCheckOut;
	}
	
	
	/**
	 * @return the numRooms
	 */
	public int getNumRooms() {
		return numRooms;
	}
	/**
	 * @param numRooms the numRooms to set
	 */
	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the roomStatus
	 */
	public boolean getRoomStatus() {
		return roomStatus;
	}

	/**
	 * @param roomStatus the roomStatus to set
	 */
	public void setRoomStatus(boolean roomStatus) {
		this.roomStatus = roomStatus;
	}

	/**
	 * @return the freeWifi
	 */
	public boolean isFreeWifi() {
		return freeWifi;
	}

	/**
	 * @param freeWifi the freeWifi to set
	 */
	public void setFreeWifi(boolean freeWifi) {
		this.freeWifi = freeWifi;
	}

}
