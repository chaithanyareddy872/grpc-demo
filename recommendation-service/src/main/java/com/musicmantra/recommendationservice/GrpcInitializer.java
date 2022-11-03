package com.musicmantra.recommendationservice;

import com.musicmantra.recommendationservice.implementation.RecommendTeacherServiceImpl;
import com.musicmantra.recommendationservice.interceptor.AuthorizationInterceptor;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GrpcInitializer {

    public static void main(String[] args) throws IOException, InterruptedException {

        //Building GRPC server
        Server server= ServerBuilder.forPort(8081).addService(new RecommendTeacherServiceImpl()).intercept(new AuthorizationInterceptor()).build();

        server.start();

        System.out.println("GRPC Server started @ "+server.getPort());

        server.awaitTermination();
    }
}
