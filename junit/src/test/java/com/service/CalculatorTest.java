package com.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before every @test");
		calculator = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Afte every @test");
	}

	@Test
	public void testAdd() {
		assertEquals(6, calculator.add(3, 3));
	}
	@Ignore
	@Test
	public void testSadAdd() {
		assertEquals(6, calculator.add(2, 3));
	}

}
