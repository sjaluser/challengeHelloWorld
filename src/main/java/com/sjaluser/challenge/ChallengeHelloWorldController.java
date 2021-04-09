package com.sjaluser.challenge;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class ChallengeHelloWorldController {
 @Autowired
 private ChallengeHelloWorld challengeHelloWorld;

 	Logger logger = LoggerFactory.getLogger(ChallengeHelloWorldController.class);
 	
	 @CrossOrigin
	 @RequestMapping("/hello")
	 public String hello(@RequestParam("navigator") String navigator) {

        logger.info(String.format("Hello World request, navigator param: %s", navigator));
		return challengeHelloWorld.hello(navigator);
 	}
}