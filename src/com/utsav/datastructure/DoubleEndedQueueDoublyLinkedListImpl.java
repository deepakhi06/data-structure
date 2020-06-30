package com.utsav.datastructure;

public class DoubleEndedQueueDoublyLinkedListImpl<T> {

	private DNode<T> front;
	private DNode<T> rear;
	
	public static void main(String a[]) {
		DoubleEndedQueueDoublyLinkedListImpl<Integer> deque = new DoubleEndedQueueDoublyLinkedListImpl<Integer>();
		deque.insertFront(34);
		deque.insertFront(67);
		deque.insertFront(29);
		deque.insertFront(765);
		deque.removeFront();
		deque.removeFront();
		deque.removeFront();
		deque.insertRear(43);
		deque.insertRear(83);
		deque.insertRear(84);
		deque.insertRear(546);
		deque.insertRear(356);
		deque.removeRear();
		deque.removeRear();
		deque.removeRear();
		deque.removeRear();
		deque.removeFront();
		deque.removeFront();
		deque.removeFront();
	}

	public void insertFront(T item) {
		// add element at the beginning of the queue
		System.out.println("adding at front: " + item);
		DNode<T> nd = new DNode<T>();
		nd.setValue(item);
		nd.setNext(front);
		if (front != null)
			front.setPrev(nd);
		if (front == null)
			rear = nd;
		front = nd;
	}

	public void insertRear(T item) {
		// add element at the end of the queue
		System.out.println("adding at rear: " + item);
		DNode<T> nd = new DNode<T>();
		nd.setValue(item);
		nd.setPrev(rear);
		if (rear != null)
			rear.setNext(nd);
		if (rear == null)
			front = nd;

		rear = nd;
	}

	public void removeFront() {
		if (front == null) {
			System.out.println("Deque underflow!! unable to remove.");
			return;
		}
		// remove an item from the beginning of the queue
		DNode<T> tmpFront = front.getNext();
		if (tmpFront != null)
			tmpFront.setPrev(null);
		if (tmpFront == null)
			rear = null;
		System.out.println("removed from front: " + front.getValue());
		front = tmpFront;
	}

	public void removeRear() {
		if (rear == null) {
			System.out.println("Deque underflow!! unable to remove.");
			return;
		}
		// remove an item from the beginning of the queue
		DNode<T> tmpRear = rear.getPrev();
		if (tmpRear != null)
			tmpRear.setNext(null);
		if (tmpRear == null)
			front = null;
		System.out.println("removed from rear: " + rear.getValue());
		rear = tmpRear;
	}
}

class DNode<T> {

	private DNode<T> prev;
	private DNode<T> next;
	private T value;

	public DNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DNode<T> prev) {
		this.prev = prev;
	}

	public DNode<T> getNext() {
		return next;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
