package com.utsav;

public class WithoutSemicolon {

	public static void main(String[] args) {
		
		if(System.out.printf("Hello world.!") != null){
			/* here i am using printf() instead of println() because println() 
			 * return type is "void". But printf() returns PrintStream object. 
			 * when control comes into if() then it prints the message.*/
		}
		
		//Another way is -
		//for(System.out.println("Hello world.!") ;;);
	}
}

