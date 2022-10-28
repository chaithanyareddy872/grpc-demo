package com.musicmantra.classbooking.channel;


import com.stackroute.musicmantra.noty5.emailserver.booking_session.BookingSessionEmailServerGrpc;
import com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingDetails;
import com.stackroute.musicmantra.noty5.emailserver.booking_session.bookingResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ConnectToNoty {

	public static void sendBookingMail(int bookingId, String bookingType) {
		
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9009).usePlaintext().build();
        bookingDetails request = bookingDetails.newBuilder().setBookingId(bookingId).setBookingtype(bookingType).build();
        BookingSessionEmailServerGrpc.BookingSessionEmailServerBlockingStub userStub = BookingSessionEmailServerGrpc.newBlockingStub(channel);

        bookingResponse sentmailResponse=userStub.bookingNotification(request);
        System.out.println("response :" + sentmailResponse.getMessage());
        System.out.println("response code" + sentmailResponse.getResponsecode());
	}
}
