package com.stackroute;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.Feedback;
import service.Session;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting a GRPC server!!!");
        Server server = ServerBuilder.forPort(8085).addService(new Feedback()).build();


        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();
    }

}

