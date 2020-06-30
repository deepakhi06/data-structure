package linkedlist;

public class MergeSortLinkedList {
	private Node head = null;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;
			this.next = null;

		}
	}

	public void addAtBegin(int key) {
		Node new_node = new Node(key);
		if (head == null) {
			// new_node=new Node(key);
			head = new_node;
		} else {
			new_node.next = head;
			head = new_node;
		}
	}

	public void addAtLast(int key) {
		Node new_node = new Node(key);
		if (head == null) {
			head = new_node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}

	public Node findMiddleNode(Node head) {
		Node slowPointer, fastPointer;
		slowPointer = fastPointer = head;

		while (fastPointer != null) {
			fastPointer = fastPointer.next;
			if (fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
		}

		return slowPointer;

	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d->", temp.value);
			temp = temp.next;
		}
	}

	public void deleteNodeAtLast() {
		if (head == null || head.next == null) {
			System.out.println("There is no elment in the list to delete");
		}
		Node temp = head;
		Node prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;

	}
	public void deleteFistNode(){
		if (head == null ) {
			System.out.println("There is no elment in the list to delete");
		}
		head = head.next;
	}

	public static void main(String[] args) {
		MergeSortLinkedList ms = new MergeSortLinkedList();
		ms.addAtBegin(1);
		ms.addAtBegin(2);
		ms.addAtBegin(3);

		ms.printList();

		//ms.deleteNodeAtLast();
		//System.out.println(" \n After Deletion Last node");
		//ms.printList();
		
		
		ms.deleteFistNode();
		System.out.println(" \n After Deletion First node");
		ms.printList();

	}
}
