package com.stackroute.musicmantra.noty5.emailserverImpl;

import java.io.IOException;

import javax.mail.Session;

import org.apache.log4j.Logger;

import com.stackroute.musicmantra.noty5.authenticate.Authenticate;
import com.stackroute.musicmantra.noty5.databaseConnectivity.DatabaseOperationImpl;
import com.stackroute.musicmantra.noty5.domain.api.MusicMantraEmail;
import com.stackroute.musicmantra.noty5.domain.api.User;
import com.stackroute.musicmantra.noty5.emailserver.EmailServerGrpc.EmailServerImplBase;
import com.stackroute.musicmantra.noty5.emailserver.MailType;
import com.stackroute.musicmantra.noty5.emailserver.apiResponse;
import com.stackroute.musicmantra.noty5.emailserver.bookingDetails;
import com.stackroute.musicmantra.noty5.emailserver.bookingmailResponse;
import com.stackroute.musicmantra.noty5.emailserver.mailRequest;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailService;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailServiceImpl;
import com.stackroute.musicmantra.noty5.utility.Utility;

import io.grpc.stub.StreamObserver;

public class EmailServiceImpl extends EmailServerImplBase {
	Logger logger = Logger.getLogger(EmailServiceImpl.class);
	DatabaseOperationImpl databaseOperationImpl = new DatabaseOperationImpl();
	SendEmailService sendEmailService = new SendEmailServiceImpl();
	Authenticate authenticate = new Authenticate();

    @Override
    public void sendOTPMail(mailRequest request, StreamObserver<apiResponse> responseObserver){
        System.out.println("Inside OTP mail method");
    	String userId = request.getUserId();
        MailType emailType = request.getMailType();
        Session session = null;
        
        
        String userMail = databaseOperationImpl.getUserEmailId(userId);
        
        Utility.validateEmail(userMail);
        try {
        
        session = authenticate.createSession();
        }
        catch(Exception e) {
        	
        }

        
         int OTP = sendEmailService.registration(MusicMantraEmail.emailId, userMail, session, emailType);
        
		
        apiResponse.Builder response = apiResponse.newBuilder().setMessage("running successfully").setResponsecode(200).setOTP(OTP);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

	@Override
	public void bookingNotification(bookingDetails request, StreamObserver<bookingmailResponse> responseObserver) {
	 int bookingId = request.getBookingId();
	 String bookingType = request.getBookingtype();
	 
	 User[] users = databaseOperationImpl.getbookingMail(1, bookingType);
	 Session session = null;	
		
		
//   Utility.validateEmail(bookingMap.get("student"));
//   Utility.validateEmail(userMail);
   
   try {
		session = authenticate.createSession();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
   String bookingResponse = sendEmailService.booking(users, session);
   
	
   bookingmailResponse.Builder response = bookingmailResponse.newBuilder().setMessage("running successfully").setResponsecode(200).setMessage(bookingResponse);
   responseObserver.onNext(response.build());
   responseObserver.onCompleted();
   
	}


	
    
    
}