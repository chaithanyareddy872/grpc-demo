package com.musicmantra.classbooking.databaseOperations;

import com.musicmantra.classbooking.postBookingReq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Properties;

//class to perform all sql operations
public class DatabaseOperations {
    // class to get the connection obj from database
    private final String url = "jdbc:postgresql://localhost:5432/classbooking";
    private final String user = "postgres";
    private final String password = "root123";

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
                    "studentid,teacherid,instrumentid,genreid,dateTime,status) values(?,?,?,?,?,?);");
            //setting up the values
            preparedStatement.setLong(1,postBookingReq.getStudentid());
            preparedStatement.setLong(2,postBookingReq.getTeacherid());
            preparedStatement.setLong(3,postBookingReq.getInstrumentid());
            preparedStatement.setLong(4,postBookingReq.getGenreid());
            //converting google protobuff date to localdatetime formate
            Instant instant =  Instant.ofEpochSecond(postBookingReq.getDateTime().getSeconds() ,
                    postBookingReq.getDateTime().getNanos());
            LocalDateTime ldt = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
            preparedStatement.setTimestamp(5, Timestamp.valueOf(ldt));
            preparedStatement.setString(6,postBookingReq.getStatus());
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
}