package com.musicmantra.classbooking.databaseOperations;

import com.google.protobuf.Timestamp;
import com.musicmantra.classbooking.addnewrecord.deleteBookingReq;
import com.musicmantra.classbooking.addnewrecord.multiBookingReq;
import com.musicmantra.classbooking.addnewrecord.postBookingReq;
import com.musicmantra.classbooking.addnewrecord.updatereq;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Properties;

//class to perform all sql operations
public class DatabaseOperations {

    public Connection connection() throws IOException {
        InputStream input = new FileInputStream("class-booking-service/src/main/resources/application.properties");

        Properties prop = new Properties();

        // load a properties file
        prop.load(input);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    prop.getProperty("database.url"),prop.getProperty("database.username"),
                    prop.getProperty("database.password"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    //method to insert a record into the database
    public boolean storeindb(Connection conn,postBookingReq postBookingReq) throws SQLException {
        boolean status=false;
        try {
            //preparing the insert statement
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO bookinginfo(" +
                    "studentid,sessionid,datetime,status) values(?,?,?,?);");
            //setting up the values
            preparedStatement.setLong(1,postBookingReq.getStudentid());
            preparedStatement.setLong(2,postBookingReq.getSessionid());
            //converting google protobuff date to localdatetime formate
            Instant instant =  Instant.ofEpochSecond(postBookingReq.getDateTime().getSeconds() ,
                    postBookingReq.getDateTime().getNanos());
            LocalDateTime ldt = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
            preparedStatement.setTimestamp(3, java.sql.Timestamp.valueOf(ldt));
            preparedStatement.setString(4,postBookingReq.getStatus());
            //calling the execute method and getting how many records effected
            int noofinsertedrec = preparedStatement.executeUpdate();
            //checking the rows created or not by using affected rows count > 0
            //and setting the status
            if (noofinsertedrec > 0) {
                status=true;
            } else {
                status= false;
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return status;
    }

    public boolean updateindb(Connection conn, updatereq updatereq) {
        boolean status=false;
        try {
      // preparing the insert statement
      PreparedStatement preparedStatement =
          conn.prepareStatement(
              "UPDATE public.bookinginfo "
                  + "SET datetime=?, status=? "
                  + "WHERE (bookingid=? );");
            //setting up the values
            //converting google protobuff date to localdatetime formate
            Instant instant =  Instant.ofEpochSecond(updatereq.getDateTime().getSeconds() ,
                    updatereq.getDateTime().getNanos());
            LocalDateTime ldt = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
            preparedStatement.setTimestamp(1,java.sql.Timestamp.valueOf(ldt));
            preparedStatement.setString(2,updatereq.getStatus());
            preparedStatement.setLong(3,updatereq.getBookingid());
            //calling the execute method and getting how many records effected
            int noofinsertedrec = preparedStatement.executeUpdate();
            //checking the rows created or not by using affected rows count > 0
            //and setting the status
            if (noofinsertedrec > 0) {
                status=true;
            } else {
                status= false;
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return status;
    }

    public boolean deleteindb(Connection conn, deleteBookingReq deletebookingreq) {
        boolean status=false;
        try {
            // preparing the insert statement
            PreparedStatement preparedStatement =
                    conn.prepareStatement(
                            "DELETE from public.bookinginfo "
                                    + "WHERE (bookingid=?);");
            //deleting the records
            preparedStatement.setLong(1,deletebookingreq.getBookingid());
            //calling the execute method and getting how many records effected
            int noofinsertedrec = preparedStatement.executeUpdate();
            //checking the rows created or not by using affected rows count > 0
            //and setting the status
            if (noofinsertedrec > 0) {
                status=true;
            } else {
                status= false;
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return status;
    }
    public ResultSet getallbookings(Connection conn, multiBookingReq multiBookingReq){

        ResultSet resultSet = null;
        try{
            PreparedStatement preparedStatement=conn.prepareStatement("select * from public.bookinginfo " +
                    "where studentid=?");
            preparedStatement.setLong(1,multiBookingReq.getUserid());
            resultSet= preparedStatement.executeQuery();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return resultSet;
    }
    public ResultSet getallsessionbookings(Connection conn, multiBookingReq multiBookingReq){

        ResultSet resultSet = null;
        try{
            PreparedStatement preparedStatement=conn.prepareStatement("select * from public.bookinginfo " +
                    "where sessionid=?");
            preparedStatement.setLong(1,multiBookingReq.getUserid());
            resultSet= preparedStatement.executeQuery();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return resultSet;
    }
    public Timestamp.Builder convertTimestamp(java.sql.Timestamp timestamp){
        LocalDateTime exampleInput=timestamp.toLocalDateTime();
    Instant javaTimeInstant = exampleInput.atZone(ZoneId.systemDefault()).toInstant();
                Timestamp.Builder ts = com.google.protobuf.Timestamp.newBuilder();
                        ts.setSeconds(javaTimeInstant.getEpochSecond())
                        .setNanos(javaTimeInstant.getNano());
                        return ts;
    }
}