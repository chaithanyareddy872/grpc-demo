package com.musicmantra.classbooking.databaseOperations;

import com.google.protobuf.Timestamp;
import com.musicmantra.classbooking.validation.Validations;
import com.musicmantra.classbooking.generatedfiles.BookingResp;
import com.musicmantra.classbooking.generatedfiles.multiBookingReq;
import com.musicmantra.classbooking.generatedfiles.multiBookingResp;


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
    Validations validations=new Validations();
    BookingResp.Builder bookingres= BookingResp.newBuilder();

    //method to get a connection obj with coneected to database
    public Connection connection() throws IOException {
        InputStream input = new FileInputStream("/home/global/git/musicmantra/masterr/class-booking-service/src/main/resources/application.properties");

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
    public BookingResp.Builder storeindb(Connection conn, Long studentid, Long sessionid,
                                         Timestamp timestamp, String bookingstatus) throws SQLException {
        try {
            if(studentid>0 && sessionid >0 && bookingstatus!=null
                    && (bookingstatus.length()>0&&validations.stringvalidation(bookingstatus)
                    && validations.dateandtimevalidation(timestamp))) {
                //preparing the insert statement
                PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO bookings(" +
                        "studentid,sessionid,datetime,status) values(?,?,?,?);");
                //setting up the values
                preparedStatement.setLong(1, studentid);
                preparedStatement.setLong(2, sessionid);
                //converting google protobuff date to localdatetime formate
                Instant instant = Instant.ofEpochSecond(timestamp.getSeconds(),
                        timestamp.getNanos());
                LocalDateTime ldt = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
                preparedStatement.setTimestamp(3, java.sql.Timestamp.valueOf(ldt));
                preparedStatement.setString(4, bookingstatus);
                //calling the execute method and getting how many records effected
                int noofinsertedrec = preparedStatement.executeUpdate();
                //checking the rows created or not by using affected rows count > 0
                //and setting the status
                if (noofinsertedrec > 0) {
                    bookingres.setMsg("successfully inserted a record");
                    bookingres.setStatuscode(200);
                }
            }
            else throw new RuntimeException("inputs are invalid");
        } catch (Exception exception) {
            bookingres.setMsg(exception.getMessage());
            bookingres.setStatuscode(404);
        }
        return bookingres;
    }

    //method to update a record in database
    public BookingResp.Builder updateindb(Connection conn,Long bookingid,Timestamp timestamp,String status) {

        try {
            if(bookingid>0&&validations.stringvalidation(status)&& validations.dateandtimevalidation(timestamp)){
            // preparing the insert statement
            PreparedStatement preparedStatement =
                    conn.prepareStatement(
                            "UPDATE public.bookinginfo "
                                    + "SET datetime=?, status=? "
                                    + "WHERE (bookingid=? );");
            //setting up the values
            //converting google protobuff date to localdatetime formate
            Instant instant =  Instant.ofEpochSecond(timestamp.getSeconds() ,timestamp.getNanos());
            LocalDateTime ldt = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
            preparedStatement.setTimestamp(1,java.sql.Timestamp.valueOf(ldt));
            preparedStatement.setString(2,status);
            preparedStatement.setLong(3,bookingid);
            //calling the execute method and getting how many records effected
            int noofinsertedrec = preparedStatement.executeUpdate();

                bookingres.setMsg("successfully updated a record");
                bookingres.setStatuscode(200);
            } else {
                bookingres.setMsg("inputs does not exist");
                bookingres.setStatuscode(404);
            }
        } catch (Exception exception) {
            bookingres.setMsg(exception.getMessage());
            bookingres.setStatuscode(400);
        }
        return bookingres;
    }

    //method to delete one record from database
    public BookingResp.Builder  deleteindb(Connection conn, Long bookingid) {

        try {

            // preparing the insert statement
            PreparedStatement preparedStatement =
                    conn.prepareStatement(
                            "DELETE from public.bookinginfo "
                                    + "WHERE (bookingid=?);");
            //deleting the records
            preparedStatement.setLong(1,bookingid);
            //calling the execute method and getting how many records effected
            int noofinsertedrec = preparedStatement.executeUpdate();
            //checking the rows created or not by using affected rows count > 0
            //and setting the status
            if (noofinsertedrec > 0) {
                {
                    bookingres.setMsg("successfully deleted a record");
                    bookingres.setStatuscode(200);
                }
            } else{
                bookingres.setMsg("Booking does not exist");
                bookingres.setStatuscode(404);
            }
        } catch (Exception exception) {
            bookingres.setMsg(exception.getMessage());
        }
        return bookingres;
    }
    //method to get one record
    public multiBookingResp.Builder getBookingDetails(Connection conn , Long stuid, Long sessid){
        multiBookingResp.Builder booking = multiBookingResp.newBuilder();
        try {
            if (stuid>0&&sessid>0) {
                String query = "SELECT bookingid, studentid, sessionid, status," +
                        " datetime from bookinginfo where studentid = '" + stuid +
                        "' AND sessionid= '" + sessid + "';";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    booking.setBookinid(rs.getInt(1));
                    booking.setStudentid(rs.getInt(2));
                    booking.setSessionid(rs.getInt(3));
                    booking.setBookingstatus(rs.getString(4));
                    booking.setDateTime(convertTimestamp(rs.getTimestamp(5)));
                } else {
                    booking.setStatuscode(404);
                    booking.setBookingstatus("no record found");
                }
            }
            else {
                throw new RuntimeException("invalid input");
            }
        }
        catch (Exception e){
            booking.setBookingstatus(e.getMessage());
            booking.setStatuscode(400);
        }

        return booking;
    }
    //method to get all bookings based on studentid
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