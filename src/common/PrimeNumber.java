package com.interviewques;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Whether 7 is prime ? " + checkPrimeOrNot(7));
		System.out.println("Whether 20 is prime ? " + checkPrimeOrNot(20));
		System.out.println("Whether 97 is prime ? " + checkPrimeOrNot(97));
		System.out.println("Whether 303 is prime ? " + checkPrimeOrNot(303));
	}

	public static boolean checkPrimeOrNot(int number) {

		// local variable
		boolean isPrime = true;

		if (0 == number || 1 == number) {
			isPrime = false;
		} else {

			for (int i = 2; i <= number / 2; i++) {

				if (number % i == 0) {
					isPrime = false;
					break;

				}
			}

		}

		return isPrime;

	}

}
