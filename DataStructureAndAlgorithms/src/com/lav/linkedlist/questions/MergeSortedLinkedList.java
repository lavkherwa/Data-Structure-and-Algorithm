package com.lav.linkedlist.questions;

// https://www.geeksforgeeks.org/merge-two-sorted-linked-lists/
public class MergeSortedLinkedList {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(3);
		l1.add(5);
		l1.add(7);

		LinkedList l2 = new LinkedList();
		l2.add(2);
		l2.add(4);
		l2.add(5);
		l2.add(6);

		Node result = SortedMerge(l1.getHead(), l2.getHead());

		printList(result);

	}

	public static Node SortedMerge(Node l1, Node l2) {

		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		if (l1.data < l2.data) {
			l1.next = SortedMerge(l1.next, l2);
			return l1;
		} else {
			l2.next = SortedMerge(l1, l2.next);
			return l2;
		}
	}

	public static void printList(Node head) {

		Node iterator = head;

		while (iterator != null) {
			System.out.print(iterator.data + " ");
			iterator = iterator.next;
		}

	}
}
