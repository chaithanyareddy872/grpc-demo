package com.stackroute.musicmantra.noty5.utility;

import java.util.Random;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.apache.log4j.Logger;

import com.stackroute.musicmantra.noty5.Exception.Noty5Errors;
import com.stackroute.musicmantra.noty5.Exception.Noty5Exceptions;

public class Utility {

	static Logger logger = Logger.getLogger(Utility.class);

	public static int generateOTP() {
		logger.info("generating otp...");
		
		Random random = new Random();
		int min = 100000;
		int max = 999999;
		int OTP = random.nextInt(max + 1 - min) + min;
		
		logger.info("generated OTP is:" + OTP);
		return OTP;

	}

	public static void validateEmail(String email) {
		logger.info("validating mail...");
		try {
			InternetAddress mail = new InternetAddress(email);

			mail.validate();
			logger.info("mail is validated...");
		} catch (AddressException e) {
			logger.error("exception occured while validation " + e.getMessage());
			throw new Noty5Exceptions(Noty5Errors.INVALID_SENDER_EMAIL);
		}

	}
}
