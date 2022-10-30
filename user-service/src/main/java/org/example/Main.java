package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.Service.SessionServer;
import org.Service.UserProfileServer;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting a GRPC server!!!");
        Server server = ServerBuilder.forPort(8086).addService(new UserProfileServer()).addService(new SessionServer()).build();
        server.start();
        System.out.println("User server started on port number:"+ server.getPort());
        server.awaitTermination();
    }
}
