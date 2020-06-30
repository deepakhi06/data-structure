package com.utsav.string;


public class StringTest {
	
	public static void main(String[] args) {
		String str = "India is great";
		String strArr[] = str.split(" ");
		String finalString = "";
		for(int i=strArr.length-1; i>=0; i--){
			finalString += strArr[i] + " ";
		}
		System.out.println(finalString);
	}
}
