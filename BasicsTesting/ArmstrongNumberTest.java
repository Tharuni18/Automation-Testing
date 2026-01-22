package com.testing.BasicsTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArmstrongNumberTest {

	@Test
	public void armNumtest() {
		ArmstrongNum a = new ArmstrongNum();
		int result = a.armNum(153);
		assertEquals(153, result);
	}

}
