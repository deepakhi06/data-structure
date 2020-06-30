package com.utsav.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumbers {
	
/* There is a sorted array. You need to find all the missing numbers. 
  Write the complete code, without using any generics or inbuilt function or 
  binary operators. First and last terms will be given. Array will be sorted. 
  Array always starts with zero."
	Input:
	int array[] = { 0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23 };
	Output:
	Missing number(s): 5, 16, 17, 19, 22.*/
	
	public static int count = 0;
    public static int position = 0;
    public static boolean flag = false;

	public static void main(String[] args) {
		int a[] = { -2, 0, 1, 6, 3, 4};
        //findMissingNumbers(a, position);
        new FindMissingNumbers().findMissingNumbers(a);
	}
	
	/*private static void findMissingNumbers(int a[], int position) {

        if (position == a.length - 1)
            return;

        for (; position < a[a.length - 1]; position++) {

            if ((a[position] - count) != position) {
                System.out.println("Missing Number: " + (position + count));
                flag = true;
                count++;
                break;
            }
        }

        if (flag) {
            flag = false;
            findMissingNumbers(a, position);
        }
    }*/
	
	private void findMissingNumbers(int a[]) {
		List<Integer> arr = new ArrayList<Integer>();
		Arrays.sort(a);
		int j = a[0];
		for (int i=0;i<a.length;i++)
		{
		    if (j==a[i])
		    {
		        j++;
		        continue;
		    }
		    else
		    {
		        arr.add(j);
		        i--;
		        j++;
		    }
		}
		System.out.println("Missing numbers are ");
			for(int r : arr)
			{
			    System.out.print(" " + r);
			}
	}
}
