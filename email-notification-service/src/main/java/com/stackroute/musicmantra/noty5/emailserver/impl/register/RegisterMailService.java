package com.stackroute.musicmantra.noty5.emailserver.impl.register;

import javax.mail.Session;

import com.stackroute.musicmantra.noty5.emailserver.register.OTPapiResponse;
import com.stackroute.musicmantra.noty5.emailserver.register.RegistrationEmailServerGrpc;
import com.stackroute.musicmantra.noty5.emailserver.register.mailRequest;
import com.stackroute.musicmantra.noty5.emailserver.register.sentmailResponse;
import org.apache.log4j.Logger;

import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.authenticate.Authenticate;
import com.stackroute.musicmantra.noty5.databaseConnectivity.DatabaseOperationImpl;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailService;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailServiceImpl;
import com.stackroute.musicmantra.noty5.utility.Utility;

import io.grpc.stub.StreamObserver;

public class RegisterMailService extends RegistrationEmailServerGrpc.RegistrationEmailServerImplBase {

	static Logger logger = Logger.getLogger(RegisterMailService.class.getName());
	DatabaseOperationImpl databaseOperationImpl = new DatabaseOperationImpl();
	SendEmailService sendEmailService = new SendEmailServiceImpl();
	Authenticate authenticate = new Authenticate();

	@Override
	public void sendResetPasswordOTP(mailRequest request,
                                     StreamObserver<OTPapiResponse> responseObserver) {
		logger.info("sendOTPtoExistingUser endpoint is called.");

		String emailId = request.getEmailid();
		Session session = null;
		Integer OTP = null;

		logger.info("Request body : " + request.toString());

		try {
//			String userMail = databaseOperationImpl.getUserEmailId(emailId);

			Utility.validateEmail(emailId);
			String mailType = "ResetPassword";

			if (databaseOperationImpl.checkIfnewUser(emailId)) {
				throw new Noty5Exceptions(Noty5Errors.No_USER_PRESENT);
			}

			session = authenticate.createSession();

			OTP = sendEmailService.sendOTP(emailId, session, mailType);

			logger.info("creating response...");
			OTPapiResponse.Builder response = OTPapiResponse.newBuilder().setMessage("email sent successfully")
					.setResponsecode(200).setOTP(OTP);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		} catch (Noty5Exceptions ne) {
			OTPapiResponse.Builder response = OTPapiResponse.newBuilder().setMessage("email not sent." + ne.getErrorMsg())
					.setResponsecode(ne.getErrorCode());
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

	}

	@Override
	public void sendRegistrationOTP(mailRequest request, StreamObserver<OTPapiResponse> responseObserver) {

		logger.info("sendOTPToNewUser endpoint starting execution");
		String email = request.getEmailid();
		String mailType = "Register";
		Integer OTP = null;
		Session session = null;

		try {
			Utility.validateEmail(email);

			if (!databaseOperationImpl.checkIfnewUser(email)) {
				throw new Noty5Exceptions(Noty5Errors.USER_ALREADY_REGISTERED);
			}

			session = authenticate.createSession();

			OTP = sendEmailService.sendOTP(email, session, mailType);
			logger.info("creating response...");

			OTPapiResponse.Builder response = OTPapiResponse.newBuilder().setMessage("running successfully")
					.setResponsecode(200).setOTP(OTP);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();

		} catch (Noty5Exceptions ne) {
			OTPapiResponse.Builder response = OTPapiResponse.newBuilder().setMessage("email not sent." + ne.getErrorMsg())
					.setResponsecode(ne.getErrorCode());
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}
	}

	@Override
	public void sendregistedMail(mailRequest request, StreamObserver<sentmailResponse> responseObserver) {
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
		} catch (Noty5Exceptions ne) {
			sentmailResponse.Builder response = sentmailResponse.newBuilder()
					.setMessage("email not sent." + ne.getErrorMsg()).setResponsecode(ne.getErrorCode());
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

	}

}
