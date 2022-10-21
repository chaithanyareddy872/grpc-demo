package com.stackroute.musicmantra.noty5;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

import com.stackroute.musicmantra.noty5.emailserverImpl.EmailServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

//import com.stackroute.musicmantra.noty5.emailserverImpl.EmailServiceImpl;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//    	BasicConfigurator.configure();
    	Properties prop = new Properties();
    	prop.setProperty("log4j.rootLogger", "WARN");
    	PropertyConfigurator.configure(prop);
       System.out.println("starting the server");
       Server server = ServerBuilder.forPort(9008).addService(new EmailServiceImpl()).build();

       server.start();
       server.awaitTermination();

    }
}
