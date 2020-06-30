package com.utsav.datastructure;

/*1.Use two pointer firstPtr and secondPtr and initialize both to head of linkedlist
  2.Move firstPtr by n-1 nodes.
  3.Increment firstPtr and secondPtr until firstPtr.next not equal to null.
  4.SecondPtr will be at nth from end node.*/

public class NthElementFromEndInLinkedList {

	private Node head;

	public static void main(String[] args) {
		NthElementFromEndInLinkedList list = new NthElementFromEndInLinkedList();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printList();
		// Finding 3rd node from end
		Node nthNodeFromLast = list.nthFromLastNode(head, 2);
		System.out.println("3th node from end is : " + nthNodeFromLast.value);

	}

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
				temp.next = node;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public Node nthFromLastNode(Node head, int n) {
		Node firstPtr = head;
		Node secondPtr = head;

		for (int i = 0; i < n; i++) {
			firstPtr = firstPtr.next;

		}
		while (firstPtr != null) {
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
		}
		return secondPtr;
	}
}
