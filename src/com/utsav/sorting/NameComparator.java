package com.utsav.sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}
class IdComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getId()-o2.getId();
	}
}
