package com.stackroute.musicmantra.noty5.domain.api;

import java.util.List;

import com.stackroute.musicmantra.noty5.constants.UserType;

public class User {
	 private String firstName;
	 private String lastname;
	 private String emailid;
	 private UserType type;
	 private Booking bookings;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public Booking getBookings() {
		return bookings;
	}
	public void setBookings(Booking bookings) {
		this.bookings = bookings;
	}
	public User(String firstName, String lastname, String emailid, UserType type, Booking bookings) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.emailid = emailid;
		this.type = type;
		this.bookings = bookings;
	}
	public User() {
		super();
	}
	 
}
