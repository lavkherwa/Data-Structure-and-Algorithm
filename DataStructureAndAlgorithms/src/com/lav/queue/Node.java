package com.lav.queue;

public class Node<T> {
	private T value;
	private Node<T> nextNode;

	Node(T value) {
		this.value = value;
		this.nextNode = null;
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
