package com.lav.linkedlist;

public class Main {

	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList();
		myLinkedList.addAtStart("start");
		myLinkedList.add("end");
		myLinkedList.addAtStart("again start");
		myLinkedList.addAtStart("again start 2");
		
		System.out.println("--------------Initial Linked List state---------------------\n");
		myLinkedList.printList();
		
		//System.out.println(ll.getHead().data.toString());
		myLinkedList.delete(myLinkedList.getHead().next);
		
		//System.out.println(ll.getHead().next.data.toString());
		System.out.println("\n--------------After delete 2nd element--------------------\n");
		myLinkedList.printList();

		System.out.println("\n--------------After reverse-------------------------------\n");
		myLinkedList.reverse();
		myLinkedList.printList();
		
	}
}
