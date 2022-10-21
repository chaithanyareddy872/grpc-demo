package com.stackroute.musicmantra.noty5.emailserverImpl;

import javax.mail.Session;

import org.apache.log4j.Logger;

import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.authenticate.Authenticate;
import com.stackroute.musicmantra.noty5.databaseConnectivity.DatabaseOperationImpl;
import com.stackroute.musicmantra.noty5.domain.api.User;
import com.stackroute.musicmantra.noty5.emailserver.EmailServerGrpc.EmailServerImplBase;
import com.stackroute.musicmantra.noty5.emailserver.apiResponse;
import com.stackroute.musicmantra.noty5.emailserver.bookingDetails;
import com.stackroute.musicmantra.noty5.emailserver.mailRequestforExistingUser;
import com.stackroute.musicmantra.noty5.emailserver.mailRequesttoregister;
import com.stackroute.musicmantra.noty5.emailserver.sentmailResponse;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailService;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailServiceImpl;
import com.stackroute.musicmantra.noty5.utility.Utility;

import io.grpc.stub.StreamObserver;

public class EmailServiceImpl extends EmailServerImplBase {

	static Logger logger = Logger.getLogger(EmailServiceImpl.class.getName());
	DatabaseOperationImpl databaseOperationImpl = new DatabaseOperationImpl();
	SendEmailService sendEmailService = new SendEmailServiceImpl();
	Authenticate authenticate = new Authenticate();

	@Override
	public void sendOTPTONewUser(mailRequesttoregister request, StreamObserver<apiResponse> responseObserver) {
		
		logger.info("sendOTPToNewUser endpoint starting execution");
		String email = request.getEmailid();
		String mailType = "Register";
		Integer OTP = null;
		Session session = null;
		
		try {
		Utility.validateEmail(email);
		
		if(!databaseOperationImpl.checkIfnewUser(email)) {
			throw new Noty5Exceptions(Noty5Errors.USER_ALREADY_REGISTERED);
		}
		
		session = authenticate.createSession();
		
		OTP = sendEmailService.sendOTP(email, session, mailType);
		logger.info("creating response...");
		
		apiResponse.Builder response = apiResponse.newBuilder().setMessage("running successfully")
				.setResponsecode(200).setOTP(OTP);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
		}
	catch (Noty5Exceptions ne) {
		apiResponse.Builder response = apiResponse.newBuilder().setMessage("email not sent." + ne.getErrorMsg())
				.setResponsecode(ne.getErrorCode());
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	}

	@Override
	public void sendOTPtoExistingUser(mailRequestforExistingUser request,
			StreamObserver<apiResponse> responseObserver) {
		logger.info("sendOTPtoExistingUser endpoint is called.");

		String emailId = request.getEmailid();
		String emailType = request.getMailType().name();
		Session session = null;
		Integer OTP = null;

		logger.info("Request body : " + request.toString());
		logger.info("emailId : " + emailId + "email type is : " + emailType);

		try {
//			String userMail = databaseOperationImpl.getUserEmailId(emailId);

			Utility.validateEmail(emailId);
			
			if(databaseOperationImpl.checkIfnewUser(emailId)) {
				throw new Noty5Exceptions(Noty5Errors.No_USER_PRESENT);
			}

			session = authenticate.createSession();

			OTP = sendEmailService.sendOTP(emailId, session, emailType);

			logger.info("creating response...");
			apiResponse.Builder response = apiResponse.newBuilder().setMessage("running successfully")
					.setResponsecode(OTP).setOTP(OTP);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		} catch (Noty5Exceptions ne) {
			apiResponse.Builder response = apiResponse.newBuilder().setMessage("email not sent." + ne.getErrorMsg())
					.setResponsecode(ne.getErrorCode());
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

	}

	@Override
	public void bookingNotification(bookingDetails request, StreamObserver<sentmailResponse> responseObserver) {
		logger.info("bookingNotification endpoint is called.");
		int bookingId = request.getBookingId();
		String bookingType = request.getBookingtype();

		User[] users = databaseOperationImpl.getbookingMail(bookingId, bookingType);
		Session session = null;

		for(User user : users) {
			Utility.validateEmail(user.getEmailid());
		}

			session = authenticate.createSession();
			// TODO Auto-generated catch block

		String bookingResponse = sendEmailService.booking(users, session);

		sentmailResponse.Builder response = sentmailResponse.newBuilder().setMessage("running successfully")
				.setResponsecode(200).setMessage(bookingResponse);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}

	@Override
	public void sendregistrationMail(mailRequesttoregister request, StreamObserver<sentmailResponse> responseObserver) {
		String email = request.getEmailid();
		Session session = null;
		try {
		Utility.validateEmail(email);
		session = authenticate.createSession();
        sendEmailService.sendRegistrationMail(email, session);
        sentmailResponse.Builder response = sentmailResponse.newBuilder().setMessage("mail sent successfully!!!")
				.setResponsecode(200);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		}catch (Noty5Exceptions ne) {
			sentmailResponse.Builder response = sentmailResponse.newBuilder().setMessage("email not sent." + ne.getErrorMsg())
					.setResponsecode(ne.getErrorCode());
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

	}
	

}