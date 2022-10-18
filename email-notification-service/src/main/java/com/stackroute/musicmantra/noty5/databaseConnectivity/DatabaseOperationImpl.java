package com.stackroute.musicmantra.noty5.databaseConnectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;

public class DatabaseOperationImpl implements DatabseOperation {
	
	Connect connect = new Connect();


	@Override
	public String getUserEmailId(String userId) {
		 Connection conn = connect.getConnection();
		 String emailId = null;
		    String query = "select emailid from user_info where user_id=?";

		    try {

		        PreparedStatement stmnt = conn.prepareStatement(query);
		        
		        stmnt.setInt(1, Integer.parseInt(userId)  );
		        ResultSet resultSet = stmnt.executeQuery();

		        if (resultSet.next()) {
		             emailId = resultSet.getString(1) ;
		        } else {
		            throw new Noty5Exceptions(null)       ; }
		    } catch (SQLException e) {
		        throw new RuntimeException(e);
		    }
		    return emailId;
	}

}
