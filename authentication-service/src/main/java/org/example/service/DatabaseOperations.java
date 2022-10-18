package org.example.service;




import org.example.UserRegister;

import java.sql.*;

public class DatabaseOperations {
    public static int addRegistraion(String username, String fname, String lname, String email, String contact, String password, String usertype) {
        Connection connection = DatabaseConnection.getConnection();
        String query = "Insert into registration(username,first_name,last_name,emailId,contact,password,usertype) values(?,?,?,?,?,?,?)";
        String query1 = "Select user_id from registration where emailid=?";
        int userId = 0;
        try {
            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setString(1, username);
            stmnt.setString(2, fname);
            stmnt.setString(3, lname);
            stmnt.setString(4, email);
            stmnt.setString(5, contact);
            stmnt.setString(6, password);
//            stmnt.setString(7, s);
            stmnt.setString(7, usertype);

            stmnt.executeUpdate();
            PreparedStatement stmnt1 = connection.prepareStatement(query1);
            stmnt1.setString(1, email);
            ResultSet rs = stmnt1.executeQuery();
            while (rs.next()) {
                userId = rs.getInt(1);
            }
            UserRegister.APIResponse1.Builder regResponse = UserRegister.APIResponse1.newBuilder();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userId;
    }


    public static void addAddress(String city, String state, String pincode, int userID) {
        Connection connection = DatabaseConnection.getConnection();
        String query = "Insert into address(user_id,city,state,pincode) values(?,?,?,?)";
        try {
            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setInt(1, userID);
            stmnt.setString(2, city);
            stmnt.setString(3, state);
            stmnt.setString(4, pincode);

            stmnt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void addPreferences(String[] genre, String[] instrument, int userID){
        Connection connection = DatabaseConnection.getConnection();

        String query="INSERT INTO public.preferences( user_id, genre, instruments) VALUES (?,?,?)";
        try{
            PreparedStatement stmnt=connection.prepareStatement(query);
            Array array = connection.createArrayOf("VARCHAR",genre);
            Array array1 = connection.createArrayOf("VARCHAR",instrument);
            stmnt.setInt(1,userID);
            stmnt.setArray(2,array);
            stmnt.setArray(3,array1);

            stmnt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

