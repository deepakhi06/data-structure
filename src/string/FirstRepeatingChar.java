package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepeatingChar {

	public static Character firstRepeatingChar(String input) {
		Map<Character, Integer> mapChar = new LinkedHashMap<>();
		for (int i = 0; i < input.length(); i++) {
			Character chr = input.charAt(i);
			if (mapChar.containsKey(input.charAt(i))) {
				mapChar.put(chr, mapChar.get(chr) + 1);
			} else {
				mapChar.put(chr, 1);
			}

		}

		for (int i = 0; i < input.length(); i++) {
			if(mapChar.get(input.charAt(i)) > 1){
				return input.charAt(i);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Character chr = firstRepeatingChar("horizon tutorials");
		System.out.println("<<<<<First Repeating char :- {}" + chr);
	}

}
