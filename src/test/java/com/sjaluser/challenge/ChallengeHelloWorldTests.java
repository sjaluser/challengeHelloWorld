package com.sjaluser.challenge;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;


@SpringBootTest
class ChallengeHelloWorldTests {

	private ChallengeHelloWorld challengeHelloWorld  = new ChallengeHelloWorld();

	@Test
	void contextLoads() {
	}


	 @Test
	 public void testHelloWorld() {
		assertEquals("Hello World Chrome", challengeHelloWorld.hello("Chrome"));
	 }


}
