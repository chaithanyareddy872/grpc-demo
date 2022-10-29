package org.example;

import com.stackroute.musicmantra.noty5.emailserver.update_profile.UpdateProfileEmailServerGrpc;
import com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate;
import com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

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
