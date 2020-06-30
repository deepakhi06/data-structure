package com.utsav;

public class MiddleIndexBothEndSumEqual {

	public static void main(String[] args) {
		int array[] = {2,4,4,5,4,1};
		try{
			System.out.println("Starting from index 0, adding numbers till index" + " " +
					findMiddleIndex(array) + "  " + "and adding rest of the numbers can be equal.");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static int findMiddleIndex(int[] array) throws Exception {
		int endIndex = array.length-1;
		int startIndex = 0;
		int sumLeft = 0;
		int sumRight = 0;
		while(true){
			if(sumLeft > sumRight){
				sumRight += array[endIndex--];
			}else{
				sumLeft += array[startIndex++];
			}
			if(startIndex > endIndex){
				if(sumLeft == sumRight){
					break;
				}else{
					throw new Exception(
                            "Please pass proper array to match the requirement");
				}
			}
		}
		return endIndex;
	}
}
