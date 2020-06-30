package com.utsav.string;


public class SentenceReverse {

	public static void main(String[] args) {
		String str = "India is great";
		System.out.println(reverseStringWithoutReversingWords(str));
		System.out.println(reverseWordByWord(str));
		System.out.println(reverseWholeString(str));   
	}
	
	private static String reverseStringWithoutReversingWords(String str){
		String[] strArr = str.split(" ");
		String finalStr="";
        for(int i = strArr.length-1; i>= 0; i--){
            finalStr += strArr[i]+" ";
        }
        return finalStr;
	}
	
	private static String reverseWordByWord(String str){
        int strLeng = str.length()-1;
        String reverse = "", temp = "";

        for(int i = 0; i <= strLeng; i++){
            temp += str.charAt(i);
            if((str.charAt(i) == ' ') || (i == strLeng)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strLeng))
                        reverse += " ";
                }
                temp = "";
            }
        }
        return reverse;
    }
	
	private static String reverseWholeString(String str){
		String finalString = "";
		char arr[] = str.toCharArray();
		for(int i=arr.length-1; i>=0; i--){
			finalString += arr[i];
		}
		return finalString;
	}
	
	/*private static void reverseWordByWord(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++){
			while(st.hasMoreTokens()){
				String temp = st.nextToken();
				int len = temp.length();
				for(int j=0; j<len*2; j++){
					temp = temp.charAt(j) + temp;
					j++;
				}
				temp = temp.substring(0, len);
				sb.append(temp + " ");
			}
		}
		System.out.println(sb.toString());
	}
*/
}
