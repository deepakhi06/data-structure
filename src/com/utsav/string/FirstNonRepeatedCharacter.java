package com.utsav.string;
public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String str = "swiss";
		char[] arr= str.toCharArray();//new char[str.length()];
		/*for(int j=0;j<arr.length;j++)
		{
			arr[j]=str.charAt(j);
		}*/
		char found = new FirstNonRepeatedCharacter().returnFirstNonRepeatedChar(str,arr);
		//char found = new FirstNonRepeatedCharacter().getFirstNonRepeatedChar(str);
		System.out.println("The first non repeated char is: " + found);
	}

	 char returnFirstNonRepeatedChar(String str,char[] b) {

		int i = 0;
		while (i != str.length()) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (i != j) {
					if (str.charAt(i) != b[j]) {
						count++;
					}
				}
				if (count == str.length() - 1) {
					return str.charAt(i);
				}
			}
			i++;
		}
		return 0;
	}
	
  /*private char getFirstNonRepeatedChar(String str) {
        Map<Character,Integer> counts = new LinkedHashMap<Character, Integer>(str.length());
        
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        
        for (Entry<Character,Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }*/
}
