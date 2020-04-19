package com.lav.design.pattern.structural.adaptor;

public class Main {

	
	public static void main(String[] args) {
		
		SocketAdapter socketAdapter = new SocketAdapter();
	
		socketAdapter.setSocket(new IndianSocket());
		System.out.println("Number of PIN: " + socketAdapter.getNumberOfpins());
		socketAdapter.increasePower(20);
		socketAdapter.charge();
		
		System.out.println("\n");
		
		socketAdapter.setSocket(new AmericanSocket());
		System.out.println("Number of PIN: " + socketAdapter.getNumberOfpins());
		socketAdapter.increasePower(20);
		socketAdapter.charge();
	}
}
