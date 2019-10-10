package com.lav.warmup.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPairsPossible {

	public static void main(String[] args) {

		int[] sample = { 10, 20, 20, 10, 10, 50, 50,  10, 20 , 20, 10, 10};

		System.out.println("number of pairs possible: " + numberOfPairs(sample));
	}

	private static int numberOfPairs(int[] sample) {

		Map<Integer, Integer> count = new HashMap<>();
		for (int current : sample) {
			int value = count.get(current) != null ? count.get(current) : 0;
			if (value == 0) {
				count.put(Integer.valueOf(current), 1);
			} else {
				count.put(Integer.valueOf(current), value + 1);
			}
		}

		int result = 0;
		for (int value : count.values()) {
			result = result + Math.abs(value / 2);
		}

		return result;

	}

}
