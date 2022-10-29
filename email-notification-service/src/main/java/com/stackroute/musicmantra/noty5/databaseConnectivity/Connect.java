package com.stackroute.musicmantra.noty5.databaseConnectivity;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.constants.Constants;

public class Connect {


	Logger logger = Logger.getLogger(Connect.class);

	public Connection getConnection() {

		Connection connection;
		try {
			InputStream input = new FileInputStream("email-notification-service/src/main/resources/application.properties");

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			logger.info("creating database connection...");
			logger.info("Databsename is: " + Constants.DATABSENAME);

			connection = DriverManager.getConnection(prop.getProperty("database.url"),prop.getProperty("database.username"),
					prop.getProperty("database.password"));

			logger.info("connected to databse successfully");
			return connection;

		} catch (Exception e) {
			logger.info("exception occured while creating connection to databse: " + e.getMessage());
			throw new Noty5Exceptions(Noty5Errors.INTERNAL_SERVER_ERROR);

		}
	}
}