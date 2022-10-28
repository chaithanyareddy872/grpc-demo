package com.stackroute.musicmantra.noty5.databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.constants.Constants;

public class Connect {

//	private static final String url = "jdbc:postgresql://localhost:5432/" + Constants.DATABSENAME;
//	private static final String psqlname = Constants.DATABASEUSERNAME;
//	private static final String psqlpassword = Constants.DATABASEPASSWORD;
	Logger logger = Logger.getLogger(Connect.class);

	public Connection getConnection() {
		Connection connection;
		try {
			logger.info("creating database connection...");
			logger.info("Databsename is: " + Constants.DATABSENAME);

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/music_mantra", "postgres", "root123");

			logger.info("connected to databse successfully");
			return connection;

		} catch (SQLException e) {
			logger.info("exception occured while creating connection to databse: " + e.getMessage());
			throw new Noty5Exceptions(Noty5Errors.INTERNAL_SERVER_ERROR);

		}
	}
}