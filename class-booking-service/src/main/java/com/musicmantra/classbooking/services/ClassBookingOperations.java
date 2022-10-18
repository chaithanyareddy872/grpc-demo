package com.musicmantra.classbooking.services;
import com.musicmantra.classbooking.addnewrecord.*;


import com.musicmantra.classbooking.databaseOperations.DatabaseOperations;
import io.grpc.stub.StreamObserver;


import java.sql.Connection;
import java.sql.ResultSet;


//class for posting a single record into database
public class ClassBookingOperations extends ClassBookingGrpc.ClassBookingImplBase {
    BookingResp.Builder bookingresponse = BookingResp.newBuilder();
    DatabaseOperations databaseOperations=new DatabaseOperations();
    @Override
    public void updateBooking(updatereq request, StreamObserver<BookingResp> responseObserver) {
        try{
            //getting connection by connecting to database
            Connection conn=databaseOperations.connection();
            //setting up response based on the operation performed
            if (databaseOperations.updateindb(conn,request)){
                bookingresponse.setMsg("successfully updated a record");
                bookingresponse.setStatuscode(200);
            }
            else{
                bookingresponse.setMsg("inputs does not exist");
                bookingresponse.setStatuscode(400);
            }
        }
        //handling exception
        catch (Exception e){
            bookingresponse.setMsg(e.getMessage());
        }

        //building the response object and calling oncompleted on it for completion of responseobserver
        responseObserver.onNext(bookingresponse.build());
        responseObserver.onCompleted();
    }



    //overriding the postBooking method
    @Override
    public void postBooking(postBookingReq request, StreamObserver<BookingResp> responseObserver) {
        //creating builder object for response
        try{
            //getting connection by connecting to database
            Connection conn=databaseOperations.connection();
            //setting up response based on the operation performed
            if (databaseOperations.storeindb(conn,request)){
                bookingresponse.setMsg("successfully inserted a record");
                bookingresponse.setStatuscode(200);
            }
            else{
                bookingresponse.setMsg("please provide proper inputs");
                bookingresponse.setStatuscode(400);
            }
        }
        //handling exception
        catch (Exception e){
            bookingresponse.setMsg(e.getMessage());
        }

        //building the response object and calling oncompleted on it for completion of responseobserver
        responseObserver.onNext(bookingresponse.build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteBooking(deleteBookingReq request, StreamObserver<BookingResp> responseObserver) {
        try{
            //getting connection by connecting to database
            Connection conn=databaseOperations.connection();
            //setting up response based on the operation performed
            if (databaseOperations.deleteindb(conn,request)){
                bookingresponse.setMsg("successfully deleted a record");
                bookingresponse.setStatuscode(200);
            }
            else{
                bookingresponse.setMsg("Booking does not exist");
                bookingresponse.setStatuscode(404);
            }
        }
        //handling exception
        catch (Exception e){
            bookingresponse.setMsg(e.getMessage());
        }
        responseObserver.onNext(bookingresponse.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getallstudentbookings(multiBookingReq request, StreamObserver<multiBookingResp> responseObserver) {
        multiBookingResp.Builder multibookingresp=multiBookingResp.newBuilder();
        try{
            Connection conn=databaseOperations.connection();
            ResultSet resultSet=databaseOperations.getallbookings(conn,request);
            while (resultSet.next()){
                multibookingresp.setBookinid(resultSet.getLong(1));
                multibookingresp.setStudentid(resultSet.getLong(2));
                multibookingresp.setSessionid(resultSet.getLong(3));
                multibookingresp.setDateTime(databaseOperations.convertTimestamp(resultSet.getTimestamp(4)));
                multibookingresp.setStatus(resultSet.getString(5));
                responseObserver.onNext(multibookingresp.build());
            }
        }catch (Exception e){
            bookingresponse.setMsg(e.getMessage());
        }
        responseObserver.onCompleted();
    }
}