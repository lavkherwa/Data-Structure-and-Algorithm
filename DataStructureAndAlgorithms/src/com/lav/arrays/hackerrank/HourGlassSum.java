package com.lav.arrays.hackerrank;

public class HourGlassSum {

	public static void main(String[] args) {

		int[][] matrix = //
				{ //
						{ 5, 4, 2, 2, 1, 1 }, //
						{ 9, 2, 1, 8, 1, 1 }, //
						{ 5, 4, 2, 2, 1, 1 }, //
						{ 2, 5, 9, 8, 1, 1 }, //
						{ 5, 4, 2, 2, 1, 1 }, //
						{ 1, 3, 1, 6, 1, 1 } // 6*6 matrix
				};

		System.out.println("Max hour sum is: " + findMaxHourGlass(matrix));
	}

	private static int findMaxHourGlass(int[][] matrix) {

		int rows = matrix.length;
		int columns = matrix[0].length;
		int max_sum = -63; // 7 times -6

		// traverse row
		for (int m = 0; m < rows - 2; m++) {
			// count till -2 because we are calculating indexes + 2, else
			// obviously we will run into array out of bound exception
			for (int n = 0; n < columns - 2; n++) {

				int current_sum = //
						matrix[m][n] + //
								matrix[m][n + 1] + //
								matrix[m][n + 2] + //
								matrix[m + 1][n + 1] + //
								matrix[m + 2][n] + //
								matrix[m + 2][n + 1] + //
								matrix[m + 2][n + 2];

				max_sum = Math.max(max_sum, current_sum);

			}
		}

		return max_sum;

	}

}
