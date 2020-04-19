package com.lav.design.pattern.abstractFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;

public class TeaFactory implements HotDrinkFactory {

	public List<String> allTeas() {
		List<String> teaTypes = new ArrayList<>();
		TeaTypes[] types = TeaTypes.values();

		for (TeaTypes type : types) {
			teaTypes.add(type.toString());
		}

		return teaTypes;
	}

	public boolean isTeaAvailable(String type) {

		boolean result = false;

		Set<Class<? extends HotDrink>> availableTypes = new Reflections("").getSubTypesOf(HotDrink.class);

		for (Class<? extends HotDrink> hotDrinkType : availableTypes) {

			if (hotDrinkType.getSimpleName().contains(type)) {
				result = true;
				break;
			}
		}
		return result;
	}

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
