package com.utsav.string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "india";
		char charArr[] = str.toCharArray();
		String reverse = "";
		int i = 0, j = charArr.length - 1;
		while (i < j) {
			// swap chs[i] and chs[j]
			char t = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = t;
			i++;
			j--;
		}
		for (char c : charArr) {
			reverse = reverse + c;
		}
		System.out.println(reverse); // Using swap
		System.out.println(recursiveReverse(str)); // Using recursion
		System.out.println(reverseStringWithoutTemp(str)); // Without temp
															// variable
	}

	// Recursive
	private static String getReverse(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		return getReverse(str.substring(1)) + str.charAt(0);
	}

	public static String recursiveReverse(String orig) {
		if (orig.length() == 1)
			return orig;
		else
			return orig.charAt(orig.length() - 1) + recursiveReverse(orig.substring(0, orig.length() - 1));

	}

	// Without using temp variable OR recursion
	private static String reverseStringWithoutTemp(String str) {

		/*
		 * int arr[] = new int[str.length()]; int index = arr.length - 1; for
		 * (int i : str.toCharArray()) { arr[index--] = i; } str =
		 * str.substring(0, 0); for (int i : arr) { str =
		 * str.concat(String.valueOf((char)i)); }
		 */

		int len = str.length();
		for (int i = 0; i < len * 2; i++) {
			str = str.charAt(i) + str;
			i++;
		}
		str = str.substring(0, len);
		return str;
	}

}
