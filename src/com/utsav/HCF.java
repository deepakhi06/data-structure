package com.utsav;

public class HCF {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 9;
		int result = new HCF().findHCF(num1, num2);
		System.out.println(result);
	}

	private int findHCF(int num1, int num2) {
		if(num2 == 0){
			return num1;
		}
		return findHCF(num2, num1 % num2);
	}

}
