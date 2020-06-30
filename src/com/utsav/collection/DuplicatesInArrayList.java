package com.utsav.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicatesInArrayList {

	public static void main(String[] args) {
		List<String> duplicateList = (List<String>) Arrays.asList("Android" , "Android", "iOS", "Windows mobile");
		System.out.println("size of Arraylist with duplicates: " + duplicateList.size()); //should print 4 becaues of duplicates Android

		System.out.println(duplicateList);
		     
		//Converting ArrayList to HashSet to remove duplicates
		Set<String> listToSet = new HashSet<String>(duplicateList);
		     
		//Creating Arraylist without duplicate values
		List<String> listWithoutDuplicates = new ArrayList<String>(listToSet);
		System.out.println("size of ArrayList without duplicates: " + listToSet.size()); //should print 3 becaues of duplicates Android removed
		System.out.println(listWithoutDuplicates);
		
		//Test retainAll().
		List<String> al1 = new ArrayList<String>();
		al1.add("Ravi");
		al1.add("Aatif");
		
		List<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Aatif");
		al2.add("Adam");
		al2.add("Robrt");
		
		al1.retainAll(al2);
		Iterator<String> itr = al1.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
}
