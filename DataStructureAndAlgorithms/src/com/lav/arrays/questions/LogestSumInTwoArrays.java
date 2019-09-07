package com.lav.arrays.questions;

public class LogestSumInTwoArrays {

	public static void main(String[] args) {

		int[] firstArray = { 0, 0, 6, 1, 1, 1 };
		int[] secondArray = { 0, 6, 0, 1, 1, 1 };

		int result = findLargestSum(firstArray, secondArray, 6);
		System.out.println("Result is: " + result);
	}

	public static int findLargestSum(int[] firstArray, int[] secondArray, int arrayLength) {
		int result = 0;
		int sumResult = 0;
		/* Iterate through all items */
		for (int i = 0; i < arrayLength; i++) {
			int sum1 = 0;
			int sum2 = 0;
			/* Start from the current item till last */
			for (int j = i; j < arrayLength; j++) {
				sum1 += firstArray[j];
				sum2 += secondArray[j];

				if (sum1 == sum2) {
					/* Check if sum is equal */
					int length = j - i + 1;
					/* Check current span and if its greater than previous result captured */
					if (length > result) {
						sumResult = sum1;
						result = length;
					}
				}
			}
		}
		System.out.println("Sum value is: " + sumResult);
		return result;
	}

}
