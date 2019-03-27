package com.project;

import java.sql.Timestamp;

public class Login {

	private String Email;
	private String UserName;
	private String Password;
	private Timestamp LastLogDate;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Timestamp getLastLogDate() {
		return LastLogDate;
	}

	public void setLastLogDate(Timestamp lastLogDate) {
		LastLogDate = lastLogDate;
	}

}
