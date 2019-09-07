package com.lav.stack;

public class Node<T> {
	private T value;
	private Node<T> nextNode;

	Node(T value, Node<T> top) {
		this.value = value;
		this.nextNode = top;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

}
