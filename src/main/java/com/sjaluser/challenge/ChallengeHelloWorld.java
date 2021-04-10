package com.sjaluser.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeHelloWorld {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeHelloWorld.class, args);
	}

	/**
	 * Says Hello
	 * 
	 * @param navigator
	 * @return JSON with Hello Response.
	 */
	UserResponse hello(String navigator) {
		UserResponse  userResponse = new UserResponse();
		if (navigator!=null) {
			userResponse.setMessage(String.format("Hello World %s.", navigator));
		} else {
			userResponse.setMessage("Hello World.");
		}
		return userResponse;
   }

}
