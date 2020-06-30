package com.utsav;

import java.math.BigInteger;

public class Factorial{
	
	public static void main(String[] args) {
		int number = 5;
		System.out.println(getFactorial(number));
		//System.out.println(number + "! = " + getLargeFactorial(number));
	}
	
	public static int getFactorial(int number){
		if(number==1)
			return 1;
		number=number*getFactorial(number-1);
		return number;
	}
	
	//Factorial for large numbers
		public static BigInteger getLargeFactorial(int num){
			BigInteger inc = new BigInteger("1");
		    BigInteger fact = new BigInteger("1");
		 
		    for (int i = 1; i <= num; i++) {
		      fact = fact.multiply(inc);
		      inc = inc.add(BigInteger.ONE);
		    }
			return fact;
		}
}

