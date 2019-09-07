package com.lav.stack.questions;

import java.util.Stack;

public class BalanceParanthesis {

	public static void main(String[] args) {

		System.out.println("Is paranthesis balanced: " + isBalanced("{{[()]}}"));

	}

	public static boolean isBalanced(String input) {

		Stack<Character> charStack = new Stack<Character>();
		char[] charArray = input.toCharArray();

		for (char paranthesis : charArray) {

			/* Push the opening parenthesis */
			if (paranthesis == '{' || paranthesis == '[' || paranthesis == '(') {
				charStack.push(paranthesis);
			}

			/* Closing parenthesis */
			if ((paranthesis == '}' || paranthesis == ']' || paranthesis == ')')) {

				/* If the first element is closing then error */
				if (charStack.isEmpty()) {
					return false;
				}

				/* Check if the top item in stack and current item makes a pair */
				if (!checkIfStackTopAndCurrentMatch(charStack.pop(), paranthesis)) {
					return false;
				}

			}
		}

		/* Lastly check if the stack is empty then it is balanced */
		if (charStack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	static boolean checkIfStackTopAndCurrentMatch(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

}
