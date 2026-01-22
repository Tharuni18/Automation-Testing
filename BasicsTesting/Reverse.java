package com.testing.BasicsTesting;

public class Reverse {
	public int revNum(int number) {
		int rev = 0;
		while (number != 0) {
			int digit = number % 10; /* get the last digit */
			rev = rev * 10 + digit;
			number = number / 10; /* remove the last digit */
		}
		return rev;
	}

}
