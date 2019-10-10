package com.lav.warmup.hackerrank;

public class NumberOfValleysPassed {

	public static void main(String[] args) {
		String input = "UDUUUDUDDD";

		System.out.println("valley count is: " + valleyCount(input));
	}

	public static int valleyCount(String input) {

		char[] inputArray = input.toCharArray();
		int valleys = 0;
		int level = 0;

		for (char current : inputArray) {
			if (current == 'U') {
				level++;
			} else if (current == 'D') {
				if (level == 0) {
					valleys++;
				}
				level--;
			}
		}

		return valleys;

	}
}
