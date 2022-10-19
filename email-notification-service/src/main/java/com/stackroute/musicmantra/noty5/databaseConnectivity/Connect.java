package com.stackroute.musicmantra.noty5.databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	private static final String url = "jdbc:postgresql://localhost:5432/grpcdemo";
	private static final String psqlname = "postgres";
	private static final String psqlpassword = "postgres";

	public Connection getConnection() {
	    Connection connection;
	    try {
	        connection = DriverManager.getConnection(url, psqlname, psqlpassword);
	        return connection;

	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
}}