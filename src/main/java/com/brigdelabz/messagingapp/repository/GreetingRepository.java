package com.brigdelabz.messagingapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.brigdelabz.messagingapp.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
