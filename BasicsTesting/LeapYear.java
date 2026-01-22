package com.testing.BasicsTesting;

public class LeapYear {
	public boolean leap(int year) {
		boolean isLeap = true;
		if(year%4 == 0 && year %100 != 0 || year %400 == 0) {
			isLeap=true;
		}
		else {
			isLeap = false;
		}
		return isLeap;
	}
	public static void main(String[] args) {
		LeapYear l = new LeapYear();
		boolean b = l.leap(2028);
		if(b) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
		
	}
}
