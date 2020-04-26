package com.lav.design.pattern.creational.prototype;

import java.io.Serializable;

public class Author implements Serializable {

	private static final long serialVersionUID = -3008452777974724873L;

	private String name;

	private String dob;

	public Author(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", dob=" + dob + "]";
	}

}
