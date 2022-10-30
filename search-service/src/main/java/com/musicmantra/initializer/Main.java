package com.musicmantra.initializer;

import com.musicmantra.implementation.SearchServiceImpl;
import com.musicmantra.interceptor.AuthorizationInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(8085).addService(new SearchServiceImpl())
                .intercept(new AuthorizationInterceptor()).build();

        server.start();

        System.out.println("Server started at "+server.getPort());

        server.awaitTermination();


    }
}
