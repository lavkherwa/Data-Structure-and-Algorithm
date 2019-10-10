package com.lav.warmup.hackerrank;

public class NumberOfJumpsNeeded {

	public static void main(String[] args) {
		int[] input = { 0, 0, 0, 1, 0, 0 };

		System.out.println("jumps needed are: " + numberOfJumps(input));

	}

	public static int numberOfJumps(int[] input) {

		int result = 0;
		int start = 0;

		if (input[1] == 0) {
			start++;
		}else {
			result--;
		}

		for (int i = start; i < input.length; i++) {

			result = result + 1;

			System.out.println(i);

			if (i < (input.length - 2) && input[i + 2] == 0) {
				i = i + 1;
			}
		}

		return result;
	}

}
