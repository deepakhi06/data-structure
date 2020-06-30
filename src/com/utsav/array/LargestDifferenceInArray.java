package com.utsav.array;

public class LargestDifferenceInArray {

	public static void main(String[] args) {
		int[] array = { 1, 0, 8, 6, 9 };
		new LargestDifferenceInArray().getLargestDifference(array);
	}

	private void getLargestDifference(int[] array) {
		int i = 0;
		int j = array.length - 1;
		int max = 0;
		while (i < j) {
			int diff = array[j] - array[i];
			if (max < diff)
				max = diff;
			i++;
			j--;
		}
		System.out.println(max);
	}

}
