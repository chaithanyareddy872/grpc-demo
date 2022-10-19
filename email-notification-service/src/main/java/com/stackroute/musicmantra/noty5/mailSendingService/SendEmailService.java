package com.stackroute.musicmantra.noty5.mailSendingService;

import javax.mail.Session;

import com.stackroute.musicmantra.noty5.domain.api.User;
import com.stackroute.musicmantra.noty5.emailserver.MailType;

public interface SendEmailService {

	public int registration(String sendersEmail, String userEmail, Session session, MailType mailtype);
	public String booking(User[] users, Session session);
		
}
