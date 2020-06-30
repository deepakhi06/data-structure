package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {
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

		for (Entry<Character, Integer> mapList : mapChar.entrySet()) {
			if (mapList.getValue() == 1) {
				return mapList.getKey();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Character chr = firstRepeatingChar("analogy");
		System.out.println("<<<<<First Non Repeating char :- {}" + chr);
	}
}
