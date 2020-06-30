package com.utsav.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
	    list.add(new Person(1, "Aatif", "Hasan"));
	    list.add(new Person(3, "Irfan", "Ahmed"));
	    list.add(new Person(2, "Farman", "Ali"));
	    
	    Collections.sort(list, new NameComparator());
	    for (Person person : list) {
	      System.out.println(person.getFirstName());
	    }
	    System.out.println();
	    Collections.sort(list, new IdComparator());
	    for (Person person : list) {
		      System.out.println(person.getId() + ":" + person.getFirstName());
		    }
	}

}
