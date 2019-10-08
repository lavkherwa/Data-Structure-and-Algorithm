package com.lav.dynamicprogramming;

public class LongestCommonSequence {

	public static void main(String[] args) {

		String string1 = "abcdefaa";
		String string2 = "abdfa";

		char[] X = string1.toCharArray();
		char[] Y = string2.toCharArray();

		int m = X.length;
		int n = Y.length;

		System.out.println("Max common sequence count is: " + findMaxSequenceCount(X, Y, m, n));

	}

	public static int findMaxSequenceCount(char[] X, char[] Y, int m, int n) {

		/* if indexes are at start return */
		if (m == 0 || n == 0) {
			return 0;
		}

		/* compare -1, if they're equal then add 1 */
		if (X[m - 1] == Y[n - 1]) {
			return 1 + findMaxSequenceCount(X, Y, m - 1, n - 1);
		} else {
			/* else find the max from the previous row or column */
			return Math.max(findMaxSequenceCount(X, Y, m, n - 1), findMaxSequenceCount(X, Y, m - 1, n));
		}

	}

}
