package com.utsav.string;


public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "Hello World";
		removeDuplicates(str);
		//removeDupMaintainingCharOrder(str);
	}
	//LinkedHashSet maintains characters order
	/*public static void removeDupMaintainingCharOrder(String str) {
		char[] chars = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
	}*/
	
	public static void removeDuplicates(final String input) {
		final StringBuilder result = new StringBuilder();
	    for (int i = 0; i < input.length(); i++) {
	        boolean alreadySeen = false;
	        final char currentChar = input.charAt(i);
	        for (int j = 0; j < i; j++) {
	            if (currentChar == input.charAt(j)) {
	                alreadySeen = true;
	                break;
	            }
	        }

	        if (!alreadySeen)
	            result.append(currentChar);
	    }
	    System.out.println(result);
	}
}
