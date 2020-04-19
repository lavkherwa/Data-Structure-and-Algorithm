package com.lav.design.pattern.abstractFactory;

public class Main {

	public static void main(String[] args) {

		HotDrinkFactory tea = new TeaFactory();
		tea.newInstance(TeaTypes.Masala.toString()).consume();
		tea.newInstance(TeaTypes.Regular.toString()).consume();
		

		HotDrinkFactory coffee = new CoffeeFactory();
		coffee.newInstance(CoffeeTypes.Cappuccino.toString()).consume();
		coffee.newInstance(CoffeeTypes.Espresso.toString()).consume();

	}
}
