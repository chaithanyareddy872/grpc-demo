package com.stackroute.musicmantra.noty5.Exception;

public enum Noty5Errors {

	INTERNAL_SERVER_ERROR(500, "Internal server error", "InternalServerError"),
	INVALID_SENDER_EMAIL(400, "Please provide a valid sender's email.", "Bad Request"),
	INVALID_RECIEVER_EMAIL(400, "Please provide a valid reciever's email.", "Bad Request"),
	INVALID_CREDENTIALS(400, "Please provide valid credentials.", "Bad request");
	
	
	private Noty5Errors(int errorCode, String errorMessage, String errorType) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorType = errorType;
	}
	private  final int errorCode;
	private final String errorMessage;
	private final String errorType;
	public int getErrorCode() {
		return errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getErrorType() {
		return errorType;
	}
	
	
}
