package com.sjaluser.challenge;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class ChallengeHelloWorldController {
 @Autowired
 private ChallengeHelloWorld challengeHelloWorld;

 	Logger logger = LoggerFactory.getLogger(ChallengeHelloWorldController.class);
 	
	 @CrossOrigin
	 @PostMapping("/hello/{navigator}")
	 public UserResponse hello(@PathVariable String navigator) {

        logger.info("Hello World request, navigator param: {}", navigator);
		return challengeHelloWorld.hello(navigator);
 	}
}