package com.lav.queue;

public class Queue<T> {

	private Node<T> front;
	private Node<T> back;

	Queue() {
		this.front = this.back = null;
	}

	public boolean isEmpty() {
		return (front == null) ? true : false;
	}

	public void enqueue(T value) {
		Node<T> node = new Node<>(value);

		if (this.isEmpty()) {
			this.front = this.back = node;
			/* next node and back node is same */
			this.front.setNextNode(node);
		} else {
			this.back.setNextNode(node);
			this.back = node;
		}
	}

	public T dequeue() throws Exception {
		Node<T> node = this.front;

		if (!isEmpty()) {
			this.front = this.front.getNextNode();
		}

		if (this.front != null) {
			this.back = null;
		}
		
		if(node != null) {
			return (T) node.getValue();	
		}else {
			throw new Exception("No element in the Queue");
		}
		
	}

}
