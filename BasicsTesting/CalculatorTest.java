package com.testing.BasicsTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c = new Calculator();
		int result = c.Add(100, 900);
		assertEquals (1000, result);
	}

}
