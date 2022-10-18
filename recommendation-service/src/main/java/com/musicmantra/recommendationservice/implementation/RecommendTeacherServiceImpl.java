package com.musicmantra.recommendationservice.implementation;

import com.musicmantra.recommendationservice.grpc.RecommendTeacherGrpc;
import com.musicmantra.recommendationservice.grpc.Recommendteacher;
import io.grpc.stub.StreamObserver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class RecommendTeacherServiceImpl extends RecommendTeacherGrpc.RecommendTeacherImplBase {

    public Connection getConnection(){
        Connection connection=null;
        InputStream file;

        //load application properties value
        try {
            file= new FileInputStream("recommendation-service/src/main/resources/application.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Properties properties=new Properties();

        try {
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            connection= DriverManager.getConnection(properties.getProperty("database.url"),
                    properties.getProperty("database.username"),
                    properties.getProperty("database.password"));
            System.out.println("****JDBC CONNECTION SUCCESSFUL****");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

    @Override
    public void getRecommendedTeacher(Recommendteacher.recommendationRequest request, StreamObserver<Recommendteacher.recommendationResponse> responseObserver) {

        getConnection();

    }
}
