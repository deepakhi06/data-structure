package com.utsav.string;

public class FindWordInSequence {
	
	/*Write a program to find the word nagarro in a sequence?
		For Example:
			aankjhaagoorahggrjkro
			Return: true
			nkkjkagarooraa
			Return: false*/
	static String name = "nagarro";
	public static void main(String[] args) {
		name = "nagarro";
		String input = "aankjhaagoorahggrjkro";
		
		//new FindWordInSequence().findWordMatch("aankjhaagoorahggrjkro");
        boolean value = new FindWordInSequence().isSubSequence(name, input, name.length(), input.length());
        System.out.println("Vlaue : " + value);

	}
	
	//n^2 complexity
	/*private void findWordMatch(String input){
		boolean result = false;
		for(int i=0; i<name.length(); i++){
			String temp = input;
			for(int j=0; j<input.length(); j++){
				if(name.charAt(i) == input.charAt(j)){
					input = input.substring(j+1);
					break;
				}
			}
			if("".equals(input) && input.equals(temp)){
				result = false;
				break;
			}else{
				result = true;
			}
		}
		if(result){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}*/
	
	//nLogn complexity
    private boolean isSubSequence(String str1, String str2, int m, int n) {
        int j = 0; // For index of str1 (or subsequence

        // Traverse str2 and str1, and compare current character
        // of str2 with first unmatched char of str1, if matched
        // then move ahead in str1
        for (int i = 0; i < n && j < m; i++)
               if (str1.charAt(j) == str2.charAt(i))
                     j++;

        // If all characters of str1 were found in str2
        return (j == m);
    }
    
   /* static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        // Base Cases
        if (m == 0) return true;
        if (n == 0) return false;
    
        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);
    
        // If last characters are not matching
        return isSubSequence(str1, str2, m, n-1);
    }*/

}
