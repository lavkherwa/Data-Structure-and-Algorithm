package com.lav.dynamicprogramming;

public class LongestCommonSequence {

	public static void main(String[] args) {

		String string1 = "abcdefaa";
		String string2 = "abdfa";

		char[] array1 = string1.toCharArray();
		char[] array2 = string2.toCharArray();

		int l1 = array1.length;
		int l2 = array2.length;

		System.out.println("Max common sequence count is: " + findMaxSequenceCount(array1, array2, l1, l2));

	}

	public static int findMaxSequenceCount(char[] array1, char[] array2, int l1, int l2) {

		/* if indexes are at start return */
		if (l1 == 0 || l2 == 0) {
			return 0;
		}

		/* compare -1, if they're equal then add 1 */
		if (array1[l1 - 1] == array2[l2 - 1]) {
			return 1 + findMaxSequenceCount(array1, array2, l1 - 1, l2 - 1);
		} else {
			/* else find the max from the previous diagnol row or column */
			return Math.max(//
					findMaxSequenceCount(array1, array2, l1, l2 - 1),
					findMaxSequenceCount(array1, array2, l1 - 1, l2));
		}

	}

}
