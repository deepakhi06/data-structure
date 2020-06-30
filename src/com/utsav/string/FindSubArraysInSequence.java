package com.utsav.string;

public class FindSubArraysInSequence {
	
	/*Write a program to find the all sub arrays in a sequence?
		For Example:
			String str = "abcde"
			Result: a, ab, abc, abcd, abcde, b, bc, bcd, bcde, cd, cde, d, de, e*/
			
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		new FindSubArraysInSequence().findSubArray("abc");
	}
	 public static void findSubArray(String input){
	       
	        for(int i=0; i<input.length(); i++) {
	            System.out.print(input.charAt(i)+", ");
	            String subStr=""+input.charAt(i);
	            for(int j=i+1; j<input.length(); j++) {
	                subStr+=input.charAt(j);
	                System.out.print(subStr.equals("")?"":subStr+", ");
	            }
	        }
	    }
}
