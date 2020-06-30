package com.utsav.array;

public class Merge2ArraysNoSpace {

	public static void main(String[] args) {
		int[] array1 = { -100, 10, 0, 150 };
		int[] array2 = { -131, 5, 2, 700, 0, 0, 0, 0 };
		new Merge2ArraysNoSpace().getMergedArray(array1, array2);
	}

	public void getMergedArray(int[] array1, int[] array2) {
		
		int swapIndex = array1.length - 1;

		for (int j = 0, i = 0; j < array2.length - 1;) {
			if (j == array2.length - 1 || (array2[j] == 0)) {
				// Copy the last element of array1 in to array2..
				array2[j] = array1[i];
				i++;
				j++;
			} else if ((array2[j] < array1[i]) && (array2[j] != 0)) {
				j++;
			} else if ((array2[j] > array1[i])) {
				// Move one index right in Array-2.
				for (int k = swapIndex; k >= j; k--) {
					array2[k + 1] = array2[k];
				}
				swapIndex = swapIndex + 1;
				array2[j] = array1[i];
				i++;
				j++;
			}
		}
		for (int p : array2) {
			System.out.print(p + " ");
		}
	}
}
