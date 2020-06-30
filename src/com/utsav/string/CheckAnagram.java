package com.utsav.string;

public class CheckAnagram {

	public static void main(String[] args) {
		String str1 = "abcd";
		String str2 = "abdc";
		boolean isAnagram = new CheckAnagram().isAnagram(str1, str2);
		if(isAnagram){
			System.out.println("Anagram");
		}else{
			System.out.println("Not Anagram");
		}
	}
	//Using Character Array
	private boolean isAnagram(String str1, String str2) {
		 if (str1.length() != str2.length()) {
		      return false;
		   }
		   char[] chars = str1.toCharArray();
		   for (char c : chars) {
		      int index = str2.indexOf(c);
		      if (index != -1) {
		         str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
		      } else {
		         return false;
		      }
		   }
		   return str2.isEmpty();
	}
	/*//Using StringBuilder
	private boolean isAnagram(String str1, String str2) {
		char[] characters = first.toCharArray();
		   StringBuilder sb = new StringBuilder(second);
		   for (char ch : characters) {
		      int index = sb.indexOf("" + ch);
		      if (index != -1) {
		         sb.deleteCharAt(index);
		      } else {
		         return false;
		      }
		   }
		   return sb.length() == 0 ? true : false;
	}
*/
}
