package com.lav.design.pattern.behavioural.observer;

public class Mercedes {

	Context context;

	String name;
	String topSpeed;

	public Mercedes(Context context) {
		
		this.context = context;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(String topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public void inspect() {
		if(name == null || topSpeed == null) {
			context.setFaulty(this.getClass().getSimpleName().toString() + ": some information is missing");
		}
	}

}
