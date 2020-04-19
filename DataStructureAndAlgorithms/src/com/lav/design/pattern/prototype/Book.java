package com.lav.design.pattern.prototype;

import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

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

	/*-
	 * Serialization is powerful, doing a round trip will again serialize the whole
	 * object and return a fresh copy of the object.
	 * 
	 * NOTE: this will return a deep copy out of the box, don't use clone as that will
	 * only return shallow copy and we have to handle deep cloning ourselves
	 */
	public Book copy() {
		return SerializationUtils.roundtrip(this);
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
