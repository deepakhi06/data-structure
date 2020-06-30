package com.utsav.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayComparision {

	public static void main(String[] args) {
		Integer[] first = {1,2,3,4};
		Integer[] second = {1,2,5};
		getMissing(first, second);
	}
	public static void getMissing(Integer[] first, Integer[] second){
		List<Integer> missing = new ArrayList<Integer>(new HashSet<Integer>(Arrays.asList(first)));
		for(Integer num : second){
			missing.remove(num);
		}
		System.out.println(missing);
	}
}
