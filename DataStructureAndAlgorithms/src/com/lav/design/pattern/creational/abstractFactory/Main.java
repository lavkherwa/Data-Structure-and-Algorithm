package com.lav.design.pattern.creational.abstractFactory;

public class Main {

	public static void main(String[] args) {

		HotDrinkFactory tea = new TeaFactory();
		if (((TeaFactory) tea).isTeaAvailable("Masala")) {
			tea.newInstance(TeaTypes.Masala.toString()).consume();
		} else {
			System.out.println("Masala tea is not available in store");
		}

		if (((TeaFactory) tea).isTeaAvailable("Regular")) {
			tea.newInstance(TeaTypes.Regular.toString()).consume();
		} else {
			System.out.println("Regular tea is not available in store");
		}

		if (((TeaFactory) tea).isTeaAvailable("Ginger")) {
			tea.newInstance(TeaTypes.Ginger.toString()).consume();
		} else {
			System.out.println("Ginger tea is not available in store");
		}

		HotDrinkFactory coffee = new CoffeeFactory();
		coffee.newInstance(CoffeeTypes.Cappuccino.toString()).consume();
		coffee.newInstance(CoffeeTypes.Espresso.toString()).consume();

	}
}
