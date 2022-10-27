package com.stackroute.musicmantra.noty5.domain.api;

public class Booking {
	private String bookingId;
	private  String sessionTime;
	private String bookingType;
	private String instrumentName;
	public String getInstrumentName() {
		return instrumentName;
	}
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	public Booking(String bookingId, String sessionTime, String bookingType) {
		super();
		this.bookingId = bookingId;
		this.sessionTime = sessionTime;
		this.bookingType = bookingType;
	}
	public Booking() {
		super();
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getSessionTime() {
		return sessionTime;
	}
	public void setSessionTime(String sessionTime) {
		this.sessionTime = sessionTime;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	
	
	
}
