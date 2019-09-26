package com.lav.sort;

public class QuickSort {

	/*- Best sorting algorithm with time complexity of 
	 * 
	 *  O(n log n)
	 */

	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 5, 1, 9, 2, 0, 6, 1, -1, -10 };

		quickSort(array, 0, array.length - 1);

		for (int num : array) {
			System.out.print(num + ", ");
		}

	}

	public static void quickSort(int[] array, int start, int end) {

		if (start >= end) {
			/* if the start is exceeded end then stop */
			return;
		} else {
			/* do the partitioning */
			int partitionIndex = partitioning(array, start, end);

			/* sort left of partitioning */
			quickSort(array, start, partitionIndex - 1);
			/* sort right of partitioning */
			quickSort(array, partitionIndex + 1, end);
		}

	}

	public static int partitioning(int[] array, int start, int end) {

		int pivot = array[end]; // we are taking last element as pivotal

		int partitionIndex = start; // set partitioning index as start initially

		for (int i = start; i < end; i++) {
			if (array[i] <= pivot) {
				swap(array, i, partitionIndex);
				partitionIndex++;
			}
		}

		swap(array, partitionIndex, end);
		return partitionIndex;

	}

	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
