package com.stackroute.musicmantra.noty5;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

import com.stackroute.musicmantra.noty5.emailserverImpl.EmailServiceImpl;

//import com.stackroute.musicmantra.noty5.emailserverImpl.EmailServiceImpl;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

       System.out.println("starting the server");
       Server server = ServerBuilder.forPort(9008).addService(new EmailServiceImpl()).build();

       server.start();
       server.awaitTermination();

    }
}
