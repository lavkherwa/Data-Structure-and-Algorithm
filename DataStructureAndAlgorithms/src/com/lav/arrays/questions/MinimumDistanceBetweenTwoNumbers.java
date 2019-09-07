package com.lav.arrays.questions;

public class MinimumDistanceBetweenTwoNumbers {

	public static void main(String[] args) {

		int[] numArray = { 1, 6, 5, 4, 3, 1, 6, 1, 9, 2 };
		getMinDistanceBetweenTwoNumbersInArray(numArray, 3, 9);

	}

	public static void getMinDistanceBetweenTwoNumbersInArray(int[] numArray, int first, int second) {

		int minDist = numArray.length;
		for (int i = 0; i < numArray.length; i++) {
			int nextIndex = -1;
			/* find the first occurrence of first number */
			if (numArray[i] == first) {
				nextIndex = getIndexOfNextNumber(i, second, numArray);
			} else if (numArray[i] == second) {
				nextIndex = getIndexOfNextNumber(i, first, numArray);
			}

			if (nextIndex != -1 && (nextIndex - i) < (minDist + 1)) {
				minDist = (nextIndex - i) - 1;
			}

		}

		if (minDist != numArray.length) {
			System.out.println("Min distance between " + first + " and " + second + " is " + minDist);
		} else {
			System.out.println("Invalid!");
		}

	}

	public static int getIndexOfNextNumber(int startingFrom, int lookForValue, int[] numArray) {
		/* find the first occurrence of second number */
		int index = -1;
		for (int j = startingFrom; j < numArray.length; j++) {
			if (numArray[j] == lookForValue) {
				index = j;
				break;
			}
		}

		return index;
	}
}
