package org.example.service;



import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.UserRegister;

import java.sql.*;
import java.util.Base64;
import java.util.Random;

public class DatabaseOperations {
    //add reg method
    public static int addRegistraion(String username, String fname, String lname, String email, String contact, String password, String usertype) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encdPassword = encoder.encodeToString(password.getBytes());
        Connection connection = DatabaseConnection.getConnection();
        String query = ConstantQuery.INSERTUSERINFO;
        String query1 = ConstantQuery.GETUSERID;
        int userId = 0;
        try {
            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setString(1, username);
            stmnt.setString(2, fname);
            stmnt.setString(3, lname);
            stmnt.setString(4, email);
            stmnt.setString(5, contact);
            stmnt.setString(6, encdPassword);
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
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return userId;
    }

    public static void addstudent(int userID) {
        Connection connection = DatabaseConnection.getConnection();
        String query1 = ConstantQuery.INSERTSTUDENTINFO;
        try {
            PreparedStatement stmnt = connection.prepareStatement(query1);
            stmnt.setInt(1, userID);
            stmnt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void addteacher(int userID) {
        Connection connection = DatabaseConnection.getConnection();
        String query1 = ConstantQuery.INSERTTEACHERINFO;
        try {
            PreparedStatement stmnt = connection.prepareStatement(query1);
            stmnt.setInt(1, userID);
            stmnt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void addAddress(String city, String state, String pincode, int userID) {
        Connection connection = DatabaseConnection.getConnection();
        String query = ConstantQuery.INSERTADDRESS;
        try {
            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setInt(1, userID);
            stmnt.setString(2, city);
            stmnt.setString(3, state);
            stmnt.setString(4, pincode);

            stmnt.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void addPreferences(String[] genre, String[] instrument, int userID) {
        Connection connection = DatabaseConnection.getConnection();

        String query = ConstantQuery.INSERTPREFRENCES;
        try {
            PreparedStatement stmnt = connection.prepareStatement(query);
            Array array = connection.createArrayOf("VARCHAR", genre);
            Array array1 = connection.createArrayOf("VARCHAR", instrument);
            stmnt.setInt(1, userID);
            stmnt.setArray(2, array);
            stmnt.setArray(3, array1);

            stmnt.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }


    public static void upDatePassword(String email, String password) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encdPassword = encoder.encodeToString(password.getBytes());
        System.out.println(email);
        System.out.println(password);
        Connection connection = DatabaseConnection.getConnection();
        String query = ConstantQuery.UPDATEPASSWORD;
        try {
            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setString(1, encdPassword);
            stmnt.setString(2, email);

            stmnt.executeUpdate();

            connection.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}







