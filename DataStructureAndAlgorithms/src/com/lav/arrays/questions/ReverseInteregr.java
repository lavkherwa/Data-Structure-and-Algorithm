package com.lav.arrays.questions;

public class ReverseInteregr {

	public static void main(String[] args) {

		System.out.println("reverse value with MATH:" + reverseUsingMath(-1334455));
		System.out.println("reverse value with STRING:" + reverseUsingString(-1334455));

	}

	private static int reverseUsingMath(int number) {
		int rev = 0;
		while (number != 0) {
			int pop = number % 10;
			number /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			rev = rev * 10 + pop;
		}
		return rev;
	}

	private static int reverseUsingString(int number) {

		String result = "";
		char[] numbers = (Integer//
				.valueOf(number))//
						.toString()//
						.toCharArray();

		for (char i : numbers) {
			result = i + result;
		}

		if (result.contains("-")) {
			result = result.substring(0, result.length() - 1);
			result = "-" + result;
		}

		return Integer.parseInt(result);
	}
}
