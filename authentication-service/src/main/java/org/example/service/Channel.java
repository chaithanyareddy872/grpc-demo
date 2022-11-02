package org.example.service;

import java.util.Iterator;

import org.example.utility.BearerToken;

import com.musicmantra.recommendationservice.grpc.RecommendTeacherGrpc;
import com.musicmantra.recommendationservice.grpc.Recommendteacher;
import com.musicmantra.sessionservice.grpc.SessionCreate;
import com.musicmantra.sessionservice.grpc.SessionServiceGrpc;
import com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse;
import com.stackroute.musicmantra.noty5.emailserver.register.RegistrationEmailServerGrpc;
import com.stackroute.musicmantra.noty5.emailserver.register.mailRequest;
import com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Channel {
    public static int verifyReg(String email) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequest request = mailRequest.newBuilder().setEmailid(email).build();
        RegistrationEmailServerGrpc.RegistrationEmailServerBlockingStub userStub = RegistrationEmailServerGrpc.newBlockingStub(channel);
        OTPapiResponse apiResponse = userStub.sendRegistrationOTP(request);
        System.out.println("response" + apiResponse.getMessage());
        System.out.println("response" + apiResponse.getResponsecode());
        System.out.println(apiResponse.getOTP());
        return apiResponse.getOTP();

    }

    public static void verifiedRegistration(String email) {
        System.out.println(email);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequest request = mailRequest.newBuilder().setEmailid(email).build();
        RegistrationEmailServerGrpc.RegistrationEmailServerBlockingStub userStub = RegistrationEmailServerGrpc.newBlockingStub(channel);

        sentmailResponse sentmailResponse=userStub.sendregistedMail(request);
        System.out.println("response :" + sentmailResponse.getMessage());
        System.out.println("response code" + sentmailResponse.getResponsecode());
    }

    public static int ResetPswd(String email) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequest request = mailRequest.newBuilder().setEmailid(email).build();
        RegistrationEmailServerGrpc.RegistrationEmailServerBlockingStub userStub = RegistrationEmailServerGrpc.newBlockingStub(channel);
        OTPapiResponse apiResponse=userStub.sendResetPasswordOTP(request);

        System.out.println("response" + apiResponse.getMessage());
        System.out.println("response" + apiResponse.getResponsecode());

        System.out.println(apiResponse.getOTP());
        return apiResponse.getOTP();
    }

    public static void getRecommendedTeachers(String token,int studentId){

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081).usePlaintext().build();
        BearerToken bearerToken=new BearerToken(token);
        RecommendTeacherGrpc.RecommendTeacherBlockingStub recommendTeacherStub=RecommendTeacherGrpc.newBlockingStub(channel).withCallCredentials(bearerToken);
        Recommendteacher.recommendationRequest request= Recommendteacher.recommendationRequest.newBuilder().setStudentId(studentId).build();
        Iterator<Recommendteacher.recommendationResponse> response=recommendTeacherStub.getRecommendedTeacher(request);

        while (response.hasNext()){
            System.out.println(response.next());
        }

    }

    public static void getSessionsofTeacher(String token,int teacherid){
        System.out.println("inside- seesion");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8086).usePlaintext().build();
        BearerToken bearerToken=new BearerToken(token);
        SessionServiceGrpc.SessionServiceBlockingStub sessionServiceBlockingStub=SessionServiceGrpc.newBlockingStub(channel).withCallCredentials(bearerToken);
        SessionCreate.GetSessionRequest request=SessionCreate.GetSessionRequest.newBuilder().setTeacherid(teacherid).build();
        SessionCreate.GetSessionResponse response= sessionServiceBlockingStub.getSessions(request);
        System.out.println(response.toString());
    }

}
