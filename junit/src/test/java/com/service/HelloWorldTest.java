package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSayhello() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Welcome : hari", helloWorld.Sayhello("hari"));
	}

}
