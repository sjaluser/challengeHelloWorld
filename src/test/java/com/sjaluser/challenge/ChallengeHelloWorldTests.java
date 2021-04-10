package com.sjaluser.challenge;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;


@SpringBootTest
class ChallengeHelloWorldTests {

	private ChallengeHelloWorld challengeHelloWorld  = new ChallengeHelloWorld();


	 @Test
	 public void testHelloWorld() {
		 System.out.println(challengeHelloWorld.hello("Chrome").getMessage());
		assertEquals("Hello World Chrome.", challengeHelloWorld.hello("Chrome").getMessage());
	 }

	 @Test
	 public void testHelloWorldVoid() {
		 System.out.println(challengeHelloWorld.hello(null).getMessage());
		assertEquals("Hello World.", challengeHelloWorld.hello(null).getMessage());
	 }

}
