package com.lav.recursion;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("factorial of 4 is: " + findFactorial(4));
		System.out.println("factorial of 5 is: " + findFactorial(5));
		System.out.println("factorial of 6 is: " + findFactorial(6));
	}

	public static int findFactorial(int num) {

		if (num < 2) {
			return 1;
		} else {
			int factorial = num * findFactorial(num - 1);
			return factorial;
		}
	}

}
