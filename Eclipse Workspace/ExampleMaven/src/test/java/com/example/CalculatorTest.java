package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lvg.model.Calculator;

class CalculatorTest {
	
	Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	void testPower() {
		assertEquals(8, calculator.power(2, 3));
	}
	
	@Test
	void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}

}
