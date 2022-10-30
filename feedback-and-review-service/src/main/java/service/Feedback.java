package service;

import com.stackroute.FeedbackServiceGrpc;
import com.stackroute.User;
import interceptor.Constants;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Feedback extends FeedbackServiceGrpc.FeedbackServiceImplBase
{
/*
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
*/

    @Override
    public void getFeedbackforSession(User.getfeedbackReq request, StreamObserver<User.getfeedbackResp> responseObserver) {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("teacher")){

            String url = "jdbc:postgresql://localhost:5432/musicmantradb";
            String postgresqlUname="postgres";
            String postgresqlPass="root123";

            int sessionid=request.getSessionid();

            User.getfeedbackResp.Builder response=User.getfeedbackResp.newBuilder();

            List<User.getfeedbackResp.Builder> responses=new ArrayList<>();

            String query="select * from feedback where bookingid in (select bookingid from bookings where sessionid=?)";

            try {
                Connection connection=DriverManager.getConnection(url,postgresqlUname,postgresqlPass);

                System.out.println("***Connection Established***");

                PreparedStatement preparedStatement=connection.prepareStatement(query);
                preparedStatement.setInt(1,sessionid);

                ResultSet resultSet=preparedStatement.executeQuery();

                while(resultSet.next()){
                    response.setFeedbackId(resultSet.getInt(1))
                            .setBookingId(resultSet.getInt(2))
                            .setFeedbackRating(resultSet.getInt(3))
                            .setMessage(resultSet.getString(4))
                            .setResponceCode(200);

                    responses.add(response);

                    responseObserver.onNext(response.build());
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            if (responses.isEmpty()){
                response.setResponceCode(303).setErrorMessage("No feedbacks found for this session");
                responseObserver.onNext(response.build());
            }

            responseObserver.onCompleted();
        }
        else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }

    }

    @Override
    public void feedback(User.FeedbackReq request, StreamObserver<User.FeedbackResp> responseObserver)
    {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("student")){
            System.out.println("Inside Feedback service");
            int bookingid = request.getBookingId();
            int feedbackrating = request.getFeedbackRating();
            String message = request.getMessage();
            System.out.println("BookingId:" + bookingid);
            System.out.println("FeedbackRating:" + feedbackrating);
            System.out.println("Message:" + message);



            User.FeedbackResp.Builder response = User.FeedbackResp.newBuilder();


            if (bookingid != 0 && feedbackrating <=5) {
                response=storeDetails(bookingid,feedbackrating,message);
            } else {
                response.setResponceMessage("Invalid Details").setResponceCode(400);
            }

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
        else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }

    }
    public User.FeedbackResp.Builder storeDetails(int BookingId,int FeedbackRating,String Message)
    {
        User.FeedbackResp.Builder response = User.FeedbackResp.newBuilder();
        String url = "jdbc:postgresql://localhost:5432/musicmantradb";
        String postgresqlUname="postgres";
        String postgresqlPass="root123";

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
