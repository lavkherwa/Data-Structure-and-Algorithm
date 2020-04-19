package com.lav.design.pattern.structural.adaptor;

public class IndianSocket implements Socket {

	@Override
	public void charge() {
		System.out.println("Charging at 230V using indian adapter");
	}

	@Override
	public int getNumberOfpins() {
		return 3;
	}

	@Override
	public void increasePower(int power) {
		System.out.println("no implemented");
	}

}
