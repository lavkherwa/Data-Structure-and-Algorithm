package com.lav.linkedlist;

public class LinkedList {

	private String data;
	private Node nextNode;

	private Node head;

	public String getData() {
		return data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public Node getHead() {
		return head;
	}

	public void addAtStart(String data) {

		/* If head is null then create new head */
		if (head == null) {
			head = new Node(data, null);
		} else {
			Node currentHead = head;
			head = new Node(data, currentHead);
		}
	}

	public void add(String data) {

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

	public void delete(Node node) {

		Node iterator = head;

		/* If Linked list has no node then skip */
		if (iterator == null) {
			return;
		}

		/* Find the current node and by pass it */
		while (iterator.next == node) {
			/* By pass the deleted node */
			iterator.next = node.next;
			break;
		}
	}

	public void reverse() {

		if (head == null) {
			return;
		}

		Node previous = null;
		Node current = head;
		Node next = head.next;

		while (next != null) {
			current.next = previous;
			previous = current;
			current = next;
			next = next.next;

		}

		current.next = previous;

		head = current;

	}

	public void printList() {

		Node iterator = head;

		while (iterator != null) {
			System.out.println(iterator.data);
			iterator = iterator.next;
		}

	}

}
