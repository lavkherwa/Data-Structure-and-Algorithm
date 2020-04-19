package com.lav.design.pattern.creational.singleton;

public class Singleton {

	private static Singleton firstInst;

	/*
	 * Keep constructor private so if anyone tries to create with new keyword it is
	 * going to give error ;)
	 */
	private Singleton() {

	}

	public static Singleton getInstance() {

		/* This will be synchronized only once, for the first instance */
		synchronized (Singleton.class) {
			/* Check if instance doesn't exists then create a new instance */
			if (null == firstInst) {
				firstInst = new Singleton();
			}
		}

		return firstInst;
	}

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println("instance 1 hash is: " + System.identityHashCode(s1));
		System.out.println("instance 1 hash is: " + System.identityHashCode(s2));
	}

}
