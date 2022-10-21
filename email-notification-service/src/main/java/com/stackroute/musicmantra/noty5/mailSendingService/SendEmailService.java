package com.stackroute.musicmantra.noty5.mailSendingService;

import javax.mail.Session;

import com.stackroute.musicmantra.noty5.domain.api.User;
import com.stackroute.musicmantra.noty5.emailserver.MailType;

public interface SendEmailService {

	public int sendOTP(String userEmail, Session session, String mailtype);
//	public int sendOTPToRegister(String email, String sendersMail, Session session);
	public String booking(User[] users, Session session);
	public void sendRegistrationMail(String email, Session session);
		
}
