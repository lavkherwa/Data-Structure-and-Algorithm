package com.lav.linkedlist.questions;

import java.util.HashMap;
import java.util.Map;

public class IntersectionPointLinkedList {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.add(3);
		l1.add(5);
		l1.add(7);
		l1.add(1);

		LinkedList l2 = new LinkedList();
		l2.add(2);
		l2.add(4);
		l2.add(3);
		l2.add(5);
		l2.add(6);

		/* Time complexity M*N */
		Node intersection = findIntersection(l1.getHead(), l2.getHead());
		if (intersection != null) {
			System.out.println("Intersection happened at: " + intersection.data);
		}

		/* Time complexity M+N */
		Node intersectionOptimized = findIntersectionOptimized(l1.getHead(), l2.getHead());
		if (intersectionOptimized != null) {
			System.out.println("Intersection happened at: " + intersectionOptimized.data);
		}

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

	public static Node findIntersectionOptimized(Node l1, Node l2) {

		// Get all the visitor nodes from linked list 1
		Map<Integer, Node> visited = new HashMap<>();
		Node iterator1 = l1;
		while (iterator1.next != null) {
			visited.put(iterator1.data, iterator1);
			iterator1 = iterator1.next;
		}

		// Check if visited node has come again in the second linked list
		Node iterator2 = l2;
		while (iterator2.next != null) {
			if (visited.get(iterator2.data) != null) {
				return iterator2;
			} else {
				iterator2 = iterator2.next;
			}
		}

		return null;
	}

}
