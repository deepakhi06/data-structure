package com.utsav.array;

public class LeadersInArray {
	/*
	 * An element is leader if it is greater than all the elements to its right
	 * side. And the rightmost element is always a leader. For example array {6,
	 * 7, 4, 3, 5, 2}, leaders are 7, 5 and 2.
	 */
	public static void main(String[] args) {
		int arr[] = { 6, 7, 4, 3, 5, 2 };
		new LeadersInArray().printLeaders(arr, 6);
	}

	private void printLeaders(int arr[], int n){
		int maximum = arr[n - 1];
		int i;
		// Rightmost element is always leader
		System.out.println(maximum);
		for (i = n - 2; i >= 0; i--){
			if (maximum < arr[i])
				{
					System.out.println(arr[i]);
					maximum = arr[i];
				}
		}
	}
}
