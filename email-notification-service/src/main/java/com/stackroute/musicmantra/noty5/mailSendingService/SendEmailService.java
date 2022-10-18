package com.stackroute.musicmantra.noty5.mailSendingService;

import javax.mail.Session;

import com.google.protobuf.Timestamp;
import com.stackroute.musicmantra.noty5.emailserver.MailType;

public interface SendEmailService {

	public int registration(String sendersEmail, String userEmail, Session session, MailType mailtype);
	public String booking(String sendersEmail, String userNAme, String userMail, String courseName, Timestamp timestamp, Session session );
		
}
