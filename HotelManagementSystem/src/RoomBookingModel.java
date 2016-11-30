import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.swing.JTable;

import org.hibernate.Session;

import com.HotelManagement.dBClasses.RoomTable;

public class RoomBookingModel {

	
	
	public RoomBookingModel() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void updateRoomTable(Session session, JTable showAvailTable){
		int numRows = showAvailTable.getRowCount();
		for(int i =1; i< numRows; i++){
			String hibernateQuery = "UPDATE RoomTable set roomStatus=:status, roomPrice =:myRoomPrice, wifi =:myWifi, breakfast =:myBreakfast WHERE roomNum =:myRoomNum";
			Query query = session.createQuery(hibernateQuery);
			query.setParameter("status", false);
			query.setParameter("myRoomNum", showAvailTable.getValueAt(i,0));
			query.setParameter("myBreakfast", showAvailTable.getValueAt(i, 1));
			query.setParameter("myWifi", showAvailTable.getValueAt(i, 2));
			query.setParameter("myRoomPrice",Double.parseDouble((String)showAvailTable.getValueAt(i,3)));
			int result = query.executeUpdate();
			//System.out.println("Rows affected: " + result);	
		}
	}
	
	
	public List<RoomTable> getRoomTable(Session session, String roomType){
		
		String hibernateQuery = "FROM RoomTable AS E WHERE E.roomType = :Type and E.roomStatus =:Status";
		Query query 		  = session.createQuery(hibernateQuery);
		query.setParameter("Type",roomType);
		query.setParameter("Status",true);
		
		List<RoomTable> roomList = ((org.hibernate.Query) query).list();
		
		//System.out.println("RoomList:" + roomList.size());
		return roomList;		
	}
	
	
	
}