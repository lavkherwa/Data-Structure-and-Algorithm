package com.lav.arrays.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMedianOfTwoSortedArrayOptimized {
	public static void main(String[] args) {

		int[] first = { 1, 2, 4 };
		int[] second = { 3 };

		System.out.println(findMedianSortedArrays(first, second));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		List<Integer> target = new ArrayList<>();

		// merge both arrays
		for (int i = 0; i < nums1.length; i++) {
			target.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			target.add(nums2[i]);
		}

		Collections.sort(target);

		int median = target.size() / 2;
		if (target.size() % 2 == 0) {
			double result = target.get(median) + target.get(median - 1);
			result = result / 2;
			return result;
		} else {
			return target.get(median);
		}
	}

}
