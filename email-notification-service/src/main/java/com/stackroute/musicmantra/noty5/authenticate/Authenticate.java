package com.stackroute.musicmantra.noty5.authenticate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.databaseConnectivity.DatabaseOperationImpl;
import com.stackroute.musicmantra.noty5.domain.api.MusicMantraEmail;

public class Authenticate {
	MusicMantraEmail mmEmail = null;
	static Logger logger = Logger.getLogger(Authenticate.class);

	public Session createSession() {
		logger.info("creating session to send mail");
		Session session = null;
		try {
			String host = "smtp.gmail.com";

			// Get system properties
			Properties properties = System.getProperties();

			// Setup mail server
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port", "465");
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.auth", "true");
			String password;

			password = "";

			logger.info("reading mail and password from file");
			ObjectMapper mapper = new ObjectMapper();

			mmEmail = mapper.readValue(
					new File("/home/sindhu/Documents/musicmantra/email-notification-service/src/main/resources/SenderEmailInfo/EmailIdPassword.txt"),
					MusicMantraEmail.class);

			logger.info("Validating senders mail and password");
			session = Session.getInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(mmEmail.getEmailId(), mmEmail.getPassword());
				}
			});
			logger.info("mail and password authenticated");
			session.setDebug(true);
		} catch (IOException ioe) {
			logger.error("error while reading the file to get mail and password of sender" + ioe);
			new Noty5Exceptions(Noty5Errors.INTERNAL_SERVER_ERROR);
		}
//		catch() {}
		catch (Exception e) {
			logger.error("exception occured while authenciating userid and password..." + e.getMessage());
		}
		return session;
	}

}
