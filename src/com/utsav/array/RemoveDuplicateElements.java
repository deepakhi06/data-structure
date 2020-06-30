package com.utsav.array;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
		char[] input2 = {'a','f','h','a','h','d','u','d','y','f','a'};
        int[] output = new RemoveDuplicateElements().removeDuplicates(input1);
        for(int i:output){
            System.out.print(i+" ");
        }
        System.out.println();
        printDistinctElements(input2);
	}

	public int[] removeDuplicates(int[] input) {

		int j = 0;
		int i = 1;
		// return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		while (i < input.length) {
			if (input[i] == input[j]) {
				i++;
			} else {
				input[++j] = input[i++];
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}

		return output;
	}
	 public static void printDistinctElements(char[] arr){
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
