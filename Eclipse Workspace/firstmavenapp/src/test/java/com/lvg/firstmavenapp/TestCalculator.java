package com.lvg.firstmavenapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lvg.model.Calculator;

public class TestCalculator {
	
	Calculator calculator;
	
	@BeforeEach
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		calculator = null;
	}
	
	@Test
	public void testSquare () {
		assertEquals(144, calculator.square(12));
	}
	
	@Test
	public void testSum () {
		assertEquals(150, calculator.sum(new int[] {10,20,30,40,50}));
	}
	
	@Test
	public void testPower () {
		assertEquals(4, calculator.power(2, 2));
	}
}
