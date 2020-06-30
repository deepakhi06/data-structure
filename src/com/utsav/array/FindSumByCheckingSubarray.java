package com.utsav.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSumByCheckingSubarray {
	/*Write a program to find the sum by checking sub array?
	For Example:
	int array[1,2,3,4,5]
	Sum : 5
	Result: [2,3], [5]*/
	public static void main(String[] args) {
		int[] array = {-1,1,2,3,7,5,4};
        //new FindSumByCheckingSubarray();
		checkSum(array, 6);
		//printPairsUsingTwoPointers(array, 6);
	}
	//O(n^2)
	public static void checkSum(int array[], int requiredSum){
		 for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];

                if ((first + second) == requiredSum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }
	 }
	//O(n)
	 public static void printPairsUsingSet(int[] numbers, int sumRequired){
	        if(numbers.length < 2){
	            return;
	        }        
	        Set<Integer> set = new HashSet<Integer>(numbers.length);
	        for(int value : numbers){
	            int target = sumRequired - value;
	            
	            // if target number is not in set then add
	            if(!set.contains(target)){
	                set.add(value);
	            }else {
	                System.out.printf("(%d, %d) %n", value, target);
	            }
	        }
	    }
	 
	 //Less space complexity
	 public static void printPairsUsingTwoPointers(int[] numbers, int requiredSum){
	        if(numbers.length < 2){
	            return;
	        }
	        Arrays.sort(numbers);
	        
	        int left = 0; int right = numbers.length -1;
	        while(left < right){
	            int sum = numbers[left] + numbers[right];
	            if(sum == requiredSum){
	                System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
	                left++;
	                right--;
	            }else if(sum < requiredSum){
	                left++;
	            }else if (sum > requiredSum) {
	                right--;
	            }
	        }
	       
	    }
}
