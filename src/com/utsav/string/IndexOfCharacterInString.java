package com.utsav.string;

public class IndexOfCharacterInString {
	
	public static void main(String[] args) {
		String str = "bananna";
		char character = 'n';
		indexOfCharacter(str, character);
	}
	
	private static void indexOfCharacter(String str, char character){
	for (int index = str.indexOf(character); index >= 0;index = str.indexOf(character, index + 1))
		{
			System.out.println(index);
		}
	}
}
