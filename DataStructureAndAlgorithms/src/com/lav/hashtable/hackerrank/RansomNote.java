package com.lav.hashtable.hackerrank;

import java.util.Hashtable;

public class RansomNote {

	public static void main(String[] args) {

		String[] magazine = { "hey", "there", "it's", "me" };
		String[] note = { "it's", "me", };

		System.out.println("isPossible: " + isPossible(magazine, note));

	}

	public static boolean isPossible(String[] magazine, String[] note) {

		boolean isPossible = true;

		if (note.length > magazine.length) {
			isPossible = false;
		} else {
			Hashtable<String, Integer> wordsCountMap = new Hashtable<>();

			for (String word : magazine) {
				Integer count = wordsCountMap.get(word);
				if (count != null) {
					wordsCountMap.put(word, ++count);
				} else {
					wordsCountMap.put(word, 1);
				}
			}

			// Check if exists
			for (String word : note) {
				Integer count = wordsCountMap.get(word);
				if (count == null) {
					isPossible = false;
					break;
				} else if (count > 1) {
					wordsCountMap.put(word, --count);
				} else {
					wordsCountMap.remove(word);
				}
			}
		}

		return isPossible;
	}
}
