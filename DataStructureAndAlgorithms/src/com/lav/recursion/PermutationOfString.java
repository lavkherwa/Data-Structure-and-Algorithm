package com.lav.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
	/*- As we already know permutation will be n!, so recursion 
	 *  will be the right choice here
	 *  
	 *  n -> length of string 
	 */
	public static void main(String[] args) {

		String input = "kar";
		ArrayList<String> output = new ArrayList<>();

		findPermutations(input.toCharArray(), new char[input.length()], new int[] { 1, 1, 1 }, 0, output);
		
		System.out.println("//////output//////");
		
		for(String value: output) {
			System.out.println(value);
		}

	}

	public static void findPermutations(char[] input, char[] result, int[] count, int level, List<String> output) {

		if (level == input.length) {
			int counter = 0;
			String value = "";
			for (char ch : result) {
				System.out.print(ch);
				value = value + ch;
				counter++;
				if (counter == input.length) {
					counter = 0;
					System.out.print("\n");
					output.add(value);
				}
			}
		} else {
			for (int i = 0; i < input.length; i++) {
				if (count[i] == 0) {
					continue;
				} else {
					result[level] = input[i];
					count[i]--;
					findPermutations(input, result, count, level + 1, output);
					count[i]++;
				}
			}

		}

	}

}
