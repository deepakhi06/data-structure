/**
 * 
 */
package linkedlist;

/**
 * @author dekashya
 *
 */
public class LinkedlistReverse {

	private Node head;

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

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * Logic for this would be:
	 * 
	 * 1- Have three nodes i.e previousNode,currentNode and nextNode 2- When
	 * currentNode is starting node, then previousNode will be null 3- Assign
	 * currentNode.next to previousNode to reverse the link. 4- In each
	 * iteration move currentNode and previousNode by 1 node.
	 * 
	 * @param head
	 * @param n
	 * @return
	 */
	// Reverse linkedlist using this function
	public static Node reverseLinkedList(Node currentNode) {
		// For first node, previousNode will be null
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}

	public static Node reverseLinkedListRecursive(Node currentNode) {
		if (currentNode == null || currentNode.next == null) {
			return currentNode;
		}
		Node temp = reverseLinkedListRecursive(currentNode.next);
		currentNode.next.next = currentNode;
		currentNode.next = null;
		return temp;
	}

	/*
	 * It reverses the linked list in group of K
	 */
	public static Node  reverseInGroup(Node head, int k) {
		Node prev, next;
		prev = next = null;

		Node node = head;

		int i = 0;

		while (node != null && i < k) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
			i++;
		}

		if (next != null) {
			head.next = reverseInGroup(next, k);
		}

		return prev;
	}

	public static void main(String[] args) {
		LinkedlistReverse list = new LinkedlistReverse();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printList(head);
		// Reversing LinkedList
		// Node reverseHead = reverseLinkedList(head);
		System.out.println("After reversing");

		//Node reverseHead = reverseLinkedListRecursive(head);
		//list.printList(reverseHead);
		
		Node reverseHead=reverseInGroup(head,3);
		list.printList(reverseHead);

	}

}
