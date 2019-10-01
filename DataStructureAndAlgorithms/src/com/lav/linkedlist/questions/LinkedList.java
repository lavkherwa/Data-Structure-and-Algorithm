package com.lav.linkedlist.questions;

public class LinkedList {

	private int data;
	private Node nextNode;

	private Node head;

	public int getData() {
		return data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public Node getHead() {
		return head;
	}

	public void add(int data) {

		Node newNode = new Node(data, null);

		Node iterator = head;

		/*- If the head node is empty means
		 *  LinkedList is not initialized yet
		 */
		if (iterator == null) {
			head = newNode;
			return;
		}

		/* Find the last node */
		while (iterator.next != null) {
			iterator = iterator.next;
		}

		/* Add to the last of the current last node */
		iterator.next = newNode;

	}

	public void printList() {

		Node iterator = head;

		while (iterator != null) {
			System.out.println(iterator.data);
			iterator = iterator.next;
		}

	}

}
