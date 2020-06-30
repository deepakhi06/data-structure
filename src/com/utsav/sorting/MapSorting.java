package com.utsav.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSorting {

	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<Person, String>();
		/*map.put(1, "Aatif");
		map.put(2, "Varun");
		map.put(3, "Mantri");*/
		
		map.put(new Person(1,"Aatif","Hasan"), "One");
		map.put(new Person(1,"Aatif","Hasan"), "Two");
		map.put(new Person(2,"Aatif","Hasan"), "Three");
		
		List<Map.Entry<Person, String>> list = new ArrayList<Map.Entry<Person, String>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Person, String>>() {

			@Override
			public int compare(Entry<Person, String> o1,
					Entry<Person, String> o2) {
				return Integer.valueOf(o1.getKey().getId()).compareTo(o2.getKey().getId());
			}
		});
		for (Entry<Person, String> entry : list) {
			System.out.println(entry.getKey());
		}
	}

}
