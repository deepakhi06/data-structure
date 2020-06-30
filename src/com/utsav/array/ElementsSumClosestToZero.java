package com.utsav.array;

public class ElementsSumClosestToZero {

	public static void main(String[] args) {

		int arr[] = { -45, -20, -2, -1, 12, 15, 30, 1 };
		new ElementsSumClosestToZero().minAbsSumPair(arr, 7);
	}

	private void minAbsSumPair(int[] arr, int n) {
		int left, right, min_sum, sum = 0, min_left, min_right;

		/* Array should have at least two elements */
		if (n < 2){
			System.out.println("Invalid Input");
			return;
		}

		/* Sort the elements */
		/* Start looking for the pair */
		left = 0;
		right = n - 1;
		min_sum = arr[left] + arr[right];
		min_left = left;
		min_right = right;

		while (left < right)
		{
			sum = arr[left] + arr[right];
			/* If abs(sum) is less then update the result items */
			if (Math.abs(sum) < Math.abs(min_sum)){
				min_sum = sum;
				min_left = left;
				min_right = right;
			}
			if (sum < 0)
				left++;
			else
				right--;
		}
		System.out.println(" The two elements whose sum is minimum are"
				+ arr[min_left] + "and" + arr[min_right]);
	}
}
