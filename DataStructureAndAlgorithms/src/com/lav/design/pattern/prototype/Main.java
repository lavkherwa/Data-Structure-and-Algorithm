package com.lav.design.pattern.prototype;

/*- Prototype pattern is used to work with copies (prototypes)
 *  
 *  There are various way we can do it. Avoid CLONING (suggestion)
 *  
 *  We prefer to do it using serialization
 */

public class Main {

	public static void main(String[] args) {

		Book book = new Book("1", "comic", "cacha choudhary", null);

		Book bookClone = book.copy();
		bookClone.setId("007");
		bookClone.setAuthor("Lav.. haha!!");

		System.out.println(book);
		System.out.println(bookClone);
	}

}
