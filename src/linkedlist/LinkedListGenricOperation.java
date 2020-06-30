package linkedlist;

class TNode {
	TNode next;
	int data;
}

public class LinkedListGenricOperation {

	public void printList(TNode node) {
		if (node == null) {
			return;
		}
		while (node != null) {
			System.out.format("%d-->",node.data);
			node = node.next;
		}
	}

	public TNode getNewNode(int key) {
		TNode new_node = new TNode();
		new_node.data = key;
		new_node.next = null;
		return new_node;
	}

	public TNode addAtLast(TNode head, int key) {
		TNode temp = head;
		if (temp == null) {
			return getNewNode(key);
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = getNewNode(key);
		}
		return head;
	}

	public TNode addAtBegin(TNode head, int key) {
		TNode new_node = getNewNode(key);
		if (head == null) {
			head = new_node;
		} else {
			new_node.next = head;
			head = new_node;
		}
		return head;
	}

	public static void main(String[] args) {
		LinkedListGenricOperation list = new LinkedListGenricOperation();
		TNode head = null;
		head = list.addAtLast(head, 22);
		head = list.addAtLast(head, 3);
		head = list.addAtLast(head, 10);
		head = list.addAtLast(head, 13);

		/*
		 * head = addAtBegin(head, 22); head = addAtBegin(head, 3); head =
		 * addAtBegin(head, 10); head = addAtBegin(head, 13);
		 */
		list.printList(head);
	}
}
