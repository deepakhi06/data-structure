package com.utsav.array;

/**
 * Peak Element: peak element is the element which is greater than or equal to
 * both of its neighbors.
 * 
 * Linear approach: One way to solve this problem is to iterate over the array
 * and find an element that is greater than or equal to its neighbors and return
 * it. Time Complexity: O(n)
 * 
 * Efficient approach: Binary Searh 1.Initialize start = 0, end = array.length -
 * 1 2.Repeat following steps till peak element is found: a). Find mid =
 * (start+end)/2 b). If array[mid] is peak element, return array[mid] c). Else
 * if array[mid-1] > array[mid], find peak in left half of array set end = mid -
 * 1 d). Else find peak in right half of array set start = mid + 1 Time
 * Complexity: O(log n)
 * 
 * @author dekashya
 *
 */
public class PeakElement {
	public static Integer findPeakElementByLinearSearch(int arr[]) {
		if (arr == null || arr.length == 0) {
			return null;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.println("Peak element is :- " + arr[i]);
				return arr[i];
			}

		}
		return arr[arr.length - 1];

	}

	public static Integer findPeakElementByBinarySearch(int arr[]) {
		if (arr == null || arr.length == 0) {
			return null;
		}
		int start = 0;
		int end = arr.length-1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
				return arr[mid];
			} else if (arr[mid] < arr[mid - 1]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return null;

	}

	public static void main(String[] args) {
		int arr[] = { 15, 20, 25, 35, 45, 50, 60 };
		int peakElement = PeakElement.findPeakElementByBinarySearch(arr);
		System.out.println("peakElement :- " + peakElement);
	}
}
