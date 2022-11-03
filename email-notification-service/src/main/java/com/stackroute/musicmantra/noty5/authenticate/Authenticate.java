package com.stackroute.musicmantra.noty5.authenticate;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.constants.Constants;
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

/*			mmEmail = mapper.readValue(
					new File(Constants.EMAILDETAILS),
					MusicMantraEmail.class);*/

			logger.info("Validating senders mail and password");
			session = Session.getInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(MusicMantraEmail.emailId, MusicMantraEmail.password);
				}
			});
			logger.info("mail and password authenticated");
			session.setDebug(true);
		}
//		catch() {}
		catch (Exception e) {
			logger.error("exception occured while authenciating userid and password..." + e.getMessage());
		}
		return session;
	}

}
