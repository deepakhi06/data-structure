package com.utsav.string;

public class OccurrenceOfWordInSentence {
	
	public static void main(String[] args) {
		String str = "hello slk hello djladfj hello";
		String findStr = "hello";
		System.out.println(countOccurrence(str, findStr));
	}
	
	private static int countOccurrence(String str, String findStr){
    	
    	int lastIndex = 0;
    	int count = 0;
    	while (lastIndex != -1) {
    		lastIndex = str.indexOf(findStr, lastIndex);
    		if (lastIndex != -1) {
    			count++;
    			lastIndex += findStr.length();
    		}
    	}
		return count;
	}
}
