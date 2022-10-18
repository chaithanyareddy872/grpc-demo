package com.stackroute.musicmantra.noty5.emailserverImpl;

import java.io.IOException;

import javax.mail.Session;

import org.apache.log4j.Logger;

import com.google.protobuf.Timestamp;
import com.stackroute.musicmantra.noty5.authenticate.Authenticate;
import com.stackroute.musicmantra.noty5.databaseConnectivity.DatabaseOperationImpl;
import com.stackroute.musicmantra.noty5.domain.api.MusicMantraEmail;
import com.stackroute.musicmantra.noty5.emailserver.EmailServerGrpc.EmailServerImplBase;
import com.stackroute.musicmantra.noty5.emailserver.MailType;
import com.stackroute.musicmantra.noty5.emailserver.apiResponse;
import com.stackroute.musicmantra.noty5.emailserver.bookingDetails;
import com.stackroute.musicmantra.noty5.emailserver.mailRequest;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailService;
import com.stackroute.musicmantra.noty5.mailSendingService.SendEmailServiceImpl;
import com.stackroute.musicmantra.noty5.utility.EmailHolder;
import com.stackroute.musicmantra.noty5.utility.Utility;

import io.grpc.stub.StreamObserver;

public class EmailServiceImpl extends EmailServerImplBase {
	Logger logger = Logger.getLogger(EmailServiceImpl.class);
	DatabaseOperationImpl databaseOperationImpl = new DatabaseOperationImpl();
	SendEmailService sendEmailService = new SendEmailServiceImpl();
	Authenticate authenticate = new Authenticate();

    @Override
    public void sendOTPMail(mailRequest request, StreamObserver<apiResponse> responseObserver){
        String userId = request.getUserId();
        MailType emailType = request.getMailType();
        Session session = null;
        
        
        String recieveremail = databaseOperationImpl.getUserEmailId(userId);
        
        Utility.validateEmail(recieveremail, EmailHolder.RECEIVER);
        try {
        
        session = authenticate.createSession();
        }
        catch(Exception e) {
        	
        }

        
         int OTP = sendEmailService.registration(MusicMantraEmail.emailId, recieveremail, session, emailType);
        
		
        apiResponse.Builder response = apiResponse.newBuilder().setMessage("running successfully").setResponsecode(200).setOTP(OTP);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

	@Override
	public void bookingNotification(bookingDetails request, StreamObserver<apiResponse> responseObserver){
		Session session = null;
		
		String senderEmail = request.getSendersEmail();
		String sendersMailPassword = request.getSendersEmailPassword();
		String userNAme = request.getUserName();
		String userMail = request.getUserEmail();
		String courseName = request.getCourseName();
		Timestamp timestamp = request.getTimeName();
		
        Utility.validateEmail(senderEmail, EmailHolder.SENDER);
        Utility.validateEmail(userMail, EmailHolder.RECEIVER);
        
        try {
			session = authenticate.createSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String bookingResponse = sendEmailService.booking(senderEmail, userNAme, userMail,courseName,timestamp, session);
        
		
        apiResponse.Builder response = apiResponse.newBuilder().setMessage("running successfully").setResponsecode(200).setMessage(bookingResponse);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        
       
	}
    
    
}