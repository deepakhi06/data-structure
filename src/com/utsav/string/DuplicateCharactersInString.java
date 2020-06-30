package com.utsav.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String str = "JavaIsTheBest";
		//getDuplicateCharacters(str);
		getDuplicateCharactersAndCount(str);
	}

	private static void getDuplicateCharacters(String str) {
		char[] charSet = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		/*for (char character : charSet) {
			if(charMap.containsKey(character)){
				charMap.put(character, charMap.get(character) + 1);
			}else{
				charMap.put(character,1);
			}
		}*/
		for (char c : charSet) {
			charMap.put(c, charMap.containsKey(c) ? charMap.get(c) + 1 : 1);
		}
		Set<Character> keySet = charMap.keySet();
		for (Character character : keySet) {
			if(charMap.get(character) > 1){
				System.out.println(character + " " + ": " + charMap.get(character));
			}
		}
	}
	
	private static void getDuplicateCharactersAndCount(String str){
		int[] counter = new int[25];
		char[] arr = str.toCharArray();
		for (char ch : arr) {
			int indx = ch - 'a';
			if(indx < 0 || indx > 25){
				continue;
			}
			counter[indx]++;
		}
		for(int i=0; i<counter.length; i++){
			if(counter[i] > 1){
				char ch = (char)('a' + i);
				System.out.println(ch + " : " + counter[i]);
			}
		}
	}
}
