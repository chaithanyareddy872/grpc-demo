package com.musicmantra.classbooking.services;
import com.google.protobuf.Timestamp;
import com.musicmantra.classbooking.generatedfiles.*;
import com.musicmantra.classbooking.channel.ConnectToNoty;
import com.musicmantra.classbooking.databaseOperations.DatabaseOperations;
import com.musicmantra.classbooking.interceptor.Constants;
import com.musicmantra.classbooking.validation.Validations;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.time.LocalDateTime;

//class for manupulations of records in database
public class ClassBookingOperations extends ClassBookingGrpc.ClassBookingImplBase {
    //creating booking response object
    BookingResp.Builder bookingresponse = BookingResp.newBuilder();
    //database operation object creation
    DatabaseOperations databaseOperations=new DatabaseOperations();
    Timestamp timestamp;
    Validations validations=new Validations();
    @Override
    //method to update an existing record based on bookingid
    public void updateBooking(updatereq request, StreamObserver<BookingResp> responseObserver) {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("student")){
            try{
                if(request!=null && validations.statusvalidation(request.getStatus())) {
                    //getting connection by connecting to database
                    Connection conn = databaseOperations.connection();
                    Long bookinid = request.getBookingid();
                    String status = request.getStatus();
                    //setting up response based on the operation performed
                    bookingresponse = databaseOperations.updateindb(conn, bookinid, LocalDateTime.now(), status);
                    if(bookinid !=0 && validations.statusvalidation(status)) {
                        ConnectToNoty.sendBookingMail(Math.toIntExact(bookinid), status);
                    }
                    else {
                        throw new RuntimeException("status should be confirm or cancel");
                    }
                }
            }
            //handling exception
            catch (Exception e){
                bookingresponse.setMsg(e.getMessage());
            }

            //building the response object and calling oncompleted on it for completion of responseobserver
            responseObserver.onNext(bookingresponse.build());
            responseObserver.onCompleted();

        }else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }
    }

    //overriding the postBooking method
    @Override
    public void postBooking(postBookingReq request, StreamObserver<BookingResp> responseObserver) {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("student")){
            //creating builder object for response
            try{
                if(request!=null && validations.statusvalidation(request.getStatus())) {
                    //getting connection by connecting to database
                    Connection conn = databaseOperations.connection();
                    Long studentid=request.getStudentid();
                    Long sessionid=request.getSessionid();
                    String status=request.getStatus();
                    //setting up response based on the operation performed
                    bookingresponse=databaseOperations.storeindb(conn, studentid,sessionid,LocalDateTime.now(),status);
                    multiBookingResp.Builder bookinginfo=databaseOperations.getBookingDetails(conn,studentid,sessionid);
                    if(bookinginfo.getBookinid() !=0) {
                        ConnectToNoty.sendBookingMail((int) bookinginfo.getBookinid(), bookinginfo.getBookingstatus());
                    }
                    else {
                        throw new RuntimeException("record does not saved");
                    }
                }
                else{
                    bookingresponse.setMsg("please provide proper inputs");
                    bookingresponse.setStatuscode(400);
                }
            }
            //handling exception
            catch (Exception e){
                bookingresponse.setMsg(e.getMessage());
                bookingresponse.setStatuscode(404);
            }

            //building the response object and calling oncompleted on it for completion of responseobserver
            responseObserver.onNext(bookingresponse.build());
            responseObserver.onCompleted();

        }else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }
    }

    @Override
    //method to delete a single record based on booking id
    public void deleteBooking(deleteBookingReq request, StreamObserver<BookingResp> responseObserver) {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("student")){
            try{
                //getting connection by connecting to database
                Connection conn = databaseOperations.connection();

                if(request.getBookingid()>0) {
                    Long bookingid=request.getBookingid();
                    //setting up response based on the operation performed
                    bookingresponse = databaseOperations.deleteindb(conn, bookingid);
                }
                else{
                    throw new RuntimeException();
                }
            }
            //handling exception
            catch (Exception e){
                bookingresponse.setMsg("bad input request");
                bookingresponse.setStatuscode(400);
            }
            responseObserver.onNext(bookingresponse.build());
            responseObserver.onCompleted();

        }else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }
    }

    @Override
    //method to set response to all records based on the single  student
    public void getallstudentbookings(studentRecordsReq request, StreamObserver<multiBookingResp> responseObserver) {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("student")){
            multiBookingResp.Builder multiresp=multiBookingResp.newBuilder();

            try{
                Connection conn=databaseOperations.connection();
                ResultSet resultSet=databaseOperations.getallbookings(conn,request.getStudentid());
                if (!resultSet.isBeforeFirst()){
                    throw new RuntimeException("no record found");
                }
                while (resultSet.next()) {
                    multiresp.setBookinid(resultSet.getLong(1));
                    multiresp.setStudentid(resultSet.getLong(2));
                    multiresp.setSessionid(resultSet.getLong(3));
                    multiresp.setLastupdate(String.valueOf(resultSet.getTimestamp(4)));
                    multiresp.setBookingstatus(resultSet.getString(5));
                    multiresp.setStatuscode(200).build();
                    responseObserver.onNext(multiresp.build());
                }
            }catch (Exception e){
                multiresp.setStatuscode(404);
                multiresp.setErrormsg(e.getMessage());
                responseObserver.onNext(multiresp.build());
            }
            responseObserver.onCompleted();

        }else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }

    }

    @Override
    //method to set response to all records based on the single session
    public void getallsessionbookings(sessionBookingReq request, StreamObserver<multiBookingResp> responseObserver) {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("teacher")){
            multiBookingResp.Builder multiBookingResp=com.musicmantra.classbooking.generatedfiles.multiBookingResp.newBuilder();
            try{
                Connection conn=databaseOperations.connection();
                ResultSet resultSet=databaseOperations.getallsessionbookings(conn,request.getSessionid());
                if (!resultSet.isBeforeFirst()){
                    throw new RuntimeException("no record found");
                }
                while (resultSet.next()){
                    multiBookingResp.setBookinid(resultSet.getLong(1));
                    multiBookingResp.setStudentid(resultSet.getLong(2));
                    multiBookingResp.setSessionid(resultSet.getLong(3));
                    multiBookingResp.setLastupdate(String.valueOf(resultSet.getTimestamp(4)));
                    multiBookingResp.setBookingstatus(resultSet.getString(5));
                    multiBookingResp.setStatuscode(200);
                    responseObserver.onNext(multiBookingResp.build());
                }
            }
            catch (Exception e) {
                multiBookingResp.setStatuscode(404);
                multiBookingResp.setErrormsg(e.getMessage());
                responseObserver.onNext(multiBookingResp.build());
            }
            responseObserver.onCompleted();

        }else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }
    }
    @Override
    public void getBooking(getBookingReq request, StreamObserver<multiBookingResp> responseObserver) {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("student")){
            Long stuid= request.getStudentid();
            Long sessid= request.getSessionid();

            DatabaseOperations db = new DatabaseOperations();
            multiBookingResp.Builder response = multiBookingResp.newBuilder();
            try {
                Connection conn = db.connection();
                response= db.getBookingDetails(conn,stuid, sessid);
            } catch (Exception e) {
                response.setErrormsg("Internal error");
                response.setStatuscode(400);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }
    }
}