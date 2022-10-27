package com.stackroute.musicmantra.noty5.domain.api;

public class MusicMantraEmail {
	public static String emailId;
	public static String password;
	
	
	public MusicMantraEmail() {
		super();
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MusicMantraEmail(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	
}
