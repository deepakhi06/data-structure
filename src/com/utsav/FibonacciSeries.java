package com.utsav;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		//using iteration.
	/*	int input = 5;
		int f1,f2 = 0, f3 = 1;
		for(int i=1; i<=input; i++){
			System.out.print(" "+f3+" ");	
			f1 = f2;
			f2 = f3;
			f3 = f1+f2;
		}*/
		//Using recursion.
		System.out.println("Enter number upto Fibonacci is required:");
		int input = new Scanner(System.in).nextInt();
		for(int i=1; i<=input; i++){
			System.out.print(" " + fibonacci(i) + " ");
		}
	}

	private static int fibonacci(int num) {
		if(num == 1 || num == 2){
			return 1;
		}
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
	/*private static void getFiboSeries(){
		int fiboCount = 10;
		int fibo[] = new int[fiboCount];
		fibo[0] = 0; 
		fibo[1] = 1;
		for(int i=2; i<fiboCount; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		for (int i : fibo) {
			System.out.println(" " + i);
		}
	}*/
}


