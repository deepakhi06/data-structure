package programmingq;

public class ReverseString {
	public static void main(String[] args) {
		//By using charAt(index) method
		String s1="Hello",rev="";
		//olleH charAt(4)--o
		//      charAt(3)--l
		//      charAt(2)--l
		//      charAt(1)--e
		//      charAt(0)--H
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		
		System.out.println("Reverse string is :"+rev);
		
		//By using StringBuilder and StringBuffer //s1.reverse()
		StringBuilder strBuilder = new StringBuilder(s1);
		strBuilder.reverse();
		
		System.out.println("=== String revers by StringBuilder==="+strBuilder.toString());
		
	}

}
