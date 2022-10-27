package com.stackroute.musicmantra.noty5.constants;

public enum UserType {
	 STUDENT("student"),
	 TEACHER("teacher");
	
	private final String userType;

	private UserType(String userType) {
		this.userType = userType;
	}

	public String getUserType() {
		return userType;
	}
	
}
