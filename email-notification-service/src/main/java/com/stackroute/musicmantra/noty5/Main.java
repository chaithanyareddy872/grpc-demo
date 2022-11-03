package com.stackroute.musicmantra.noty5;

import com.stackroute.musicmantra.noty5.emailserver.impl.booking_session.BookingEmailServer;
import com.stackroute.musicmantra.noty5.emailserver.impl.register.RegisterMailService;
import com.stackroute.musicmantra.noty5.emailserver.impl.update.UpdateMailService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//    	BasicConfigurator.configure();
    	Properties prop = new Properties();
    	prop.setProperty("log4j.rootLogger", "WARN");
    	PropertyConfigurator.configure(prop);
       System.out.println("starting the server");
       Server server = ServerBuilder.forPort(9009).addService(new UpdateMailService())
               .addService(new BookingEmailServer()).addService(new RegisterMailService()).build();
       server.start();
       server.awaitTermination();

    }
}
