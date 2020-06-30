package com.utsav.datastructure;


public class ReverseLinkedListRecursive {

	private Node head;

	public static void main(String[] args) {
		ReverseLinkedListRecursive list = new ReverseLinkedListRecursive();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		list.printList(head);
		// Reversing LinkedList
		Node reverseHead = reverseLinkedList(head);
		System.out.println("After reversing");
		list.printList(reverseHead);
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

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// Reverse linkedlist using this function -- Iterative
	public static Node reverseLinkedList(Node node) {
		if (node == null || node.next == null) {
			return node; 
		} 
		Node remaining = reverseLinkedList(node.next); 
		node.next.next = node; 
		node.next = null; 
		
		return remaining; 
	}
	
	private static class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}
}
