package com.lav.design.pattern.generics;

public class GenericExample<T> {

	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	
	/* EXECUTOR */
	public static void main(String[] args) {

		GenericExample<String> genericString = new GenericExample<>();
		GenericExample<Integer> genericInteger = new GenericExample<>();
		
		/*
		 * Generic are used for type safety as they're checked at compiled time
		 */
		genericString.setValue("Hello");
		genericInteger.setValue(123);

		System.out.println(genericString.getValue());
		System.out.println(genericInteger.getValue());

	}

}
