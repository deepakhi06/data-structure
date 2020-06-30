package com.utsav;

public class SumOfDigits {

	static int num = 123;
    static int sum = 0;
	public static void main(String[] args) {
		System.out.println(getNumberSum(num));
	}
	 public static int getNumberSum(int number){
         
	        if(number == 0){
	            return sum;
	        } else {
	            sum += (number%10);
	            getNumberSum(number/10);
	        }
	        return sum;
	    }
}
