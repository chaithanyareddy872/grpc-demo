package com.stackroute.musicmantra.noty5.mailSendingService;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.google.protobuf.Timestamp;
import com.stackroute.musicmantra.noty5.emailserver.MailType;
import com.stackroute.musicmantra.noty5.utility.Utility;

public class SendEmailServiceImpl implements SendEmailService {

	@Override
	public int registration(String sendersEmail, String userEmail, Session session, MailType mailType) {

		int OTP = 000000;
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sendersEmail));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));

			OTP = Utility.generateOTP();

			if (mailType.equals(MailType.REGISTER)) {
				message.setSubject("Verification Code for Music Manta");
				message.setText(
						"Thanks for registrting to Music Matra. You are just one step away to start your music journy"
								+ "\n\n" + "Verification code is: " + OTP + ".\n\n\n" + "Thanks" + "\n"
								+ "The Music Mantra team account");
			} else if (mailType.equals(MailType.UPDATE)) {
				message.setSubject(" Verify your email address");
				message.setText(
						"To finish updation in your Music Mantra account, we just need to make sure this email address is yours."
								+ "\n\n" + "To verify your email address use this security code: " + OTP + ".\n\n\n"
								+ "Thanks" + "\n" + "The Music Mantra team account");
			}
			System.out.println("sending...");
			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();

		}

		return OTP;
	}

	@Override
	public String booking(String sendersEmail, String userNAme, String userMail, String courseName,
			Timestamp timestamp, Session session) {
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sendersEmail));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(userMail));

				message.setSubject("Registration for Course " + courseName + " is confirmed");
				message.setText("Hi " + userNAme + "," + "\n\n" + "Congratulations!!!" + "\n\n"+
						"Thanks for registrting for " + courseName+ " . Details are as follows: " + "\n\n" +
						"\tCourse Name: " + courseName+"\n" +
						"\tTime to attemnd the class: " + timestamp 
						
						
						
								+".\n\n\n" + "Thanks" + "\n"
								+ "The Music Mantra team account");
		
			System.out.println("sending...");
			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
			return "successfully sent mail for booking";
		} catch (MessagingException mex) {
			mex.printStackTrace();
			return "some issue in sending mail";
		}

	}

}
