package com.lav.linkedlist.questions;

/* Assume there is only one combination in the array 
 * with the sum which equals to target
 * 
 * 
 */

public class TwoSum {

	public static void main(String[] args) {

		GetIndices(new int[] { 2, 11, 7, 15 }, 9);

	}

	private static int[] GetIndices(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("indices are: " + i + ", " + j);
					return new int[] { i, j };
				}
			}
		}

		throw new IllegalArgumentException("No two sum solution");
	}

}
