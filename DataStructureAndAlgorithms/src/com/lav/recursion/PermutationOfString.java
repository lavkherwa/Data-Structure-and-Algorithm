package com.lav.recursion;

public class PermutationOfString {
	/*- As we already know permutation will be n!, so recursion 
	 *  will be the right choice here
	 *  
	 *  n -> length of string 
	 */
	public static void main(String[] args) {

		String input = "kar";

		findPermutations(input.toCharArray(), new char[input.length()], new int[] { 1, 1, 1 }, 0);

	}

	public static void findPermutations(char[] input, char[] result, int[] count, int level) {

		if (level == input.length) {
			int counter = 0;
			for (char ch : result) {
				System.out.print(ch);
				counter++;
				if (counter == input.length) {
					counter = 0;
					System.out.print("\n");
				}
			}
		} else {

			for (int i = 0; i < input.length; i++) {
				if (count[i] == 0) {
					continue;
				} else {
					result[level] = input[i];
					count[i]--;
					findPermutations(input, result, count, level + 1);
					count[i]++;
				}
			}

		}

	}

}
