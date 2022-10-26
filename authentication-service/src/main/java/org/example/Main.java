package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.service.Authentication;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {//server class
        System.out.println("Starting a GRPC server!!!");
        Server server = ServerBuilder.forPort(8098).addService(new Authentication()).build();

        server.start();
        System.out.println("Server started on port number:" + server.getPort());
        server.awaitTermination();
    }
}