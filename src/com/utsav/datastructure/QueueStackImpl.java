package com.utsav.datastructure;

import java.util.Stack;


/* Stack is LIFO ( Last-in-First-Out).
  1.Take 2 Stacks, stack1 and stack2.
  2. stack1 will be used a back of the Queue and stack2 will be used as front of the Queue.
  3. Push() oper­a­tion will be done on stack1, and peek() and pop() oper­a­tions will 
     be done on stack2.
  4. When peek() and pop() are called, check is stack2 is empty, if yes then move all 
     the ele­ments from stack1 and push them into stack2.*/

public class QueueStackImpl {

	Stack<Integer> stack1 = new Stack<>(); // act as back of the Queue
	Stack<Integer> stack2 = new Stack<>(); // act as the front of the Queue

	public static void main(String[] args) {
		QueueStackImpl q = new QueueStackImpl();
		q.push(10);
		q.push(20);
		q.push(30);
		System.out.println("POP from Queue " + q.pop());

	}

	public void push(int x) { // push into stack 1
		stack1.push(x);
	}

	public int peek() {
		if (stack2.isEmpty()) {
			moveItems(stack1, stack2);
		}
		return stack2.peek(); // return the top element in stack2
	}

	public int pop() {
		if (stack2.isEmpty()) {
			moveItems(stack1, stack2);
		}
		return stack2.pop(); // return the top element in stack2
	}

	public void moveItems(Stack<Integer> s1, Stack<Integer> s2) {
		while (!stack1.isEmpty()) {
			s2.push(s1.pop()); // move all the elements from stack 1 to stack 2
		}
	}
}
