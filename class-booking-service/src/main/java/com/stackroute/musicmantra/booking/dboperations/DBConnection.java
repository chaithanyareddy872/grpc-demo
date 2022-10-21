package com.stackroute.musicmantra.booking.dboperations;

import com.stackroute.musicmantra.booking.BookingMethodsOuterClass;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DBConnection {

    public Connection getConnection() throws ClassNotFoundException {
        // Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/classbooking";
        String psqlname = "postgres";
        String psqlpassword = "root123";
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, psqlname, psqlpassword);
            return connection;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public BookingMethodsOuterClass.getBookingResp getBookingDetails(int stuid, int sessid) throws SQLException, ClassNotFoundException {

        Connection conn = getConnection();
        String query = "SELECT bookingid, studentid, sessionid, status, datetime from bookinginfo where studentid = '" + stuid + "' AND sessionid= '" + sessid + "';";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        BookingMethodsOuterClass.getBookingResp.Builder booking = BookingMethodsOuterClass.getBookingResp.newBuilder();


        if (rs.next()) {
            booking.setBookingid(rs.getInt(1));
            booking.setStudentid(rs.getInt(2));
            booking.setSessionid(rs.getInt(3));
            booking.setStatus(rs.getString(4));
           booking.setBookingdatetime(convertTimestamp(rs.getTimestamp(5)));
            return booking.build();
        } else {
            return null;
        }
    }
    public static com.google.protobuf.Timestamp.Builder convertTimestamp(java.sql.Timestamp timestamp){
        LocalDateTime exampleInput=timestamp.toLocalDateTime();
        Instant javaTimeInstant = exampleInput.atZone(ZoneId.systemDefault()).toInstant();
        com.google.protobuf.Timestamp.Builder ts = com.google.protobuf.Timestamp.newBuilder();
        ts.setSeconds(javaTimeInstant.getEpochSecond())
                .setNanos(javaTimeInstant.getNano());
        return ts;
    }


}





