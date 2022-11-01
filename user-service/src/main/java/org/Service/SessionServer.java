package org.Service;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.grpc.generated.SessionCreate;
import org.grpc.generated.SessionServiceGrpc;
import org.interceptor.Constants;

import java.sql.SQLException;
import java.util.List;

public class SessionServer extends SessionServiceGrpc.SessionServiceImplBase {
    @Override
    public void sessionCreate(SessionCreate.SessionRequest request, StreamObserver<SessionCreate.SessionResponse> responseObserver) {
        if(Constants.CLIENT_TYPE_CONTEXT_KEY.get().equals("teacher")){
            int teacherId = request.getTeacherId();
            String sessionName = request.getSessionName();
            String startDate = request.getSessionStartDate();
            String startTime = request.getSessionStartTime();
            String endDate = request.getSessionEndDate();
            String endTime = request.getSessionEndTime();
            int instrumentId = request.getInstrumentId();
            int genreId = request.getGenreId();
            int sessionFees = request.getFees();
            DatabaseService databaseService = new DatabaseService();

            int sessionId = 0;
            try {
                sessionId = databaseService.storeSession(teacherId,sessionName,startDate,startTime,endDate,endTime,instrumentId,genreId,sessionFees);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            SessionCreate.SessionResponse.Builder response = SessionCreate.SessionResponse.newBuilder();
            if (sessionId != 0) {
                response.setSessionId(sessionId);
                response.setTeacherId(teacherId);
                response.setSessionName(sessionName);
                response.setSessionStartDate(startDate);
                response.setSessionStartTime(startTime);
                response.setSessionEndDate(endDate);
                response.setSessionEndTime(endTime);
                response.setInstrumentId(instrumentId);
                response.setGenreId(genreId);
                response.setFees(sessionFees);
                response.setResponseMessage("Session Created");
                response.setStatusCode(200);
            }else {
                response.setResponseMessage("Please enter the valid date!");
                response.setStatusCode(400);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        }else{
            responseObserver.onError(new StatusRuntimeException(Status.PERMISSION_DENIED));
        }

    }
    @Override
    public void getSessions(SessionCreate.GetSessionRequest request, StreamObserver<SessionCreate.GetSessionResponse> responseObserver) {
        int teacherId = request.getTeacherid();
        DatabaseService databaseService = new DatabaseService();
        List<SessionCreate.SessionResponse> list;
        try {
            list = databaseService.getAllSessionsBasedOnID(teacherId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        SessionCreate.GetSessionResponse.Builder response = SessionCreate.GetSessionResponse.newBuilder();
        SessionCreate.SessionResponse.Builder tempResp=SessionCreate.SessionResponse.newBuilder();

        if(!list.isEmpty()){
            response.addAllSessionresponse(list);
            responseObserver.onNext(response.build());
        }
        else {
            tempResp.setStatusCode(303).setResponseMessage("No existing sessions/classes please create one").build();
            response.addSessionresponse(tempResp);
            responseObserver.onNext(response.build());

        }

        responseObserver.onCompleted();
    }

    @Override
    public void updateSessionName(SessionCreate.SessionNameRequest request, StreamObserver<SessionCreate.SessionResponse> responseObserver) {
        SessionCreate.SessionResponse.Builder response;
        DatabaseService service=new DatabaseService();

        response=service.updateSessionNameById(request.getSessionId(),request.getTeacherId(),request.getSessionName());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateSessionTimings(SessionCreate.SessionTimingRequest request, StreamObserver<SessionCreate.SessionResponse> responseObserver) {
        SessionCreate.SessionResponse.Builder response;
        DatabaseService service=new DatabaseService();

        response=service.updateSessionTimingsById(request);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateSessionFees(SessionCreate.SessionFeesRequest request, StreamObserver<SessionCreate.SessionResponse> responseObserver) {

        SessionCreate.SessionResponse.Builder response;
        DatabaseService service=new DatabaseService();

        response=service.updateSessionFeesById(request.getSessionId(),request.getTeacherId(),request.getFees());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteSession(SessionCreate.DeleteSessionRequest request, StreamObserver<SessionCreate.DeleteSessionResponse> responseObserver) {
        SessionCreate.DeleteSessionResponse.Builder response;
        DatabaseService service=new DatabaseService();

        response=service.deleteSessionById(request.getSessionId(),request.getTeacherId());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}