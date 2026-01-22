package com.testing.BasicsTesting;

public class ArmstrongNum {
	public int armNum (int number) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum = sum + digit * digit * digit;
			number = number/10;
		}
		return sum;
	}
}
  