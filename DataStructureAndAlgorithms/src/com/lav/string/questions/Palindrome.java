package com.lav.string.questions;

public class Palindrome {

	public static void main(String[] args) {
		int input = 121;
		System.out.println("Is Palindrome? : " + isPalindrome(input));
	}

	static boolean isPalindrome(int number) {

		int tmp = number;
		int reversed = 0;

		while (tmp != 0) {
			int digit = tmp % 10;
			reversed = reversed * 10 + digit;
			tmp /= 10;
		}

		return reversed == number;
	}

}
