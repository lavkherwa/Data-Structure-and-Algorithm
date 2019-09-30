package com.lav.arrays.questions;

// https://www.algoexpert.io/questions/Largest%20Range
public class LargestRange {

	public static void main(String[] args) {

		int[] input = { 13, 9, 10, 11, 1, 2, 3, 6, 7, 8, 12 };

		LargestRangeIs(input);

	}

	private static void LargestRangeIs(int[] input) {

		// sort the given array first [Quick sort ;)]
		sortInput(input);

		// Start looking from left to right consecutive

		int maxCount = 0;
		int intermediateCount = 0;

		int start = input[0];
		int startIntermediate = input[0];

		int end = input[0];
		int previous = input[0];

		for (int i = 1; i < input.length; i++) {
			if (input[i] - previous == 1) {

				intermediateCount++;

				if (intermediateCount > maxCount) {
					maxCount = intermediateCount;
					end = input[i];
					start = startIntermediate;
				}

			} else {
				intermediateCount = 0;
				startIntermediate = input[i];
			}

			previous = input[i];
		}

		System.out.println("Longest range is: " + (maxCount + 1) + " between " + start + " and " + end);

	}

	private static void sortInput(int[] input) {
		// Do bubble sort [it's not that efficient so use Quick sort in real scenarios]

		boolean isSorted = false;
		int lastUnsorted = input.length;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted - 1; i++) {
				if (input[i] > input[i + 1]) {
					swap(input, i, i + 1);
					isSorted = false;
				}
			}
			lastUnsorted--;
		}

	}

	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
