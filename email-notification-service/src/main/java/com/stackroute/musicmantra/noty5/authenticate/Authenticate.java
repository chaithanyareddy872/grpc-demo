package com.stackroute.musicmantra.noty5.authenticate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.musicmantra.noty5.domain.api.MusicMantraEmail;

public class Authenticate {
	MusicMantraEmail mmEmail = null;
	
	public Session createSession() throws IOException {
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
	   
	     ObjectMapper mapper = new ObjectMapper();

	     /**
	       * Read object from file
	       */
	       mmEmail = mapper.readValue(new File("/home/global/IdeaProjects/Noti5/src/main/resources/SenderEmailInfo/EmailIdPassword.txt"), MusicMantraEmail.class);
	      System.out.println(mmEmail);
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

	        protected PasswordAuthentication getPasswordAuthentication() {

	            return new PasswordAuthentication(mmEmail.getEmailId(), mmEmail.getPassword());

	        }

	    });
		session.setDebug(true);
		return session;
	}
	 
	
}
