package com.stackroute.musicmantra.noty5.emailserver.impl.booking_session;

import javax.mail.Session;

import org.apache.log4j.Logger;

import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;
import com.stackroute.musicmantra.noty5.authenticate.Authenticate;
import com.stackroute.musicmantra.noty5.databaseConnectivity.DatabaseOperationImpl;
import com.stackroute.musicmantra.noty5.domain.api.User;
import com.stackroute.musicmantra.noty5.emailserver.booking_session.BookingSessionEmailServerGrpc.BookingSessionEmailServerImplBase;
import com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails;
import com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailService;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailServiceImpl;
import com.stackroute.musicmantra.noty5.utility.Utility;

import io.grpc.stub.StreamObserver;

public class BookingEmailServer extends BookingSessionEmailServerImplBase{

	static Logger logger = Logger.getLogger(BookingEmailServer.class);
	DatabaseOperationImpl databaseOperationImpl = new DatabaseOperationImpl();
	SendEmailService sendEmailService = new SendEmailServiceImpl();
	Authenticate authenticate = new Authenticate();
	@Override
	public void bookingNotification(bookingDetails request, StreamObserver<bookingResponse> responseObserver) {
		

		logger.info("bookingNotification endpoint is called.");
		int bookingId = request.getBookingId();
		String bookingType = request.getBookingtype();

		try {
		User[] users = databaseOperationImpl.getbookingMail(bookingId, bookingType);
		Session session = null;

		for(User user : users) {
			Utility.validateEmail(user.getEmailid());
		}

			session = authenticate.createSession();
			// TODO Auto-generated catch block

		String bookingResponsee = sendEmailService.booking(users, session);

		bookingResponse.Builder response = bookingResponse.newBuilder()
				.setResponsecode(200).setMessage(bookingResponsee);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		}
		catch(Noty5Exceptions ne) {

			bookingResponse.Builder response = bookingResponse.newBuilder().setMessage("running successfully")
					.setResponsecode(ne.getErrorCode()).setMessage(ne.getErrorMsg());
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}
	
	}

}
