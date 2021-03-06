package com.lav.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList();
		myLinkedList.addAtStart("1");
		myLinkedList.add("2");
		myLinkedList.addAtStart("3");
		myLinkedList.addAtStart("4");
		myLinkedList.add("5");
		myLinkedList.add("6");
		myLinkedList.add("7");

		System.out.println("Size of linked list is: " + myLinkedList.size() + "\n");

		System.out.println("--------------Initial Linked List state------------------------------\n");
		myLinkedList.printList();

		System.out.println("\n--------------Q1. Middle of Linked List----------------------------\n");
		myLinkedList.middleOfLinkedList();

		// System.out.println(ll.getHead().data.toString());
		myLinkedList.delete(myLinkedList.getHead().next);

		// System.out.println(ll.getHead().next.data.toString());
		System.out.println("\n--------------After delete 2nd element------------------------------\n");
		myLinkedList.printList();

		System.out.println("\n--------------Q2. Reverse Linked List-------------------------------\n");
		myLinkedList.reverse();
		myLinkedList.printList();

		System.out.println("\n--------------Q3. Linked List Contains loop-------------------------\n");
		System.out.println(myLinkedList.doesLoopExists());

		System.out.println("\n--------------Q4. Nth element from last-----------------------------\n");
		myLinkedList.nthElementFromLast(4);

	}
}
