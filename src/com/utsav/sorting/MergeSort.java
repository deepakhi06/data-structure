package com.utsav.sorting;

/*Merge Sort is having N log2N complexity. 
It is more optiomized solution for sorting than other algorithms like Bubble 
Sort, Selection Sort or Insertion Sort. 

How it works:
	This algorithm works based on divide and conquer rule. First it divides
	whole collection(array) in small arrays containing 1 or 2 elements. 
	In the next steps it compare two arrays and than sort those two arrays. */

public class MergeSort {

	private int[] originalArray;
	private int[] sortedArray;
	
	public static void main(String[] args) {
		int [] unsortedArray = {-4,7,-9,11,8,22,98,5};
		new MergeSort().mergeSort(unsortedArray);
		System.out.print("After Sorting :");
		for (int i : unsortedArray) {
			System.out.print(" " + i);
		}
	}
	
	public void mergeSort(int[] array) {
		this.originalArray = array;
		this.sortedArray = new int[array.length];
		divide(0, array.length - 1);
	}

	private void divide(int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			divide(low, middle);
			divide(middle + 1, high);
			combine(low, middle, high);
		}
	}

	private void combine(int low, int middle, int high) {

		for (int i = low; i <= high; i++) {
			sortedArray[i] = originalArray[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (sortedArray[i] <= sortedArray[j]) {
				originalArray[k] = sortedArray[i];
				i++;
			} else {
				originalArray[k] = sortedArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			originalArray[k] = sortedArray[i];
			k++;
			i++;
		}
	}
}
