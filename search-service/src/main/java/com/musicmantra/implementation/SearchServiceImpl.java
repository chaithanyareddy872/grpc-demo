package com.musicmantra.implementation;

import com.musicmantra.searchservice.grpc.SearchServiceGrpc;
import com.musicmantra.searchservice.grpc.SearchServiceOuterClass;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl extends SearchServiceGrpc.SearchServiceImplBase {

    public static Connection getConnection(){
        String url = "jdbc:postgresql://localhost:5432/musicmantradb";
        String psqlname = "postgres";
        String psqlpassword = "root123";

        Connection connection=null;
        try {
            connection = DriverManager.getConnection(url, psqlname, psqlpassword);
            System.out.println("***JDBC CONNECTION SUCCESSFUL");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    @Override
    public void search(SearchServiceOuterClass.searchRequest request, StreamObserver<SearchServiceOuterClass.searchResponse> responseObserver) {
        Connection connection=getConnection();

        String idQuery="select genreid from genres where genrename=? UNION ALL select instrumentid from instruments where instrumentname=?";
        int genreid=0;
        int instrumentid=0;

        SearchServiceOuterClass.searchResponse.Builder respone=SearchServiceOuterClass.searchResponse.newBuilder();

        List<SearchServiceOuterClass.searchResponse.Builder> responses=new ArrayList<>();
        List<Integer> ids=new ArrayList<>();

        try {
            PreparedStatement stmt=connection.prepareStatement(idQuery);
            stmt.setString(1,String.valueOf(request.getGenre()));
            stmt.setString(2,String.valueOf(request.getInstrument()));

            ResultSet resultSet=stmt.executeQuery();
            while (resultSet.next()){
                ids.add(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        genreid=ids.get(0);
        instrumentid=ids.get(1);

        String query="select sessionid,teacherid,sessionname,startdate,fees from sessions where instrumentid=? and genreid=? and fees=? and teacherid in\n" +
                "(select teacherid from teachers where userid in\n" +
                " (select userid from users where usertype='teacher' and userid in \n" +
                "\t\t\t\t\t\t\t\t\t\t\t   (select userid from address where city=?)))";

        try {
            PreparedStatement statement=connection.prepareStatement(query);

            statement.setInt(1,instrumentid);
            statement.setInt(2,genreid);
            statement.setInt(3,request.getFees());
            statement.setString(4,request.getCity());

            ResultSet resultSet=statement.executeQuery();

            while (resultSet.next()){
                respone.setResponsecode(200)
                .setSessionid(resultSet.getInt(1))
                        .setTeacherid(resultSet.getInt(2))
                        .setSessioname(resultSet.getString(3))
                        .setSessionStartDate(String.valueOf(resultSet.getDate(4)))
                                .setSessionStartTime(String.valueOf(resultSet.getTime(4)))
                                        .setFees(resultSet.getInt(5));

                responses.add(respone);

                responseObserver.onNext(respone.build());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (responses.isEmpty()){
            respone.setResponsecode(303).setResponseMessage("No results found");
            responseObserver.onNext(respone.build());
        }

        responseObserver.onCompleted();
    }
}
