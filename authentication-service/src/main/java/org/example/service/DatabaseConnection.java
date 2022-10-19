package org.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection  {//database connnection class

    static String url = "jdbc:postgresql://localhost:5432/grpcdemo";
    static String psqlname = "postgres";
    static String psqlpassword = "postgres";

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, psqlname, psqlpassword);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}

