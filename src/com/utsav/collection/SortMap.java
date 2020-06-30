package com.utsav.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Unix",1);
		map.put("Java",3);
		map.put("Scala",2);
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort( list, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
	});
	for(Entry<String,Integer> entry : list){
		System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
