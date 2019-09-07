package com.lav.string.questions;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverseString("eulav desrever si sihT"));
		System.out.println(reverseInteger(-987654321).toString());

	}

	public static String reverseString(String input) {
		String reverseValue = "";

		char[] items = input.toCharArray();
		for (char item : items) {
			reverseValue = item + reverseValue;
		}
		return reverseValue;
	}

	public static Integer reverseInteger(Integer input) {
		String reverseValue = "";

		char[] items = input.toString().toCharArray();
		for (char item : items) {
			reverseValue = item + reverseValue;
		}
		
		/* Check for "-" sign and put it in front */
		if(reverseValue.substring(reverseValue.length() - 1 , reverseValue.length()).equals("-")) {
			reverseValue = reverseValue.substring(0, reverseValue.length() - 1);
			reverseValue = "-" + reverseValue;
		}
		
		return  Integer.parseInt(reverseValue);		
	}
}
