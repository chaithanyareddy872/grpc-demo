package org.example.service;

import com.stackroute.musicmantra.noty5.emailserver.EmailServerGrpc;
import com.stackroute.musicmantra.noty5.emailserver.MailType;
import com.stackroute.musicmantra.noty5.emailserver.apiResponse;
import com.stackroute.musicmantra.noty5.emailserver.mailRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Channel {
    public static void verifyReg(String email){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequest request = mailRequest.newBuilder().setMailType(MailType.valueOf("REGISTER")).setUserId(String.valueOf(email)).build();
        EmailServerGrpc.EmailServerBlockingStub userStub = EmailServerGrpc.newBlockingStub(channel);
        apiResponse apiResponse = userStub.sendOTPMail(request);

        System.out.println("response"+apiResponse.getMessage());
        System.out.println("response"+apiResponse.getResponsecode());

    }

    public static int ResetPswd(String email){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequest request = mailRequest.newBuilder().setMailType(MailType.valueOf("UPDATE")).setUserId(String.valueOf(email)).build();
        EmailServerGrpc.EmailServerBlockingStub userStub = EmailServerGrpc.newBlockingStub(channel);
        apiResponse apiResponse = userStub.sendOTPMail(request);

        System.out.println("response"+apiResponse.getMessage());
        System.out.println("response"+apiResponse.getResponsecode());


        return 0;
    }

}
