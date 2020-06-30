package com.utsav;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>();
		for(int i=1; i<20; i++){
			numbersList.add(i);
		}
		numbersList.add(10);
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		duplicateNumber.findDuplicateNumber(numbersList);
	}

	private void findDuplicateNumber(List<Integer> numbersList) {
		int highestNumber = numbersList.size()-1;
		int total = getSum(numbersList);
		int duplicate = total - (highestNumber * (highestNumber + 1)/2);
		System.out.println("Duplicate number is : " + duplicate);
	}

	private int getSum(List<Integer> numbersList) {
		int sum = 0;
		for (Integer number : numbersList) {
			sum = sum+number;
		}
		return sum;
	}

}
