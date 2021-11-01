package com.brigdelabz.messagingapp.service;

import java.util.List;

import com.brigdelabz.messagingapp.model.Greeting;
import com.brigdelabz.messagingapp.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);

	List<Greeting> getAllGreetings();

	Greeting editGreeting(long id, User user);

}
