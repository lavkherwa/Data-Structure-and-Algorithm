package com.lav.sort;

public class InsertionSort {

	public static void main(String[] args) {

		int[] array = { 3, 5, 7, 5, 1, 9, 2 };

		insertionSort(array);

		for (int num : array) {
			System.out.print(num + ", ");
		}

	}

	public static void insertionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			int minValueIndex = i;
			
			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[minValueIndex]) {
					minValueIndex = j;
				}

				swap(array, i, minValueIndex);
			}

		}

	}

	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
