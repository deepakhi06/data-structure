package com.utsav.sorting;

/*Bubble sort algorithm is the basic sorting algorithm with complexity of n2
In each iteration, adjucent elements are compared with each other and if they 
are in reverse order, swapping is done. If atleast one swapping is done in an 
iteration, next iteration will be exceuted. Iteration stops when there is no 
swap in current iteration.After each iteration biggest elements from the 
unsorted part of elements is shifted to sorted part of elements. */

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,-2,3,4,-5,6,7,8};
		getSorted(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	private static void getSorted(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		for(int i=right; i>1; i--){
			for(int j=left; j<i; j++){
				if(arr[j] > arr[j+1]){
					swap(j, j+1, arr);
				}
			}
		}
	}
	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
