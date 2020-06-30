package linkedlist;

public class LinkedListDeleteLastOccurrenceOfAnElement {
	public static TNode deleteLastOccurrenceOfItem(TNode node, int val) {
		if (node == null) {
			return null;
		}

		TNode head, temp;

		head = node;
		temp = null;

		while (node != null) {
			if (node.data == val) {
				temp = node;
			}

			node = node.next;
		}

		if (temp == null) {
			return head;
		}

		if (temp == head) {
			return head.next;
		}

		if (temp.next == null) {
			node = head;
			while (node.next.next != null) {
				node = node.next;
			}
			node.next = null;
			return head;
		}

		temp.data = temp.next.data;
		temp.next = temp.next.next;

		return head;
	}

	public static void main(String[] args) {
		TNode head = null;
		LinkedListGenricOperation list = new LinkedListGenricOperation();
		head = list.addAtLast(head, 22);
		head = list.addAtLast(head, 3);
		head = list.addAtLast(head, 10);
		head = list.addAtLast(head, 13);
		head = list.addAtLast(head, 12);
		
		head = deleteLastOccurrenceOfItem(head, 13);
		list.printList(head);
	}
}
