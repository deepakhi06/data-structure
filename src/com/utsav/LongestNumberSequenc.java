package com.utsav;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestNumberSequenc {

	public static void main(String[] args) {
		int[] num = {100, 4, 200, 1, 3, 2,5};
		int result = longestConsecutive(num);
		System.out.println(result);
	}
	public static int longestConsecutive(int[] num) {
		List<Integer> sequence = new ArrayList<Integer>();
		// if array is empty, return 0
		if (num.length == 0) {
			return 0;
		}
	 
		Set<Integer> set = new HashSet<Integer>();
		int max = 1;
	 
		for (int e : num)
			set.add(e);
	 
		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			int count = 1;
	 
			while (set.contains(left)) {
				count++;
				set.remove(left);
				sequence.add(left);
				left--;
			}
	 
			while (set.contains(right)) {
				count++;
				set.remove(right);
				sequence.add(right);
				right++;
			}
	 
			max = Math.max(count, max);
			Set<Integer> finalSequence = new HashSet<Integer>();
			for (Integer integer : sequence) {
				finalSequence.add(integer);
			}
			
			for (Integer integer : finalSequence) {
				System.out.println(integer);
			}
		}
	 
		return max;
	}
}
