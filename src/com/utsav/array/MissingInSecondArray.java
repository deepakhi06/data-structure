package com.utsav.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingInSecondArray {
	
	public static void main(String[] args) {
		int []array1 ={1,2,3,4,5};           
	    int []array2 ={3,1,2};
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		// Iterate over array1 and populate frequency map whereby
		// the key is the integer and the value is the number of
		// occurences.
		for (int val1 : array1) {
		  Integer freq = freqMap.get(val1);

		  if (freq == null) {
		    freqMap.put(val1, 1);
		  } else {
		    freqMap.put(val1, freq + 1);
		  }
		}

		// Now read the second array, reducing the frequency for any value
		// encountered that is also in array1.
		for (int val2 : array2) {
		  Integer freq = freqMap.get(val2);

		  if (freq == null) {
		    freqMap.remove(val2);
		  } else {
		    if (freq == 0) {
		      freqMap.remove(val2);   
		    } else {
		      freqMap.put(val2,freq - 1);
		    }
		  }
		}

		// Finally, iterate over map and build results.
		List<Integer> result = new ArrayList<Integer>();

		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
		  int remaining = entry.getValue();

		  for (int i=0; i<remaining; ++i) {
		    result.add(entry.getKey());
		  }
		}
		System.out.println(result);
	}
}
