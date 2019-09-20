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

	public void printList() {

		Node iterator = head;

		while (iterator != null) {
			System.out.println(iterator.data);
			iterator = iterator.next;
		}

	}

	public int size() {

		if (head == null) {
			return 0;
		}

		Node temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}

		return size;

	}

	/* Q1. Find middle of linked list */
	public void middleOfLinkedList() {

		if (head == null) {
			System.err.println("0");
			return;
		}

		Node fast_2x = head;
		Node normal_1x = head;
		while (fast_2x != null && fast_2x.next != null) {
			fast_2x = fast_2x.next.next;
			normal_1x = normal_1x.next;
		}

		System.out.println(normal_1x.data);

	}

	/* Q2. Reverse a linked list */
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

	/* Q3. Find if linked list contain loops */
	public boolean doesLoopExists() {

		if (head == null) {
			return false;
		}

		Node fast_2x = head;
		Node normal_1x = head;
		while (fast_2x != null && fast_2x.next != null) {
			fast_2x = fast_2x.next.next;
			normal_1x = normal_1x.next;

			// If collision happens means loop exists
			if (fast_2x == normal_1x) {
				return true;
			}
		}

		return false;
	}

	/* Q4. nth element from last of linked list */
	public void nthElementFromLast(int n) {

		/* length of linked list */
		Node temp = head;
		int length = 0;
		if (head != null) {
			while (temp.next != null) {
				temp = temp.next;
				length++;
			}
		}

		/* Check if length is less than nth element */
		if (length < n)
			return;

		/* find the nth element value */
		temp = head;
		for (int i = 0; i < length - n + 1; i++)
			temp = temp.next;

		System.out.println(temp.data);

	}

}
