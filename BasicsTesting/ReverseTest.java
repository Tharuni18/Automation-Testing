package com.testing.BasicsTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void revNumtest() {
		Reverse r = new Reverse();
		int result = r.revNum(1234);
		assertEquals(4321, result);
	}
}
