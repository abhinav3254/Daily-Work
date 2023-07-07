package com.lvg.testdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NewTesting {
	
	Calculator calculator = null;

	
	// method need not be setUp it can be anything
	// @BeforeEach means before every test this is executed
	// annotation matter
	@BeforeEach
	void setUp() throws Exception {
	calculator = new Calculator();
	}

	
	// Run after each test
	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	// @Disabled
	@Test
	void sumTest() {
		// sum of 10 to 50 is 150
		assertEquals(150,calculator.sum(10,20,30,40,50));
	}
	
	@Test
	public void squareTest () {
		// Expected value is 100 from square method
		assertEquals(100,calculator.square(10));
	}
	
	// @Disabled
	// @Disabled is used when we don't want to test any method
	@Test
	public void powerTest () {
		assertEquals(125,calculator.power(5, 3));
	} 

}
