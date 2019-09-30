package com.lav.string.questions;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurance {

	public static void main(String[] args) {

		String input = "bcdefghi";

		System.out.println(findMaxOccurance(input));

	}

	private static String findMaxOccurance(String input) {

		char[] charArray = input.toCharArray();
		Map<Character, Integer> charCountMap = new HashMap<>();
		int maxCount = 0;
		char maxChar = '0';

		for (char value : charArray) {

			if (charCountMap.get(value) != null) {
				/* If already present then increment */
				charCountMap.put(value, charCountMap.get(value) + 1);

				if (charCountMap.get(value) + 1 > maxCount) {
					maxCount = charCountMap.get(value);
					maxChar = value;
				}

			} else {
				/* If not present then add */
				charCountMap.put(value, 1);

				if (maxCount < 1) {
					maxCount = 1;
					maxChar = value;
				}
			}

		}

		return "Max occuring character is " + maxChar + ", occurs " + maxCount + " times";
	}
}
