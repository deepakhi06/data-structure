package com.utsav.sorting;

/*Insertion sort algorithm is the basic sorting algorithm with complexity of n2
Similar to the Selection Sort, whole array is divided virtually in two parts. 
First Part is sorted array with first element and second part is unsorted array 
with rest of the elements.Initially, sorted part is having first element of the 
array and unsorted part consist of rest of the elements.In each iteration, first 
element form the unsorted array is taken and placed it at the appropriate place 
in sorted array.*/

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {4,30,-3,7,1};
	
		insertionSort(arr);
		System.out.print("After Sorting : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	private static void insertionSort(int[] arr) {
		int i,j,temp;
		for(i=1; i< arr.length; i++) {
			j = i;
			temp = arr[i];
			while(j > 0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
}
