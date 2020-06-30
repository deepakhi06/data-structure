package com.utsav.array;

import java.util.Arrays;

public class MergeArraysNoSpace {
	/*
	 * Algorithm to merge two arrays A[0..m-1] and B[0..n-1] into an array
	 * C[0..m+n-1] is as following:
	 * 
	 * 1.) Introduce read-indices i, j to traverse arrays A and B, accordingly.
	 * Introduce write-index k to store position of the first free cell in the
	 * resulting array. By default i = j = k = 0. 
	 * 2.) At each step: if both indices
	 * are in range (i < m and j < n), choose minimum of (A[i], B[j]) and write
	 * it to C[k]. Otherwise go to step 4. 
	 * 3.) Increase k and index of the array,
	 * algorithm located minimal value at, by one. Repeat step 2. 
	 * 4.) Copy the rest
	 * values from the array, which index is still in range, to the resulting
	 * array.
	 */

	public static void main(String[] args) {
		int[] A = { -1, 0, 2, 1 };
		int[] B = { 3, 5, 4 };
		int[] C = new int[7];
		new MergeArraysNoSpace().getMergedAndSortedArray(A, B, C);
	}

	private void getMergedAndSortedArray(int[] A, int[] B, int[] C) {
		int i, j, k, m, n;

		i = 0;
		j = 0;
		k = 0;

		m = A.length;
		n = B.length;

		while (i < m && j < n) {
			if (A[i] <= B[j]) {
				C[k] = A[i];
				i++;
			} else {
				C[k] = B[j];
				j++;
			}
			k++;
		}

		if (i < m) {
			for (int p = i; p < m; p++) {
				C[k] = A[p];
				k++;
			}

		} else {
			for (int p = j; p < n; p++) {
				C[k] = B[p];
				k++;
			}
		}
		Arrays.sort(C);
		for (int l : C) {
			System.out.print(l + " ");
		}
	}

}
