package com.testing.BasicsTesting;

public class PrimeNo {
	public boolean primeNumber(int number) {
		boolean isPrime = true;
		if (number <= 1) {
			isPrime = false;
		}
		else {
			for(int i=2; i<Math.sqrt(number); i++) {
				if(number%i == 0) {
					isPrime = false;
				}
			}
		}
		return isPrime;
	}
	public static void main(String[] args) {
		PrimeNo pr = new PrimeNo();
		boolean b = pr.primeNumber(13);
		if(b) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
		
	}
}
