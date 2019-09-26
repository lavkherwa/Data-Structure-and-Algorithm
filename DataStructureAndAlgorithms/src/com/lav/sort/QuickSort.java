package com.lav.sort;

public class QuickSort {

	/*- Algorithm works on divide and conquer
	 *  pivot point which is in between of smaller elements
	 *  on left and larger elements on right  
	 */

	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 5, 1, 9, 2 };

		quickSort(array);

		for (int num : array) {
			System.out.print(num + ", ");
		}

	}

	public static void quickSort(int[] array) {

	}
}
