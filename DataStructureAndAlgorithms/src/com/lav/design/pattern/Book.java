package com.lav.design.pattern;

public class Book {

	enum BookType {
		comic, fiction, psychological;
	}

	private BookType type;

	/* Keep it private so that no one can create an Object directly */
	private Book(BookType type) {
		this.type = type;
	}

	public static Book newInstanceComicBook() {
		return new Book(BookType.comic);
	}

	public static Book newInstanceFictionBook() {
		return new Book(BookType.fiction);
	}

	public static Book newInstancePsychologicalBook() {
		return new Book(BookType.psychological);
	}

	public void printType() {
		System.out.println("Book Type is: " + type);
	}

	/* EXECUTOR */
	public static void main(String[] args) {
		Book comicBook = Book.newInstanceComicBook();
		comicBook.printType();

		Book fictionBook = Book.newInstanceFictionBook();
		fictionBook.printType();

		Book pyschologicalBook = Book.newInstancePsychologicalBook();
		pyschologicalBook.printType();

	}

}
