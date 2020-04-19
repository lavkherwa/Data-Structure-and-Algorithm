package com.lav.design.pattern.prototype;

import java.io.Serializable;

/* Serialize the object, so that we can make copies of it later */

public class Book implements Serializable {

	private static final long serialVersionUID = -5281576904220291060L;

	private String id;
	private String type;
	private String name;
	private String author;

	public Book(String id, String type, String name, String author) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", type=" + type + ", name=" + name + ", author=" + author + "]";
	}

}
