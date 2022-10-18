package com.stackroute.musicmantra.noty5.utility;

import java.util.Random;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.apache.commons.validator.EmailValidator;

import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;

public class Utility {

	public static int generateOTP() {
		Random random = new Random();
		int min = 100000;
		int max = 999999;
		
		return random.nextInt(max + 1 - min) + min;

	}
	
	public static void validateEmail(String email, EmailHolder emailHolder)  {
		@SuppressWarnings("deprecation")
		InternetAddress  mail = new InternetAddress();
		try {
			mail.validate();
		} catch (AddressException e) {
			if(emailHolder.equals("SENDER"))
			throw new Noty5Exceptions(Noty5Errors.INVALID_SENDER_EMAIL);
			if(emailHolder.equals("RECEIVER")) {
				throw new Noty5Exceptions(Noty5Errors.INVALID_RECIEVER_EMAIL);
			}
		}
			

	}
}
