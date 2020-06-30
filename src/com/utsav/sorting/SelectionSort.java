package com.utsav.sorting;

/*Selection sort algorithm is the basic sorting algorithm with complexity of n2
Whole array is divided virtually in two parts. First Part is sorted array and 
second part is unsorted array. Initially, sorted part is empty and unsorted 
part consist of whole array. In each iteration, element with lowest value 
form unsorted array is identified and placed it at the end of sorted array.*/

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {4,30,-3,7,1};
        new SelectionSort().selectionSort(arr); 
        System.out.print("After Sorting : ");
        for (int i : arr) {
        	 System.out.print(i + " ");
		}
	}

	private void selectionSort(int[] arr) { 
        int temp; 
        int n = arr.length;
              
        for(int i=0; i< n -1; i++) { 
             int indexOfMinNumber = i; 
             for(int j=i+1; j< n; j++){ 
                 if(arr[indexOfMinNumber] > arr[j]) { 
                      indexOfMinNumber = j;
                 } 
             } 
             if(indexOfMinNumber != i) { 
                 temp = arr[i];
                 arr[i] = arr[indexOfMinNumber]; 
                 arr[indexOfMinNumber] = temp; 
             } 
        } 
	}

}
