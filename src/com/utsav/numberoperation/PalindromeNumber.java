package com.utsav.numberoperation;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 1221;
		System.out.println(palindrome(num));
	}
	private static boolean palindrome(int num){
		int palindrome = num; 
		int reverse = 0;
		while(palindrome != 0){
			int remainder = palindrome%10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome/10;
		}
		if(reverse == num){
			return true;
		}else{
			return false;
		}
		
	}

}
