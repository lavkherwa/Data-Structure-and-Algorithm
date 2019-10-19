package com.lav.hashtable.hackerrank;

import java.util.HashSet;

public class commonSubstring {

	public static void main(String[] args) {

		String s1 = "Lav Kherwa";
		String s2 = "Nd";

		commonSubstring(s1, s2);
		commonSubstring2(s1, s2);

	}

	// Brute force
	public static void commonSubstring(String s1, String s2) {

		boolean result = false;

		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();

		for (char a : charArr1) {
			for (char b : charArr2) {
				if (a == b) {
					result = true;
					break;
				}
			}

			if (result == true) {
				break;
			}
		}

		if (result) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	// Performance
	public static void commonSubstring2(String s1, String s2) {

		HashSet<Character> s1Chars = new HashSet<Character>();
		HashSet<Character> s2Chars = new HashSet<Character>();

		for (int i = 0; i < s1.length(); i++) {
			s1Chars.add(s1.charAt(i));
		}

		for (int i = 0; i < s2.length(); i++) {
			s2Chars.add(s2.charAt(i));
		}

		s1Chars.retainAll(s2Chars);

		if (s1Chars.isEmpty()) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}
}
