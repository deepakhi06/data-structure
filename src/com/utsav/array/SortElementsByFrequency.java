package com.utsav.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortElementsByFrequency {

	/*
	 * O(N) with O(N) space 
	 * 1.) Put key and its frequency (as value) in a hashmap 
	 * 2.) Put all of the entries in a tree map which a custom Comparator. In
	 * this comparator, we first compare frequency and also the key to determine
	 * the order in the tree map.
	 * 3.) Iterator through the Tree map and build the
	 * output ( or you can put it back to an array output)
	 */
	
	static HashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 2, 8, 8, 8, 1, 1 };
		new SortElementsByFrequency().frequencyCount(a);
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(
				hm.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> arg0,
					Entry<Integer, Integer> arg1) {

				return arg1.getValue().compareTo(arg0.getValue());
			}
		});

		for (Map.Entry<Integer, Integer> i : list) {
			for (int j = 0; j < i.getValue(); j++) {
				System.out.print(i.getKey() + " ");
			}
			// System.out.println();
		}
	}

	public void frequencyCount(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (hm.containsKey(a[i]))
				hm.put(a[i], hm.get(a[i]) + 1);
			else
				hm.put(a[i], 1);
		}
	}
}
