package com.lav.design.pattern.factory;

public class Book {

	enum BookType {
		comic, fiction, psychological;
	}

	private BookType type;

	/* Keep it private so that no one can create an Object directly */
	private Book(BookType type) {
		this.type = type;
	}

	public void printType() {
		System.out.println("Book Type is: " + type);
	}

	/* Here is our factory */
	public static class Factory {

		public static Book newComicBook() {
			return new Book(BookType.comic);
		}

		public static Book newFictionBook() {
			return new Book(BookType.fiction);
		}

		public static Book newPsychologicalBook() {
			return new Book(BookType.psychological);
		}
	}

	/* EXECUTOR */
	public static void main(String[] args) {
		Book comicBook = Book.Factory.newComicBook();
		comicBook.printType();

		Book fictionBook = Book.Factory.newFictionBook();
		fictionBook.printType();

		Book pyschologicalBook = Book.Factory.newPsychologicalBook();
		pyschologicalBook.printType();

	}

}
