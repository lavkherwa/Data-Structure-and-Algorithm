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

		Node result = SortedMergeIterative(l1.getHead(), l2.getHead()); // SortedMerge(l1.getHead(), l2.getHead());

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

	public static Node SortedMergeIterative(Node l1, Node l2) {

		Node dummyNode = new Node(0, null);
		Node tail = dummyNode;

		boolean stop = false;
		while (!stop) {

			/* When both ends stop the iterator */
			if (l1 == null && l1 == null) {
				stop = true;
			}

			if (l1 == null) {
				tail.next = l2;
				break;
			}
			if (l2 == null) {
				tail.next = l1;
				break;
			}

			/*
			 * Compare the data of the two lists whichever lists' data is smaller, append it
			 * into tail and advance the head to the next Node
			 */
			if (l1.data <= l2.data) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}

			/* Advance the tail */
			tail = tail.next;
		}

		return dummyNode.next;
	}

	public static void printList(Node head) {

		Node iterator = head;

		while (iterator != null) {
			System.out.print(iterator.data + " ");
			iterator = iterator.next;
		}

	}
}
