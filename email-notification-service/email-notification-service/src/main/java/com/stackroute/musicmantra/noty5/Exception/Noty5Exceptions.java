package com.stackroute.musicmantra.noty5.Exception;

public class Noty5Exceptions extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String errorMsg;
	private String errorType;
	
	public Noty5Exceptions(Noty5Errors noty5Error) {
		this.errorCode = noty5Error.getErrorCode();
		this.errorMsg = noty5Error.getErrorMessage();
		this.errorType = noty5Error.getErrorType();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public String getErrorType() {
		return errorType;
	}


	
	
}
