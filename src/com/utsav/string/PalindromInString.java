package com.utsav.string;

public class PalindromInString {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("1234"));
        System.out.println(longestPalindrome("12321"));
        System.out.println(longestPalindrome("9912321456"));
        System.out.println(longestPalindrome("9912333321456"));
        System.out.println(longestPalindrome("12145445499"));
	}
/*	*//**
     * This method returns the longest palindrome in the input String
     *
     *//*
    public static String longestPalindromeString(String in) {
        char[] input = in.toCharArray();
        int longestPalindromeStart = 0;
        int longestPalindromeEnd = 0;
 
        for (int mid = 0; mid < input.length; mid++) {
            // for odd palindrom case like 12321, 3 will be the mid
            int left = mid-1;
            int right = mid+1;
            // we need to move in the left and right side by 1 place till they reach the end
            while (left >= 0 && right < input.length) {
                // below check to find out if its a palindrome
                if (input[left] == input[right]) {
                    // update global indexes only if this is the longest one till now
                    if (right - left > longestPalindromeEnd
                            - longestPalindromeStart) {
                        longestPalindromeStart = left;
                        longestPalindromeEnd = right;
                    }
                }
                left--;
                right++;
            }
            // for even palindrome, we need to have similar logic with mid size 2
            // for that we will start right from one extra place
            left = mid-1;
            right = mid + 2;// for example 12333321 when we choose 33 as mid
            while (left >= 0 && right < input.length)
            {
                if (input[left] == input[right]) {
                    if (right - left > longestPalindromeEnd
                            - longestPalindromeStart) {
                        longestPalindromeStart = left;
                        longestPalindromeEnd = right;
                    }
                }
                left--;
                right++;
            }
        }
        // we have the start and end indexes for longest palindrome now
        return in.substring(longestPalindromeStart, longestPalindromeEnd + 1);
    }*/
    
   public static String intermediatePalindrome(String s, int left, int right) {
        if (left > right) return null;
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
 
    // O(n^2)
    public static String longestPalindrome(String s) {
        if (s == null) return null;
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            //odd cases like 121
            String palindrome = intermediatePalindrome(s, i, i);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            //even cases like 1221
            palindrome = intermediatePalindrome(s, i, i + 1);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;
    }
 
}
