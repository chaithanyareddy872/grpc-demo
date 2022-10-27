package org.example.service;

import com.stackroute.musicmantra.noty5.emailserver.*;
import com.stackroute.musicmantra.noty5.emailserver.register.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Channel {
    public static int verifyReg(String email) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequesttoregister request = mailRequesttoregister.newBuilder().setEmailid(email).build();
        RegistrationEmailServerGrpc.RegistrationEmailServerBlockingStub userStub = RegistrationEmailServerGrpc.newBlockingStub(channel);
        apiResponse apiResponse = userStub.sendOTPTONewUser(request);
        System.out.println("response" + apiResponse.getMessage());
        System.out.println("response" + apiResponse.getResponsecode());
        System.out.println(apiResponse.getOTP());
        return apiResponse.getOTP();


    }

    public static void verifiedRegistration(String email) {
        System.out.println(email);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequesttoregister request = mailRequesttoregister.newBuilder().setEmailid(email).build();
        RegistrationEmailServerGrpc.RegistrationEmailServerBlockingStub userStub = RegistrationEmailServerGrpc.newBlockingStub(channel);

        sentmailResponse sentmailResponse=userStub.sendregistrationMail(request);
        System.out.println("response :" + sentmailResponse.getMessage());
        System.out.println("response code" + sentmailResponse.getResponsecode());
    }

    public static int ResetPswd(String email) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequestforExistingUser request = mailRequestforExistingUser.newBuilder().setEmailid(email).setMailType(MailType.forNumber(1)).build();
        RegistrationEmailServerGrpc.RegistrationEmailServerBlockingStub userStub = RegistrationEmailServerGrpc.newBlockingStub(channel);
        apiResponse apiResponse=userStub.sendOTPtoExistingUser(request);

        System.out.println("response" + apiResponse.getMessage());
        System.out.println("response" + apiResponse.getResponsecode());

        System.out.println(apiResponse.getOTP());
        return apiResponse.getOTP();
    }

}