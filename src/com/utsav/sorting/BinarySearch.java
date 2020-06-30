package com.utsav.sorting;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int item = 7;
		int index = getIndex(item, arr);
		System.out.println(index);
	}

	private static int getIndex(int item, int[] arr) {
		// if index = -1 when the method is finished, we did not find the
		// search term in the array
		int index = -1;
		// set the starting and ending indexes of the array; these will
		// change as we narrow our search

		int low = 0;
		int high = arr.length - 1;
		int mid;
		// Continue to search for the search term until we find it or
		// until our low and high markers cross
		while (high >= low) {
			mid = (high + low) / 2;// calculate the midpoint of the current
									// array
			if (item < arr[mid]) { // value is in lower half, if at all
				high = mid - 1;
			} else if (item > arr[mid]) {
				// value is in upper half, if at all
				low = mid + 1;
			} else {
				// found it! break out of the loop
				index = mid;
				break;
			}
		}
		return index;
	}
}
