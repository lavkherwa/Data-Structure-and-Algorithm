package com.lav.arrays.hackerrank;

public class LeftRotation {

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 5 };
		int rotationCount = 1;

		int[] result = leftRotation2(input, rotationCount);

		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	@SuppressWarnings("unused")
	private static int[] leftRotation(int[] input, int rotationCount) {

		// same number of rotation will result in same value, so we
		// can skip those iterations ;)
		int rotationRequired = rotationCount % input.length;

		for (int i = 0; i < rotationRequired; i++) {
			int temp;
			int last = input[input.length - 1]; // keep the last value
			for (int j = 0; j < input.length; j++) {

				temp = input[j];

				// Last value put to second last
				if (j == input.length - 1) {
					input[j - 1] = last;
				} else {
					input[j] = input[j + 1];
				}

				// First value move to last
				if (j == 0) {
					input[input.length - 1] = temp;

				}
			}
		}

		return input;
	}

	private static int[] leftRotation2(int[] input, int rotationCount) {

		int[] result = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			// NOTE: we can make (i + 1) + rotationCount --> if we want to shift 2 places ;)
			result[i] = input[(i + rotationCount) % input.length];
		}

		return result;
	}

}
