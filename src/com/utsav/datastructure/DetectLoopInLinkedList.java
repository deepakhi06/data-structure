package com.utsav.datastructure;

/*1.Use two pointer fastPtr and slowPtr and initialize both to head of linkedlist
  2.Move fastPtr by two nodes and slowPtr by one node in each iteration.
  3.If fastPtr and slowPtr meet at some iteration , then there is a loop 
    in linkedlist.
  4.If fastPtr reaches to the end of linkedlist without meeting slow pointer 
    then there is no loop in linkedlist 
   (i.e fastPtr->next or fastPtr->next->next become null)*/

public class DetectLoopInLinkedList {

	private Node head;

	public static void main(String[] args) {
		DetectLoopInLinkedList list = new DetectLoopInLinkedList();
		// Creating a linked list
		list.addToTheLast(new Node(5));
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		list.printList();
		// Test if loop existed or not
		System.out.println("Loop existed-->" + list.ifLoopExists());
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

	public boolean ifLoopExists() {
		Node fastPtr = head;
		Node slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr)
				return true;
		}
		return false;
	}
}
