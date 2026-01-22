package com.testing.BasicsTesting;

public class Palindrome {
	public boolean pal(String str) {
		boolean isPalindrome = true;
		String rv = "";
		for(int i=str.length()-1; i>=0; i--) {
			rv = rv+str.charAt(i);
		}
		if(str.equals(rv)) {
			isPalindrome = true;
		}
		else {
			isPalindrome = false;
		}
		return isPalindrome;
	}
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		boolean b = p.pal("dad");
		if(b) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		
	}
	
}
