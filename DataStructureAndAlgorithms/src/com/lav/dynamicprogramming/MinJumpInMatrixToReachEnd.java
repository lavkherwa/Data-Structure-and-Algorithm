package com.lav.dynamicprogramming;

public class MinJumpInMatrixToReachEnd {

	public static void main(String[] args) {

		int matrim[][] = //
				{ //
						{ 5, 4, 2 }, //
						{ 9, 2, 1 }, //
						{ 2, 5, 9 }, //
						{ 1, 3, 11 } // 4*3 matrim
				};

		System.out.println("Min jump is: " + minJumpToReachEnd(matrim, 0, 0));

	}

	public static int minJumpToReachEnd(int[][] matrim, int m, int n) {
		// base case
		if (m == 4 - 1 && n == 3 - 1)
			return 0;

		/* find minimum through diagnol */
		int diag = Integer.MAX_VALUE;

		if (isValid(m + 1, n + 1))
			diag = minJumpToReachEnd(matrim, m + 1, n + 1) + Math.abs(matrim[m][n] - matrim[m + 1][n + 1]);

		/* find minimum through down */
		int down = Integer.MAX_VALUE;

		if (isValid(m + 1, n))
			down = minJumpToReachEnd(matrim, m + 1, n) + Math.abs(matrim[m][n] - matrim[m + 1][n]);

		/* find minimum through right */
		int right = Integer.MAX_VALUE;

		if (isValid(m, n + 1))
			right = minJumpToReachEnd(matrim, m, n + 1) + Math.abs(matrim[m][n] - matrim[m][n + 1]);

		// return minimum jumps
		return Math.min(down, Math.min(right, diag));
	}

	public static boolean isValid(int m, int n) {
		return (m < 4 && n < 3);
	};

}
