package linkedlist;

public class LinkedListRemoveKthElement {
	public TNode removeKthElement(TNode head,int k){
		
		
		return head;
		
	}
	public static void main(String[] args) {
		TNode head = null;
		LinkedListGenricOperation list = new LinkedListGenricOperation();
		head = list.addAtLast(head, 22);
		head = list.addAtLast(head, 3);
		head = list.addAtLast(head, 10);
		head = list.addAtLast(head, 16);
		head = list.addAtLast(head, 13);

		list.printList(head);
	}
}
