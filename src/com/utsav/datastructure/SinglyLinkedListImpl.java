package com.utsav.datastructure;

public class SinglyLinkedListImpl<T> {

	private SinglyListNode<T> head;
	private SinglyListNode<T> tail;

	public static void main(String a[]) {
		SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(89);
		sl.addAfter(76, 54);
		sl.deleteFront();
		sl.deleteAfter(76);
		sl.traverse();
		
	}

	public void add(T element) {

		SinglyListNode<T> nd = new SinglyListNode<T>();
		nd.setValue(element);
		System.out.println("Adding: " + element);
		/**
		 * check if the list is empty
		 */
		if (head == null) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNextRef(nd);
			// set tail as newly created node
			tail = nd;
		}
	}

	public void addAfter(T element, T after) {

		SinglyListNode<T> tmp = head;
		SinglyListNode<T> refNode = null;
		System.out.println("Traversing to all nodes..");
		/**
		 * Traverse till given element
		 */
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(after) == 0) {
				// found the target node, add after this node
				refNode = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refNode != null) {
			// add element after the target node
			SinglyListNode<T> nd = new SinglyListNode<T>();
			nd.setValue(element);
			nd.setNextRef(tmp.getNextRef());
			if (tmp == tail) {
				tail = nd;
			}
			tmp.setNextRef(nd);

		} else {
			System.out.println("Unable to find the given element...");
		}
	}

	public void deleteFront() {

		if (head == null) {
			System.out.println("Underflow...");
		}
		SinglyListNode<T> tmp = head;
		head = tmp.getNextRef();
		if (head == null) {
			tail = null;
		}
		System.out.println("Deleted: " + tmp.getValue());
	}

	public void deleteAfter(T after) {

		SinglyListNode<T> tmp = head;
		SinglyListNode<T> refNode = null;
		System.out.println("Traversing to all nodes..");
		/**
		 * Traverse till given element
		 */
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(after) == 0) {
				// found the target node, add after this node
				refNode = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refNode != null) {
			tmp = refNode.getNextRef();
			refNode.setNextRef(tmp.getNextRef());
			if (refNode.getNextRef() == null) {
				tail = refNode;
			}
			System.out.println("Deleted: " + tmp.getValue());
		} else {
			System.out.println("Unable to find the given element...");
		}
	}

	public void traverse() {

		SinglyListNode<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}
	}
}

class SinglyListNode<T> implements Comparable<T> {

	private T value;
	private SinglyListNode<T> nextRef;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public SinglyListNode<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(SinglyListNode<T> ref) {
		this.nextRef = ref;
	}

	@Override
	public int compareTo(T arg) {
		if (arg == this.value) {
			return 0;
		} else {
			return 1;
		}
	}
}
