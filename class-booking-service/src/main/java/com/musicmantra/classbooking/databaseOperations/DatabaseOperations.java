package com.musicmantra.classbooking.databaseOperations;

import com.musicmantra.classbooking.validation.Validations;
import com.musicmantra.classbooking.generatedfiles.BookingResp;
import com.musicmantra.classbooking.generatedfiles.multiBookingResp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Properties;



//class to perform all sql operations
public class DatabaseOperations {
    Validations validations=new Validations();
    BookingResp.Builder bookingres= BookingResp.newBuilder();

    //method to get a connection obj with coneected to database
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
    public BookingResp.Builder storeindb(Connection conn, Long studentid, Long sessionid,
                                         LocalDateTime timestamp, String bookingstatus) throws SQLException {
        try {
            if(studentid>0 && sessionid >0 && bookingstatus!=null
                    && (bookingstatus.length()>0&&validations.stringvalidation(bookingstatus))) {
                PreparedStatement preparedStatement1=conn.prepareStatement(
                        "select startdate from public.sessions where sessionid=?;");
                preparedStatement1.setLong(1,sessionid);
                ResultSet resultSet= preparedStatement1.executeQuery();
                LocalDateTime localDateTime=null;
                while (resultSet.next()){
                    localDateTime= resultSet.getTimestamp(1).toLocalDateTime();
                }
                if(localDateTime.isAfter(LocalDateTime.now())) {
                    //preparing the insert statement
                    PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO bookings(" +
                            "studentid,sessionid,datetime,status) values(?,?,?,?);");
                    //setting up the values
                    preparedStatement.setLong(1, studentid);
                    preparedStatement.setLong(2, sessionid);
                    preparedStatement.setTimestamp(3, java.sql.Timestamp.valueOf(timestamp));
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
                else throw new RuntimeException("sorry, we can't book this session for" +
                        " you because the session already expired");
            }
            else throw new RuntimeException("inputs are invalid");
        } catch (Exception exception) {
            bookingres.setMsg(exception.getMessage());
            bookingres.setStatuscode(404);
        }
        return bookingres;
    }

    //method to update a record in database
    public BookingResp.Builder updateindb(Connection conn,Long bookingid,LocalDateTime timestamp,String status) {
        try {
            if(bookingid>0&&validations.stringvalidation(status)){

                // preparing the insert statement
                PreparedStatement preparedStatement =
                        conn.prepareStatement(

                                "UPDATE public.bookings "
                                        + "SET datetime=?, status=? "
                                        + "WHERE (bookingid=? );");
                //setting up the values
                //converting google protobuff date to localdatetime formate

                preparedStatement.setTimestamp(1,java.sql.Timestamp.valueOf(timestamp));
                preparedStatement.setString(2,status);
                preparedStatement.setLong(3,bookingid);
                //calling the execute method and getting how many records effected
                int noofinsertedrec = preparedStatement.executeUpdate();
                if(noofinsertedrec>0) {
                    bookingres.setMsg("successfully updated a record");
                    bookingres.setStatuscode(200);
                }
                else throw new RuntimeException("no record found to update");
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
                            "DELETE from public.bookings "
                                    + "WHERE (bookingid=?);");
            //deleting the records
            preparedStatement.setLong(1,bookingid);

            //calling the execute method and getting how many records effected
            int noofinsertedrec = preparedStatement.executeUpdate();
            System.out.println("deleted no of records:"+noofinsertedrec);
            //checking the rows created or not by using affected rows count > 0
            //and setting the status
            if (noofinsertedrec > 0) {
                bookingres.setMsg("successfully deleted a record");
                bookingres.setStatuscode(200);
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
                        " datetime from bookings where studentid = '" + stuid +
                        "' AND sessionid= '" + sessid + "';";
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    booking.setBookinid(rs.getInt(1));
                    booking.setStudentid(rs.getInt(2));
                    booking.setSessionid(rs.getInt(3));
                    booking.setBookingstatus(rs.getString(4));
                    booking.setLastupdate(String.valueOf(rs.getTimestamp(5)));
                } else {
                    booking.setStatuscode(404);
                    booking.setErrormsg("no record found");
                }
            }
            else {
                throw new RuntimeException("invalid input");
            }
        }
        catch (Exception e){
            booking.setErrormsg(e.getMessage());
            booking.setStatuscode(400);
        }

        return booking;
    }
    //method to get all bookings based on studentid
    public ResultSet getallbookings(Connection conn, Long studentid){

        ResultSet resultSet = null;
        try{
            PreparedStatement preparedStatement=conn.prepareStatement("select * from public.bookings " +
                    "where studentid=?");
            preparedStatement.setLong(1,studentid);
            resultSet= preparedStatement.executeQuery();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return resultSet;
    }
    public ResultSet getallsessionbookings(Connection conn, Long sessionid){

        ResultSet resultSet = null;
        try{
            PreparedStatement preparedStatement=conn.prepareStatement("select * from public.bookings " +
                    "where sessionid=?");
            preparedStatement.setLong(1,sessionid);
            resultSet= preparedStatement.executeQuery();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return resultSet;
    }
}