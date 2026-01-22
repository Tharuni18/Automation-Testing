package com.testing.BasicsTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDigitsTest {

	@Test
	public void cnttest() {
		CountDigits cd = new CountDigits();
		int result = cd.cnt(12345678);
		assertEquals(8, result);
		
	}

}
