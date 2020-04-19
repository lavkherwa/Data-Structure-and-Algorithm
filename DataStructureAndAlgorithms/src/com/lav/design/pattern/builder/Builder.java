package com.lav.design.pattern.builder;

import java.util.ArrayList;

public class Builder {

	private ArrayList<String> door = new ArrayList<String>();
	private ArrayList<String> window = new ArrayList<String>();
	private ArrayList<String> brick = new ArrayList<String>();
	private ArrayList<String> wall = new ArrayList<String>();
	private String item;

	public Builder(String item) {
		this.item = item;
		System.out.println("Let's start building " + item);
	}

	public Builder addBrick(String brick) {
		this.brick.add(brick);
		return this;
	}

	public Builder addWindow(String window) {
		this.window.add(window);
		return this;
	}

	public Builder addDoor(String door) {
		this.door.add(door);
		return this;
	}

	public Builder addWall(String wall) {
		this.wall.add(wall);
		return this;
	}

	public void finish() {
		System.out.println("You have a build " + item);
		for (int i = 0; i < this.brick.size(); i++) {
			System.out.println("brick added: " + this.brick.get(i));
		}
		for (int i = 0; i < this.wall.size(); i++) {
			System.out.println("wall added: " + this.wall.get(i));
		}
		for (int i = 0; i < this.door.size(); i++) {
			System.out.println("door added: " + this.door.get(i));
		}
		for (int i = 0; i < this.window.size(); i++) {
			System.out.println("window added: " + this.window.get(i));
		}
	}

	/* EXECUTOR */
	public static void main(String[] args) {
		Builder myCastle = new Builder("Castel");
		myCastle//
				.addBrick("first brick")//
				.addBrick("second brick")//
				.addBrick("third brick")//
				.addDoor("Main door")//
				.addWall("brick wall")//
				.addWindow("glass window")//
				.addWindow("wood window")//
				.finish();
	}

}