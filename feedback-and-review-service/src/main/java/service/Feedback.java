package service;

import com.stackroute.FeedbackServiceGrpc;
import com.stackroute.User;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.time.LocalDate;


public class Feedback extends FeedbackServiceGrpc.FeedbackServiceImplBase
{
    @Override
    public void getfeedback(User.getfeedbackReq request, StreamObserver<User.getfeedbackResp> responseObserver) {
        int feedbackid = request.getFeedbcakId();
        User.getfeedbackResp.Builder feedbackresp = User.getfeedbackResp.newBuilder();
        String url = "jdbc:postgresql://localhost:5432/musicmantradb";
        String postgresqlUname="postgres";
        String postgresqlPass="Jaga@6565";

        try{
            Connection connection = DriverManager.getConnection(url, postgresqlUname, postgresqlPass);
            System.out.println("Connection established");
            String query = "SELECT feedbackid,bookingid,feedbackrating,message FROM public.feedback where feedbackid=?; ";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, feedbackid);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                feedbackresp.setFeedbackId(resultSet.getInt(1));
                feedbackresp.setBookingId(resultSet.getInt(2));
                feedbackresp.setFeedbackRating(resultSet.getInt(3));
                feedbackresp.setMessage(resultSet.getString(4));
                feedbackresp.setResponceCode(200);


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        responseObserver.onNext(feedbackresp.build());
        responseObserver.onCompleted();
    }

    @Override
    public void feedback(User.FeedbackReq request, StreamObserver<User.FeedbackResp> responseObserver)
    {
        System.out.println("Inside Feedback service");
        int feedbackid = request.getFeedbackId();
        int bookingid = request.getBookingId();
        int feedbackrating = request.getFeedbackRating();
        String message = request.getMessage();
        System.out.println("FeedbackId:" + feedbackid);
        System.out.println("BookingId:" + bookingid);
        System.out.println("FeedbackRating:" + feedbackrating);
        System.out.println("Message:" + message);



        User.FeedbackResp.Builder response = User.FeedbackResp.newBuilder();

            if (feedbackid != 0) {
                response.setResponceMessage("SUCCESS").setResponceCode(200);
            } else {
                response.setResponceMessage("Invalid feedbackId").setResponceCode(400);
            }

            if (bookingid != 0 && feedbackrating <=5) {
                response=storeDetails(feedbackid,bookingid,feedbackrating,message);
            } else {
                response.setResponceMessage("Invalid bookingId").setResponceCode(400);
            }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }
    public User.FeedbackResp.Builder storeDetails(int FeedbackId,int BookingId,int FeedbackRating,String Message)
    {
        User.FeedbackResp.Builder response = User.FeedbackResp.newBuilder();
        String url = "jdbc:postgresql://localhost:5432/musicmantradb";
        String postgresqlUname="postgres";
        String postgresqlPass="Jaga@6565";

        try{
            Connection connection = DriverManager.getConnection(url, postgresqlUname, postgresqlPass);
            System.out.println("Connection established");
            String query1 ="SELECT  enddate FROM public.sessions where sessionid=(SELECT sessionid FROM public.bookings where bookingid=?);";
            PreparedStatement stmt1 = connection.prepareStatement(query1);
            stmt1.setInt(1,BookingId);
            ResultSet resultSet1=stmt1.executeQuery();
            LocalDate sessiontodate=null;
            while( resultSet1.next()){
                 sessiontodate= resultSet1.getDate(1).toLocalDate();

            }
            if(sessiontodate.isBefore(LocalDate.now())){
                String query = "Insert into feedback(bookingid,feedbackrating,message )values(?,?,?); ";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setInt(1, BookingId);
                stmt.setInt(2, FeedbackRating);
                stmt.setString(3, Message);
                stmt.executeUpdate();
                response.setResponceCode(200);
                response.setResponceMessage("sucessfully inserted feedback");
            }
           else{
               response.setResponceCode(400);
               response.setResponceMessage("session not yet started");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return response;
    }
}
