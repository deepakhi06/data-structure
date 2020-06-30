package com.utsav.array;

public class SortingComparision {

	public static void main(String[] args) {
		int num1[] = { 26, 45, 56, 12, 78, 74, 39, 22, 5, 90, 87, 32, 28, 11,
				93, 62, 79, 53, 22, 51 };
		int num2[] = { 26, 45, 56, 12, 78, 74, 39, 22, 5, 90, 87, 32, 28, 11,
				93, 62, 79, 53, 22, 51 };
		int num3[] = { 26, 45, 56, 12, 78, 74, 39, 22, 5, 90, 87, 32, 28, 11,
				93, 62, 79, 53, 22, 51 };
		int bubsortcomp = bubble_srt(num1, num1.length);
		int selcomp = selection_srt(num2, num2.length);
		int inscomp = insertion_srt(num3, num3.length);
		System.out
				.println("Number of comparison in Bubble Sort " + bubsortcomp);
		System.out.println("Number of comparison in Selection Sort " + selcomp);
		System.out.println("Number of comparison in Insertion Sort " + inscomp);
	}

	public static int bubble_srt(int a[], int n) {
		int i, j, t = 0;
		int numswaps = 0;
		for (i = 0; i < n; i++) {
			for (j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					numswaps++;
					t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
				}
			}
		}
		return numswaps;
	}

	public static int selection_srt(int array[], int n) {
		int numswaps = 0;
		for (int x = 0; x < n; x++) {
			int index_of_min = x;
			for (int y = x; y < n; y++) {
				if (array[index_of_min] < array[y])
					index_of_min = y;
			}
			int temp = array[x];
			array[x] = array[index_of_min];
			array[index_of_min] = temp;
			numswaps++;
		}
		return numswaps;
	}

	public static int insertion_srt(int array[], int n) {
		// no swaps in insertion sort shifting based on comparison
		int comp = 0;
		for (int i = 1; i < n; i++) {
			int j = i;
			int B = array[i];
			while ((j > 0) && (array[j - 1] > B)) {
				comp++;
				array[j] = array[j - 1];
				j--;
			}
			array[j] = B;
		}
		return comp;
	}
}
