package com.utsav.array;

import java.util.HashMap;
import java.util.Map;

public class NumberPairsWithDifferenceK {
	/*
	 * Example k=4 and a[]={7,623,19,10,11,9,3,15} Output should be : 6 Pairs
	 * can be: 7,11 7,3 6,10 19,23 15,19 15,11
	 */
	public static void main(String[] args) {
		int a[]={7,6,23,19,10,11,9,3,15};
		new NumberPairsWithDifferenceK().findPairs(a,4);
	}

	public void findPairs(int a[], int subValue) {
		Map<Integer, Integer> store = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			store.put(a[i], 1);
		}
		for (int i = 0; i < a.length; i++) {
			if (store.containsKey(a[i] - subValue)) {
				System.out.println("(" + a[i] + "," + (a[i] - subValue) + ")");
			}
			if (store.containsKey(a[i] + subValue)) {
				System.out.println("(" + a[i] + "," + (a[i] + subValue) + ")");
			}
			store.remove(a[i]);
		}
	}
}
