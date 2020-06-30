package com.utsav;

import java.util.Scanner;
public class PalindromeInteger {

	public static void main(String[] args) {
	try{
		  System.out.println("Enter number");
		  int input = new Scanner(System.in).nextInt();
		  int nnumber = input;
		  int reverse = 0;
		  System.out.println("Number: " + input);
		  while(input > 0){
			  int r=input%10;
			  input=input/10;
			  reverse =reverse *10+r;
		  }
		  System.out.println("After reversing the number: " + reverse);
		  if(nnumber == reverse ){
			  System.out.print("Number is palindrome!");
		  }
		  else{
			  System.out.println("Number is not palindrome!");
		  }
		  }
		  catch(Exception e){
			  System.out.println("Out of range!");
		  }
		}
	} 