package com.utsav.numberoperation;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
      //add duplicate number into the list
        numbers.add(22);
        System.out.println("Duplicate Number: "+ findDuplicateNumber(numbers));
	}
	public static int findDuplicateNumber(List<Integer> numbers){
         
	        int highestNumber = numbers.size() - 1;
	        int total = getSum(numbers);
	        int duplicate = total - (highestNumber*(highestNumber+1)/2);
	        return duplicate;
	  }
	public static int getSum(List<Integer> numbers){
         
	        int sum = 0;
	        for(int num:numbers){
	            sum += num;
	        }
	        return sum;
	    }
}
