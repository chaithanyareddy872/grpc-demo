package com.stackroute.musicmantra.noty5;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

import com.stackroute.musicmantra.noty5.emailserver.impl.booking_session.BookingEmailServer;
import com.stackroute.musicmantra.noty5.emailserver.impl.update.UpdateMailService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//    	BasicConfigurator.configure();
    	Properties prop = new Properties();
    	prop.setProperty("log4j.rootLogger", "WARN");
    	PropertyConfigurator.configure(prop);
      
       Server server = ServerBuilder.forPort(9009).addService(new UpdateMailService()).addService(new BookingEmailServer()).addService(new RegisterMailService()).build();
      
       server.start();
       System.out.println("starting the server for noty5 service at port: " + server.getPort());
       server.awaitTermination();

    }
}
