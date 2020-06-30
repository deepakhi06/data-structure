package com.utsav.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {
	static int i=0;
	public static void main(String[] args) {
		int[] unsortedArray = {3,2,5,1,4,6,3,2,8};
		sortedArray(unsortedArray);
		getMaximum(unsortedArray);
		getDuplicate(unsortedArray);
		getSecondHighestNo(unsortedArray);
	}

	public static void sortedArray(int[] unsortedArray) {
		for(i=0; i<unsortedArray.length-1; i++){
			for(int j=1; j<unsortedArray.length-i; j++){
				if(unsortedArray[j-1] > unsortedArray[j]){
					int temp = unsortedArray[j];
					unsortedArray[j] = unsortedArray[j-1];
					unsortedArray[j-1] = temp;
				}
			}
        }
	    System.out.printf("Sorted array after %d pass %s: %n", i+1, Arrays.toString(unsortedArray));
	}
	
	public static void getMaximum(int[] array){
		int temp = 0;
		for(int i=0; i<array.length-1; i++){
			temp = array[i];
			if(temp < array[i+1]){
				temp = array[i+1];
			}
		}
		System.out.println("Maximum no. is:" + " " + temp);
	}
	
	public static void getDuplicate(int[] array){
		int temp = 0;
		int count = 0;
		List<Integer> duplicate = new ArrayList<Integer>();
		for(int i=0; i<array.length-1; i++){
			temp = array[i];
			if(temp == array[i+1]){
				duplicate.add(array[i+1]);
				count++;
			}
		}
		System.out.println(duplicate);
		System.out.println("Duplicacy count:" + " " + count);
	}
	
	public static void getSecondHighestNo(int array[]){
		int largest = 0;
		int secondHighest = 0;
		for(int i=0; i<array.length; i++){
			if(array[i]>largest){
				secondHighest=largest;
				largest=array[i];
			}
		}
		System.out.println("Second highest no.:" + " " + secondHighest);
	}

}
