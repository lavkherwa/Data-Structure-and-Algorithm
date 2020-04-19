package com.lav.design.pattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Context {

	private boolean isFaulty = false;
	private List<String> inspectMessages = new ArrayList<>();

	public boolean isFaulty() {
		return isFaulty;
	}

	public void setFaulty(String message) {
		this.isFaulty = true;
		this.inspectMessages.add(message);
	}

	public List<String> getInspectMessages() {
		return inspectMessages;
	}

}
