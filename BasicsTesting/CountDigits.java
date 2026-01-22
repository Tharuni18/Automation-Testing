package com.testing.BasicsTesting;

public class CountDigits {
	public int cnt(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = number/10;
		}
		return count;
	}

}
/*
 * input-parameter, output-return type
 */