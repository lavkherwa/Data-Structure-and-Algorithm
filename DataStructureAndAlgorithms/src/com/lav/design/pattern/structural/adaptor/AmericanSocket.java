package com.lav.design.pattern.structural.adaptor;

public class AmericanSocket implements Socket{

	@Override
	public void charge() {
		System.out.println("Charging at 220V using american adapter");	
	}

	@Override
	public int getNumberOfpins() {
		return 2;
	}

	@Override
	public void increasePower(int power) {
		System.out.println("Power increased by " + power + "V");
	}

}
