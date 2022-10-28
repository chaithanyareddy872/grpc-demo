package service;

import com.stackroute.FeedbackServiceGrpc;
import com.stackroute.User;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Feedback extends FeedbackServiceGrpc.FeedbackServiceImplBase
{

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

            if (bookingid != 0) {
                response.setResponceMessage("SUCCESS").setResponceCode(200);
            } else {
                response.setResponceMessage("Invalid bookingId").setResponceCode(400);
            }
            if (feedbackrating <=5) {
                response.setResponceMessage("SUCCESS").setResponceCode(200);
            } else {
                response.setResponceMessage("Invalid Rating").setResponceCode(400);
            }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

            if (message.equals(message)) {
                response.setResponceMessage("SUCCESS").setResponceCode(200);
            } else {
                response.setResponceMessage("Invalid message").setResponceCode(400);
            }

        storeDetails(feedbackid,bookingid,feedbackrating,message);

    }
    public void storeDetails(int FeedbackId,int BookingId,int FeedbackRating,String Message)
    {
        String url = "jdbc:postgresql://localhost:5432/musicmantradb";
        String postgresqlUname="postgres";
        String postgresqlPass="Jaga@6565";

        try{
            Connection connection = DriverManager.getConnection(url, postgresqlUname, postgresqlPass);
            System.out.println("Connection established");
            String query = "Insert into musicmantradb.feedback(feedbackid,bookingid,feedbackrating,message )values(?,?,?,?); ";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, FeedbackId);
            stmt.setInt(2, BookingId);
            stmt.setInt(3, FeedbackRating);
            stmt.setString(4, Message);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
