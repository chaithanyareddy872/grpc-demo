package com.musicmantra.classbooking.services;
import com.musicmantra.classbooking.addnewrecord.ClassBookingGrpc;
import com.musicmantra.classbooking.databaseOperations.DatabaseOperations;
import com.musicmantra.classbooking.addnewrecord.postBookingReq;
import com.musicmantra.classbooking.addnewrecord.postBookingResp;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;

//class for posting a single record into database
public class PostClassBooking extends ClassBookingGrpc.ClassBookingImplBase {
    //overriding the postBooking method
    @Override
    public void postBooking(postBookingReq request, StreamObserver<postBookingResp> responseObserver) {
        //creating builder object for response
        postBookingResp.Builder postbookingresponse = postBookingResp.newBuilder();
        DatabaseOperations databaseOperations=new DatabaseOperations();
        try{
            //getting connection by connecting to database
            Connection conn=databaseOperations.connection();
            //setting up response based on the operation performed
            if (databaseOperations.storeindb(conn,request)){
                postbookingresponse.setMsg("successfully inserted a record");
                postbookingresponse.setStatuscode(200);
            }
            else{
                postbookingresponse.setMsg("something went wrong");
                postbookingresponse.setStatuscode(400);
            }
        }
        //handling exception
        catch (Exception e){
            postbookingresponse.setMsg(e.getMessage());
        }
        //building the response object and calling oncompleted on it for completion of responseobserver
        responseObserver.onNext(postbookingresponse.build());
        responseObserver.onCompleted();
    }
}