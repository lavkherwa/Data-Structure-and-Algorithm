package com.lav.arrays.hackerrank;

public class FindMedianOfTwoSortedArray {
	public static void main(String[] args) {

		int[] first = { 1, 2 ,4};
		int[] second = { 3};

		System.out.println(findMedianSortedArrays(first, second));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int[] target = new int[nums1.length + nums2.length];
		int count = 0;

		// merge both arrays
		for (int i = 0; i < nums1.length; i++) {
			target[i] = nums1[i];
			count++;
		}
		for (int i = 0; i < nums2.length; i++) {
			target[count++] = nums2[i];
		}

		// sort the target again
		bubbleSort(target);

		int median = target.length / 2;
		if (target.length % 2 == 0) {
			double result = target[median] + target[median - 1];;
			result = result / 2;
			return result;
		} else {
			return target[median];
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

	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
