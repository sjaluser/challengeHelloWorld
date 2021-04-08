package com.sjaluser.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeHelloWorld {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeHelloWorld.class, args);
	}

	String hello(String navigator) {
		return "Hello World " + navigator;
   }
}
