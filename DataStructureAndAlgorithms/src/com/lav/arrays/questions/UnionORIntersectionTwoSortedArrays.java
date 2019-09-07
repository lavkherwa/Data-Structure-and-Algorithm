package com.lav.arrays.questions;

public class UnionORIntersectionTwoSortedArrays {

	public static void main(String[] args) {
		int[] firstArray = { 0, 2, 6, 9 };
		int[] secondArray = { 1, 2, 6, 4 };

		printUnion(firstArray, secondArray);
		printIntersection(firstArray, secondArray);

	}

	public static void printUnion(int[] array1, int[] array2) {
		int length = array1.length >= array2.length ? array1.length : array2.length;
		String result = "";
		for (int i = 0; i < length; i++) {
			if (array1.length >= i && !checkExists(array1[i], result))
				result += array1[i];

			if (array1.length >= i && !checkExists(array2[i], result))
				result += array2[i];

		}

		System.out.println(result);

	}

	public static void printIntersection(int[] array1, int[] array2) {
		int length = array1.length >= array2.length ? array1.length : array2.length;
		String result = "";
		/* which array to pick should be evaluated based on smaller one inside */
		for (int i = 0; i < length; i++) {
			for (int value : array2) {
				if (array1[i] == value && !checkExists(array1[i], result))
					result += array1[i];

			}
		}
		System.out.println(result);
	}

	public static boolean checkExists(int value, String values) {
		boolean result = false;

		if (values.contains(String.valueOf(value)))
			result = true;

		return result;
	}

}
