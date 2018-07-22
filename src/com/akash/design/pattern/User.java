package com.akash.design.pattern;

import java.util.Observable;

public class User extends Observable{
	  private Long          userId;
	  private boolean       confirmed = false;
	  private String        userName;
	  private String        password;
	  private String        email;
	  private String        firstName;
	  private String        lastName;
	
	 
	 public User() {
		// TODO Auto-generated constructor stub
	}

	public User(boolean confirmed, String userName, String password,
			String email, String firstName, String lastName) {
		super();
		this.confirmed = confirmed;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		setChanged();
		notifyObservers(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", confirmed=" + confirmed
				+ ", userName=" + userName + ", password=" + password
				+ ", email=" + email + ", firstName=" + firstName
				+ ", lastName=" + lastName ;
	}
	 
	
}

