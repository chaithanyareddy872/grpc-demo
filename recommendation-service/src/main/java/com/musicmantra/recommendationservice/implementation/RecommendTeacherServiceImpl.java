package com.musicmantra.recommendationservice.implementation;

import com.musicmantra.recommendationservice.grpc.RecommendTeacherGrpc;
import com.musicmantra.recommendationservice.grpc.Recommendteacher;
import io.grpc.stub.StreamObserver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RecommendTeacherServiceImpl extends RecommendTeacherGrpc.RecommendTeacherImplBase {

    //Method to get JDBC connection
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
        //
        //Try JDBC Connection
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

    //Method to get student preferences
    public List<List<String>> getStudentPreferences(int studentId){

        Connection connection=getConnection();

        List<String> genres = null;
        List<String> instruments=null;

        PreparedStatement statement=null;

        //Prepared statement query
        String query="select genre,instrument from preferences where userid in (select userid from students where studentid=?)";

        try {
            statement=connection.prepareStatement(query);
            statement.setInt(1,studentId);
            ResultSet resultSet=statement.executeQuery();

            //Storing the result of column array by typecasting it to String
            while (resultSet.next()){

                Array tempGenre=resultSet.getArray(1);
                String[] tempGenres= (String[]) tempGenre.getArray();
                genres= List.of(tempGenres);

                Array tempInstrument=resultSet.getArray(2);
                String[] tempInstruments= (String[]) tempInstrument.getArray();
                instruments= List.of(tempInstruments);;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        List<List<String>> studentPreferences=new ArrayList<>();

        studentPreferences.add(genres);
        studentPreferences.add(instruments);

        //Returning the preferences
        return studentPreferences;
    }
    @Override
    public void getRecommendedTeacher(Recommendteacher.recommendationRequest request, StreamObserver<Recommendteacher.recommendationResponse> responseObserver) {

        //Getting student preferences
        List<List<String>> studentPreferences=getStudentPreferences(request.getStudentId());

        //Storing genres and instruments of student preferences in different lists
        List<String> studentGenres=studentPreferences.get(0);
        List<String> studentInstruments=studentPreferences.get(1);

        //Response builder
        Recommendteacher.recommendationResponse.Builder response=Recommendteacher.recommendationResponse.newBuilder();

        Connection connection=getConnection();

        //Query to fetch teacher preferences
        String query ="select teacherid,genre,instrument from preferences p inner join teachers t on p.userid=t.userid";

        try {
            Statement simpleStatement=connection.createStatement();
            ResultSet resultSet=simpleStatement.executeQuery(query);

            //Storing each teacher genre and instrument preferences in separate lists
            while (resultSet.next()){

                Array tempGenre=resultSet.getArray(2);
                String[] tempGenres= (String[]) tempGenre.getArray();
                List<String> teacherGenres= List.of(tempGenres);

                Array tempInstrument=resultSet.getArray(3);
                String[] tempInstruments= (String[]) tempInstrument.getArray();
                List<String> teacherInstruments= List.of(tempInstruments);

                boolean checkGenres=false;
                boolean checkInstruments=false;

                //Checking whether teacher got genre preferences of student
                for (String genre:
                        teacherGenres) {
                    checkGenres=studentGenres.contains(genre);
                    break;
                }

                //Checking whether teacher got instrument preferences of student
                for (String instrument:
                        teacherInstruments) {
                    checkInstruments=studentInstruments.contains(instrument);
                    break;
                }

                //Checking if condition satisfies and returning the response stream
                if(checkGenres && checkInstruments){

                    //Building the response
                    response.setResponseCode(200)
                            .setResponseMessage("SUCCESS")
                            .setTeacherId(resultSet.getInt(1))
                            .addAllGenre(teacherGenres)
                            .addAllInstrument(teacherInstruments);

                    responseObserver.onNext(response.build());

                    response.clearGenre().clearInstrument();
                }


            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //Ending the response
        responseObserver.onCompleted();

    }

}
