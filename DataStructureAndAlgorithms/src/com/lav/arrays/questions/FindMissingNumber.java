package com.lav.arrays.questions;

public class FindMissingNumber {

	public static void main(String[] args) {

		int[] listOfNumbers = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		System.out.println("Missing number is: " + findMissingNumber(listOfNumbers));
	}

	public static int findMissingNumber(int[] numbers) {
		int length = numbers.length;
		/* using formula (n+1)*(n+2)/2 */
		int sum = (length + 1) * (length + 2) / 2;

		/* Subtract each number from this */
		for (int value : numbers) {
			sum -= value;
		}
		return sum;
	}
}
