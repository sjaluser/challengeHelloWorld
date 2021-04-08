package com.sjaluser.challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
class ChallengeHelloWorldController {
 @Autowired
 private ChallengeHelloWorld challengeHelloWorld;

 	 @CrossOrigin
	 @RequestMapping("/hello")
	 public String hello(@RequestParam("navigator") String navigator) {
		 return challengeHelloWorld.hello(navigator);
 	}
}