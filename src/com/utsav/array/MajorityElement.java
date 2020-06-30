package com.utsav.array;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

	/*
	 * Time Complexity: O(n) Auxiliary Space : O(1)
	 * 
	 * 
	 */
	public static Integer getMajorityElement(int[] array) {

		if (array == null || array.length == 0) {
			return null;
		}

		Integer candidate = null;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (count == 0) {
				candidate = array[i];
				count = 1;
				continue;
			} else {
				if (candidate == array[i]) {
					count++;
				} else {
					count--;
				}
			}
		}

		if (count == 0) {
			return null;
		}

		count = 0;
		for (int i = 0; i < array.length; i++) {
			if (candidate == array[i]) {
				count++;
			}
		}
		return (count > array.length / 2) ? candidate : null;
	}

	/*
	 * Time Complexity : O(n*n). Auxiliary Space : O(1).
	 */
	public static Integer getMajorityElementNaive(int[] array) {

		if (array == null || array.length == 0) {
			return null;
		}

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			if (count > array.length / 2) {
				return array[i];
			}
		}
		return null;
	}

	/*
	 * Time Complexity : O(n) Auxiliary Space : O(n)
	 */
	public static Integer getMajorityUsingHashMap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]) + 1;
				if (count > arr.length / 2) {
					System.out.println("Majority found :- " + arr[i]);
					return arr[i];
				} else
					map.put(arr[i], count);

			} else
				map.put(arr[i], 1);
		}
		System.out.println(" No Majority element");
		return null;
	}

	public static void main(String[] args) {

		int[] array = { 2, 6, 2, 2, 6, 2, 2, 8, 2, 1 };
		System.out.println(Arrays.toString(array) + " \nMajority Element: " + getMajorityUsingHashMap(array));

	}
}