package com.lav.sort;

public class BubbleSort {

	/*- Algorithm works on consecutive elements swap 
	 *  until whole array is sorted
	 * 
	 *  
	 *  Time complexity o(n^2) */

	public static void main(String[] args) {

		int[] array = { 3, 5, 7, 5, 1, 9, 2 };

		bubbleSort(array);

		for (int num : array) {
			System.out.print(num + ", ");
		}

	}

	public static void bubbleSort(int[] array) {

		boolean isSorted = false;

		int lastUnsorted = array.length;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted - 1; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
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
