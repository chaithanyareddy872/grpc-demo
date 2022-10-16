package com.musicmantra.classbooking.addnewrecord;

import com.musicmantra.classbooking.services.PostClassBooking;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassBookingMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        InputStream input = new FileInputStream("class-booking-service/src/main/resources/application.properties");
        Properties prop = new Properties();
        // load a properties file
        prop.load(input);
        Server server= ServerBuilder.forPort(Integer.parseInt(prop.getProperty("server.port"))).addService(new PostClassBooking()).build();
        server.start();
        System.out.println("server startd on port: "+server.getPort());
        server.awaitTermination();
    }
}