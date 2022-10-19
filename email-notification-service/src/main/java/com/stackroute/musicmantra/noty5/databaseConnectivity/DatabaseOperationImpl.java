package com.stackroute.musicmantra.noty5.databaseConnectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.constants.UserType;
import com.stackroute.musicmantra.noty5.domain.api.Booking;
import com.stackroute.musicmantra.noty5.domain.api.User;

public class DatabaseOperationImpl implements DatabseOperation {
	
	Connect connect = new Connect();
	Connection conn = connect.getConnection();


	@Override
	public String getUserEmailId(String userId) {
		 String emailId = null;
		    String query = "select emailid from user_info where user_id=?";

		    try {

		        PreparedStatement stmnt = conn.prepareStatement(query);
		        
		        stmnt.setInt(1, Integer.parseInt(userId)  );
		        ResultSet resultSet = stmnt.executeQuery();

		        if (resultSet.next()) {
		             emailId = resultSet.getString(1) ;
		        } else {
		            throw new Noty5Exceptions(null);
		            }
		    } catch (SQLException e) {
		        throw new RuntimeException(e);
		    }
		    return emailId;
	}


	@Override
	public User[] getbookingMail(int bookingid, String bookingType) {

		
		Connection conn = connect.getConnection();
		    String getstudentdetails = "select emailid, first_name from user_info where user_id in(select user_id from student where studentid=(select studentid from bookings where bookingid=?))";
		    String getTeacherDetails = "select emailid, first_name from user_info where user_id in(select user_id from teacher where teacherid=(select teacherid from bookings where bookingid=?))";
		    String getInstumentname = "select instrumrntname from instrument where instrumentid = (select instrumentid from bookings where bookingid ="+ bookingid+")";
		    String getDate = "";

	        User[] users = new User[2];
	        User student = new User();
	        student.setType(UserType.STUDENT);
	        
	        User teacher = new User();
	        teacher.setType(UserType.TEACHER);
	        
	        
	        Booking booking = new Booking();
	        booking.setBookingType(bookingType);
	        
        
		    try {

		    	setUserDetails(student, getstudentdetails, bookingid);
		    	setUserDetails(teacher, getTeacherDetails, bookingid);
		        
		        ResultSet rs = conn.prepareStatement(getInstumentname).executeQuery();
		        if (rs.next()) {
		        	booking.setInstrumentName(rs.getString(1));
		        } 
		        
		        student.setBookings(booking);
		        teacher.setBookings(booking);
		        
		        users[0] = student;
		        users[1]= teacher;
		       
		    } catch (SQLException e) {
		        throw new RuntimeException(e);
		    }
		    
		return users;
	}

	private  void setUserDetails(User user, String query, int bookingId) throws SQLException {
		PreparedStatement stmnt = conn.prepareStatement(query);
        
        stmnt.setInt(1, bookingId );
        ResultSet rs = stmnt.executeQuery();

       
        while(rs.next()) {
        	for (int i = 1; i <= 1; i++) {
        		 user.setEmailid(rs.getString("emailid"));
        		 user.setFirstName(rs.getString("first_name"));
            }
        	
        }
	}
}
