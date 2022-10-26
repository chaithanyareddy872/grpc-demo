package com.stackroute.musicmantra.noty5.emailserver.impl.update;

import javax.mail.Session;

import org.apache.log4j.Logger;

import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.authenticate.Authenticate;
import com.stackroute.musicmantra.noty5.databaseConnectivity.DatabaseOperationImpl;
import com.stackroute.musicmantra.noty5.emailserver.update_profile.UpdateProfileEmailServerGrpc.UpdateProfileEmailServerImplBase;
import com.stackroute.musicmantra.noty5.emailserver.update_profile.mailRequesttoUpdate;
import com.stackroute.musicmantra.noty5.emailserver.update_profile.updateProfileResponse;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailService;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailServiceImpl;
import com.stackroute.musicmantra.noty5.utility.Utility;

import io.grpc.stub.StreamObserver;

public class UpdateMailService extends UpdateProfileEmailServerImplBase{

	
	static Logger logger = Logger.getLogger(UpdateMailService.class);
	DatabaseOperationImpl databaseOperationImpl = new DatabaseOperationImpl();
	SendEmailService sendEmailService = new SendEmailServiceImpl();
	Authenticate authenticate = new Authenticate();
	@Override
	public void profileUpdate(mailRequesttoUpdate request, StreamObserver<updateProfileResponse> responseObserver) {
		logger.info("sendOTPtoExistingUser endpoint is called.");

		int userId = request.getUserId();
		Session session = null;

		logger.info("Request body : " + request.toString());
		logger.info("userId : " + userId );

		try {
			String emailId = databaseOperationImpl.getUserEmailId(userId);

			Utility.validateEmail(emailId);

			if (databaseOperationImpl.checkIfnewUser(emailId)) {
				throw new Noty5Exceptions(Noty5Errors.No_USER_PRESENT);
			}

			session = authenticate.createSession();

			 sendEmailService.sendUpdationMail(emailId, session);

			logger.info("creating response...");
			updateProfileResponse.Builder response = updateProfileResponse.newBuilder().setMessage("sent mail successfully")
					.setResponsecode(200);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		} catch (Noty5Exceptions ne) {
			updateProfileResponse.Builder response = updateProfileResponse.newBuilder().setMessage("email not sent." + ne.getErrorMsg())
					.setResponsecode(ne.getErrorCode());
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

	}

}
