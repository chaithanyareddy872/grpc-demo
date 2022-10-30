package org.example;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.grpc.generated.UpdateProfileEmailServerGrpc;
import org.grpc.generated.mailRequesttoUpdate;
import org.grpc.generated.updateProfileResponse;

public class ChannelCreate {
    public void connetToNoty5(int id) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        mailRequesttoUpdate request = mailRequesttoUpdate.newBuilder().setUserId(id).build();
        UpdateProfileEmailServerGrpc.UpdateProfileEmailServerBlockingStub userStub = UpdateProfileEmailServerGrpc.newBlockingStub(channel);
        updateProfileResponse apiResponse = userStub.profileUpdate(request);

        System.out.println("response" + apiResponse.getMessage());
        System.out.println("response" + apiResponse.getResponsecode());
    }
}
