package com.lav.stack;

public class Stack<T> {

	private Node<T> top;

	Stack() {
		top = null;
	}

	public void push(T value) {
		Node<T> node = new Node<>(value, top);
		top = node;
	}

	public T pop() {
		T value = null;
		if (top != null) {
			value = this.top.getValue();
			top = this.top.getNextNode();
		}
		return value;
	}

}
