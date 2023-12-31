package com.stackroute;

import interceptor.AuthorizationInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.Feedback;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting a GRPC server!!!");
        Server server = ServerBuilder.forPort(8084).addService(new Feedback()).intercept(new AuthorizationInterceptor()).build();

        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();
    }

}

