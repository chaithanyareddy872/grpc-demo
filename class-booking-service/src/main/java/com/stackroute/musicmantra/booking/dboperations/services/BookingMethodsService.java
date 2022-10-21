package com.stackroute.musicmantra.booking.dboperations.services;

import com.google.protobuf.Timestamp;
import com.stackroute.musicmantra.booking.BookingMethodsGrpc;
import com.stackroute.musicmantra.booking.BookingMethodsOuterClass;
import com.stackroute.musicmantra.booking.dboperations.DBConnection;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class BookingMethodsService extends BookingMethodsGrpc.BookingMethodsImplBase

{
    @Override
    public void getBooking(BookingMethodsOuterClass.getBookingReq request, StreamObserver<BookingMethodsOuterClass.getBookingResp> responseObserver) {
            int stuid= (int) request.getStudentid();
            int sessid= (int) request.getSessionid();
        BookingMethodsOuterClass.getBookingResp booking = null;
        
        DBConnection db = new DBConnection();
        try {
            booking= db.getBookingDetails(stuid, sessid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        BookingMethodsOuterClass.getBookingResp.Builder response = BookingMethodsOuterClass.getBookingResp.newBuilder();
        if(booking != null)
        {
            response.setBookingid(booking.getBookingid());
            response.setStudentid(booking.getStudentid());
            response.setSessionid(booking.getSessionid());
            response.setStatus(booking.getStatus());
           response.setBookingdatetime(booking.getBookingdatetime());
        }
        else {
            response.setStatus("Not a valid studentid or sessionid");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();



    }

}
