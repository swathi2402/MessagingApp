package com.brigdelabz.messagingapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GREETINGS")
public class Greeting {

	@Id
	private final long userId;
	private final String userName;
	
	public Greeting() {
		userId = 0;
		userName = "";
	}

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
