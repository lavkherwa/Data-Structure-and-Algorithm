package com.lav.warmup.hackerrank;

public class NumberOfOccurances {

	public static void main(String[] args) {
		String input = "abcac";

		System.out.println("count is: " + findNumberOfOccurance(input, 10));
	}

	private static long findNumberOfOccurance(String input, long target) {

		long result = 0;

		char[] inputArray = input.toCharArray();

		int aOccuranceCountInCurrentString = 0;
		int length = input.length();

		for (char c : inputArray) {
			if (c == 'a') {
				aOccuranceCountInCurrentString++;
			}
		}

		// Final occurance will be occurance in current / total length requested
		result = aOccuranceCountInCurrentString * (target / length);

		
		// Check now for remaining occurances
		long additional = target % length;
		for (int i = 0; i < additional; i++) {
			if (inputArray[i] == 'a') {
				result++;
			}
		}

		return result;

	}
}
