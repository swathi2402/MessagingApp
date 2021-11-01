package com.brigdelabz.messagingapp.model;

public class Greeting {

	private final long userId;
	private final String userName;

	public Greeting(long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

}
