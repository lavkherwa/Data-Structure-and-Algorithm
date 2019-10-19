package com.lav.string.questions;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubstring {
	public static void main(String[] args) {
		String[] values = { "a", "b", "c", "d" };

		List<String> result = findAllPossibleSubStrings(values, 4);

		for (String value : result) {
			System.err.println(value);
		}
	}

	public static List<String> findAllPossibleSubStrings(String[] inputCharArr, int length) {

		ArrayList<String> result = new ArrayList<>();

		// where to start
		for (int i = 1; i <= length; i++) {

			// where to end
			for (int j = 0; j <= length - i; j++) {

				String value = "";

				// print all from current to last
				int k = j + i - 1;
				for (int l = j; l <= k; l++) {

					value = value + inputCharArr[l];
				}

				result.add(value);
			}
		}

		return result;

	}
}
