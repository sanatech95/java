package com.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;

	}

	public Boolean isPrime() {
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	public int sumUpToN() {

		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisiors() {

		int sum = 0;

		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
