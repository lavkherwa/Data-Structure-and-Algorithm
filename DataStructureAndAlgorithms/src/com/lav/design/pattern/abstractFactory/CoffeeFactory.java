package com.lav.design.pattern.abstractFactory;

public class CoffeeFactory implements HotDrinkFactory {

	@Override
	public HotDrink newInstance(String type) {

		HotDrink coffee = null;
		CoffeeTypes coffeeType = CoffeeTypes.valueOf(type);

		switch (coffeeType) {
		case Cappuccino:
			coffee = new Cappuccino();
			break;
		case Espresso:
			coffee = new Espresso();
			break;
		default:
			break;
		}

		return coffee;
	}

}
