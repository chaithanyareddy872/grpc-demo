package com.stackroute.musicmantra.noty5.mailSendingService;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.stackroute.musicmantra.noty5.domain.api.MusicMantraEmail;
import com.stackroute.musicmantra.noty5.domain.api.User;
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
				message.setSubject("Verification Code to register for Music Manta");
				message.setText(
						"Thanks for registrting to Music Matra. You are just one step away to start your music journy"
								+ "\n\n" + "Verification code is: " + OTP + ".\n\n\n" + "Thanks" + "\n"
								+ "The Music Mantra team account");
			} else if (mailType.equals(MailType.UPDATE)) {
				message.setSubject(" Verify to your email address");
				message.setText(
						"To finish updation in your Music Mantra account, we just need to make sure this email address is yours."
								+ "\n\n" + "To verify your email address use this security code: " + OTP + ".\n\n\n"
								+ "Thanks" + "\n" + "The Music Mantra team account");
			}else if (mailType.equals(MailType.RESETPASSWORD)) {
				message.setSubject(" Verify your email address");
				message.setText(
						"To update your password for your Music Mantra account, we just need to make sure this email address is yours."
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
	public String booking(User[] users, Session session) {
		try {
			MimeMessage message = new MimeMessage(session);

			for (User user : users) {
				message.setFrom(MusicMantraEmail.emailId);
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmailid()));
				// Printing all elements of a Map
				if (user.getType().getUserType().equalsIgnoreCase("student")) {
					if (user.getBookings().getBookingType().equalsIgnoreCase("confirm")) {

						message.setSubject(
								"Booking to learn" + user.getBookings().getInstrumentName() + " is confirmed");

						message.setText("Hi " + user.getFirstName() + "," + "\n\n" + "Congratulations!!!" + "\n\n"
								+ "You have successfully booked a session to learn "
								+ user.getBookings().getInstrumentName()

								+ ".\n\n\n" + "Thanks" + "\n" + "The Music Mantra team account");
						System.out.println("sending...");
						// Send message
						Transport.send(message);
					} else if (user.getBookings().getBookingType().equalsIgnoreCase("cancel")) {

						message.setSubject("Booking to learn" + user.getBookings().getSessionTime() + " is ,cancelled");

						message.setText("Hi " + user.getFirstName() + "," + "\n\n" + "!!!" + "\n\n"
								+ "You have successfully caclled your booking for  session to learn "
								+ user.getBookings().getInstrumentName()

								+ ".\n\n\n" + "Thanks" + "\n" + "The Music Mantra team account");
						System.out.println("sending...");
						// Send message
						Transport.send(message);
					}
				}
				if (user.getType().getUserType().equalsIgnoreCase("teacher")) {
					if (user.getBookings().getBookingType().equalsIgnoreCase("confirm")) {

						message.setSubject(
								"Booking to teach" + user.getBookings().getInstrumentName() + " is confirmed");

						message.setText("Hi " + user.getFirstName() + "," + "\n\n" + "Congratulations!!!" + "\n\n"
								+ "user have successfully booked a session to learn "
								+ user.getBookings().getInstrumentName()

								+ ".\n\n\n" + "Thanks" + "\n" + "The Music Mantra team account");
						System.out.println("sending...");
						// Send message
						Transport.send(message);
					} else if (user.getBookings().getBookingType().equalsIgnoreCase("cancel")) {

						message.setSubject(
								"Booking to learn" + user.getBookings().getInstrumentName() + " is ,cancelled");

						message.setText("Hi " + user.getFirstName() + "," + "\n\n" + "!!!" + "\n\n"
								+ "student have successfully caclled your booking for  session to learn "
								+ user.getBookings().getInstrumentName()

								+ ".\n\n\n" + "Thanks" + "\n" + "The Music Mantra team account");
						System.out.println("sending...");
						// Send message
						Transport.send(message);
					}
				}
				System.out.println("sending...");
				// Send message
				Transport.send(message);
			}

			System.out.println("Sent message successfully....");
			return "successfully sent mail for booking";
		} catch (MessagingException mex) {
			mex.printStackTrace();
			return "some issue in sending mail";
		}

	}

}
