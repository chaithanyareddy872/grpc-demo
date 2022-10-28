package service;

import com.stackroute.FeedbackServiceGrpc;
import com.stackroute.User;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;


public class Session  extends FeedbackServiceGrpc.FeedbackServiceImplBase{
    @Override
    public void session(User.SessionReq request, StreamObserver<User.SessionResp> responseObserver) {
        int sessionId = request.getSessionId();
        LocalDate Enddate= LocalDate.parse(request.getEnddate());
        System.out.println("SessionId:" + sessionId);
        System.out.println("Enddate:" + Enddate);
        LocalDate date = LocalDate.now();
        //DateFormatter dtf = DateFormatter.ofPattern("yyyy-MM-dd");
        User.SessionResp.Builder response = User.SessionResp.newBuilder();

        if (sessionId != 0) {
            response.setResponceMessage("SUCCESS").setResponceCode(200);
        } else {
            response.setResponceMessage("Invalid sessionId").setResponceCode(400);
        }
        if (Enddate.isBefore(date)) {
            response.setResponceMessage(" Session completed . go to feedback").setResponceCode(200);
        } else {
            response.setResponceMessage("session not completed").setResponceCode(400);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

        storeDetails(sessionId, String.valueOf(Enddate));
    }
    public void storeDetails(int SessionId,String Enddate) {
        String url = "jdbc:postgresql://localhost:5432/project";
        String postgresqlUname = "postgres";
        String postgresqlPass = "Jaga@6565";
        try{
            Connection connection = DriverManager.getConnection(url, postgresqlUname, postgresqlPass);
            System.out.println("Connection established");
            String query = "Insert into session(sessionid,enddate )values(?,?); ";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, SessionId);
            stmt.setString(2, Enddate);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
