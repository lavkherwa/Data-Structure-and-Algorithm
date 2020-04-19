package com.lav.design.pattern.abstractFactory;

public class TeaFactory implements HotDrinkFactory {

	@Override
	public HotDrink newInstance(String type) {

		HotDrink tea = null;
		TeaTypes teaType = TeaTypes.valueOf(type);

		switch (teaType) {
		case Regular:
			tea = new RegularTea();
			break;
		case Masala:
			tea = new MasalaTea();
			break;
		default:
			break;
		}

		return tea;
	}

}
