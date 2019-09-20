package com.lav.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList();
		myLinkedList.addAtStart("start");
		myLinkedList.add("end1");
		myLinkedList.addAtStart("again start");
		myLinkedList.addAtStart("again start 2");
		myLinkedList.add("end2");
		myLinkedList.add("end3");
		myLinkedList.add("end4");

		System.out.println("--------------Initial Linked List state---------------------\n");
		myLinkedList.printList();

		System.out.println("\n--------------Q2. Middle of Linked List-------------------------------\n");
		myLinkedList.middleOfLinkedList();

		// System.out.println(ll.getHead().data.toString());
		myLinkedList.delete(myLinkedList.getHead().next);

		// System.out.println(ll.getHead().next.data.toString());
		System.out.println("\n--------------After delete 2nd element--------------------\n");
		myLinkedList.printList();

		System.out.println("\n--------------Q1. Reverse Linked List-------------------------------\n");
		myLinkedList.reverse();
		myLinkedList.printList();

		System.out.println("\n--------------Q3. Linked List Contains loop-------------------------------\n");
		System.out.println(myLinkedList.doesLoopExists());
	}
}
