package com.lav.design.pattern.prototype;

import org.apache.commons.lang3.SerializationUtils;

/*- Prototype pattern is used to work with copies (prototypes)
 *  
 *  There are various way we can do it. Avoid CLONING (suggestion)
 *  
 *  We prefer to do it using serialization
 */

public class Main {

	public static void main(String[] args) {

		Book book = new Book("1", "comic", "cacha choudhary", null);

		/*
		 * Serialization is powerful, doing a round trip will again serialize the whole
		 * object and return a fresh copy of the object
		 */
		Book bookClone = SerializationUtils.roundtrip(book);
		bookClone.setId("007");
		bookClone.setAuthor("Lav.. haha!!");

		System.out.println(book);
		System.out.println(bookClone);
	}

}
