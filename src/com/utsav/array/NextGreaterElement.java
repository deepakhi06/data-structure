package com.utsav.array;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] array = {40,50,11,32,55,68,75};
		new NextGreaterElement().getNGE(array);
	}
	
	public void getNGE(int[] array) {
		Stack<Integer> s = new Stack<Integer>(); 
		s.push(array[0]); 
		for (int i = 1; i < array.length; i++) {
			if (s.peek() != null) {
				while (true) {
					if (s.isEmpty() || s.peek() > array[i]) {
						break; 
					} if(!s.isEmpty())
						System.out.println(s.pop() + ":" + array[i]); } } s.push(array[i]);
						} while (!s.isEmpty() && s.peek() != null) {
							System.out.println(s.pop() + ":" + -1);
						}
	}
}
