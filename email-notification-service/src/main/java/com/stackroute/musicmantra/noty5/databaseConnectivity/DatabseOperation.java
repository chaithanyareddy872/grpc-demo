package com.stackroute.musicmantra.noty5.databaseConnectivity;

import com.stackroute.musicmantra.noty5.domain.api.User;

public interface DatabseOperation {

	public String getUserEmailId(String userId);
	public User[] getbookingMail(int userid, String bookingType);
}
