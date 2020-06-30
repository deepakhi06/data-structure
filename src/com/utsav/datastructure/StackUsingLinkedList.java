package com.utsav.datastructure;

public class StackUsingLinkedList {
    LNode head= null;
    int size =0;

    public void push(int data){
        LNode x = new LNode(data);
        if(getSize()==0){
            head = x;
        }else{
            //add the Node at the start of a Linked List
            LNode temp = head;
            x.next = temp;
            head = x;
        }
        System.out.println("Element "+ data + " is pushed into Stack");
        size++;
    }

    public int pop(){
        if(getSize()==0){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            LNode temp = head;
            head = head.next;
            size--;
            return temp.data;
        }

    }

    public void printStack(){
        LNode curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stck = new StackUsingLinkedList();
        stck.push(1);
        stck.push(2);
        stck.push(4);
        stck.printStack();
        System.out.println("Pop out element " + stck.pop());
        stck.printStack();
    }
}
class LNode{
    int data;
    LNode next;
    public LNode(int data){
        this.data = data;
    }
}

