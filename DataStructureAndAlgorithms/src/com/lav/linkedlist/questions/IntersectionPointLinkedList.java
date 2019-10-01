package com.lav.linkedlist.questions;

public class IntersectionPointLinkedList {

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

		Node intersection = findIntersection(l1.getHead(), l2.getHead());

		System.out.println("Intersection happened at: " + intersection.data);
	}

	public static Node findIntersection(Node l1, Node l2) {

		boolean stop = false;
		Node result = null;

		Node iterator1 = l1;
		while (iterator1 != null && stop == false) {
			Node iterator2 = l2;
			while (iterator2 != null && stop == false) {
				if (iterator1.data == iterator2.data) {
					result = iterator1;
					stop = true;
				} else {
					iterator2 = iterator2.next;
				}
			}
			if (!stop) {
				iterator1 = iterator1.next;
			}
		}

		return result;
	}

}
