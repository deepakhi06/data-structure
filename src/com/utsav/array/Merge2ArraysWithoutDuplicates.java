package com.utsav.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Merge2ArraysWithoutDuplicates {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {3,4,5,6,7,8};
		int arr3[] = merge(arr1, arr2);
		System.out.println(Arrays.toString(arr3));
	}

	public static int[] merge(int[] a, int[] b) {

	    Map map = new HashMap();
	    for(int i=0; i<a.length; i++){
	    	map.put(a[i], a[i]);
	    }
	    for(int i=0; i<b.length; i++){
	    	if(!map.containsKey(b[i])){
	    		map.put(b[i], b[i]);
	    	}
	    }
	    int[] answer = new int[map.size()];
	    Set s = map.keySet();
	    Iterator it = s.iterator();
	    while(it.hasNext()){
		    for(int i=0; i<s.size(); i++){
		    	answer[i] = (Integer)it.next();	    
		    }
		}
	    Arrays.sort(answer);
	    return answer;
	}
}
