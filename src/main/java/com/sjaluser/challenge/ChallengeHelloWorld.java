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
	 * @return response
	 */
	UserResponse hello(String navigator) {
		UserResponse  userResponse = new UserResponse();
		userResponse.setMessage(String.format("Hello World: %s.", navigator));
		return userResponse;
   }

}
