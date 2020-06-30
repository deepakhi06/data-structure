package com.utsav.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {

	public static void main(String[] args) {
		 BufferedReader object = new BufferedReader(
				  new InputStreamReader(System.in));
		 System.out.println("Enter string");
		/*try {
			StringBuffer s1 = new StringBuffer(object.readLine());
			StringBuffer s2 = new StringBuffer(s1);
			s1.reverse();
			System.out.println("Given string is:" + s1);
			System.out.println("Rveersed string" + s2);
			
			if(String.valueOf(s1).compareTo(String.valueOf(s2))==0){
				System.out.println("Palindrome");
			}else{
				System.out.println("Not a Palindrome");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		 try {
			if(isPalindrome(object.readLine())==true){
				 System.out.println("Palindrome..");
			 }else{
				 System.out.println("Not a Palindrome.!!");
			 }
		} catch (IOException e) {
			System.out.println("Out of range.!!");
		}
	}
	public static boolean isPalindrome(String word) {
	    int left = 0;
	    int right = word.length() -1;

	    while (left < right) {
	        if (word.charAt(left) != word.charAt(right)) 
	            return false;

	        left++;
	        right--;
	    }
	    return true;
	}
	/*public static boolean checkPalindrome(String word){

		for(int i=0 ; i < word.length()/2;i++)
		{
		  if(word.charAt(i) != word.charAt(word.length()-1-i))

		      return false;
		}
		return true;
		}*/
	
	/*private static boolean checkPalindrome(String str) {
		int left = 0;
		int right = str.length();
		while(left < right){
			if(str.charAt(left) != str.charAt(right-1))
				return false;
			left++;
			right--;
		}
		return true;
	}*/
}
