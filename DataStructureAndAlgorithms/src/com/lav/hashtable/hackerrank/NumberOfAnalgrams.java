package com.lav.hashtable.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberOfAnalgrams {
	public static void main(String[] args) {

		String input = "gffryqktmwocejbxfidpjfgrrkpowoxwggxaknmltjcpazgtnakcfcogzatyskqjyorcftwxjrtgayvllutrjxpbzggjxbmxpnde";

		char[] values = input.toCharArray();

		System.out.println(numberOfAnalgrams(values, 100));
	}

	public static int numberOfAnalgrams(char[] inputCharArr, int length) {

		ArrayList<String> result = new ArrayList<>();
		Map<Integer, Integer> countMap = new HashMap<>();
		
		// find all substrings and keep their ASCII value sum to map
		for (int i = 1; i <= length; i++) {

			// where to end
			for (int j = 0; j <= length - i; j++) {

				String value = "";
				Integer currentWordASCII = 1;

				// print all from current to last
				int k = j + i - 1;
				for (int l = j; l <= k; l++) {

					value += inputCharArr[l];
					currentWordASCII = (inputCharArr[l] * currentWordASCII) % 1000000006;
				}

				// check if word analgram is present
				Integer currentCounter = countMap.get(currentWordASCII);
				if (currentCounter != null) {
					countMap.put(currentWordASCII, ++currentCounter);
				} else {
					countMap.put(currentWordASCII, 1);
				}

				result.add(value);
			}
		}

		int finalResult = 0;
		for (Integer value : countMap.values()) {

			// finalResult = finalResult + (value - 1);

			/*-
			 * if there n substrings then total combinations possible will be 
			 * 
			 *               n(n - 1)/2
			 */
			if (value >= 2) {
				finalResult += (value * (value - 1) / 2);
			}

		}

		return finalResult;
	}

	public static Map<Character, Integer> getPrimes() {
		Map<Character, Integer> primes = new HashMap<Character, Integer>();

		primes.put('a', 2);
		primes.put('b', 3);
		primes.put('c', 5);
		primes.put('d', 7);
		primes.put('e', 9);
		primes.put('f', 13);
		primes.put('g', 16);
		primes.put('h', 19);
		primes.put('i', 23);
		primes.put('j', 27);
		primes.put('k', 29);
		primes.put('l', 31);
		primes.put('m', 35);
		primes.put('n', 38);
		primes.put('o', 40);
		primes.put('p', 47);
		primes.put('q', 49);
		primes.put('r', 52);
		primes.put('s', 61);
		primes.put('t', 86);
		primes.put('u', 88);
		primes.put('v', 93);
		primes.put('w', 95);
		primes.put('x', 97);
		primes.put('y', 99);
		primes.put('z', 100);
		
		

		return primes;
	}

}
