package searhing;

public class BinarySearch {
	private static int searchData(int[] arr, int data) {
		int n=arr.length;
		/*declare three variables 
		 * l=0(Assign the first index of the array) 
	     * h=n-1(Assign last index of the array,here n is the length of the array)
	     * and mid which is used to store the middle index of the array*/
		int l=0,h=n-1,mid;
		/*
		 * l index should be less than and equal to h and 
		 * below while loop will ran until l<=h condition true
		 */
		while(l<=h) {
			//calculate the mid index in every iteration
			mid=(l+h)/2;
			/*Conditions
			 * Now when we have l,h and mid in every iteration ,we have 
			 * to check the below 3 conditions
			 * 1- if data which we are trying to search will be present on the mid index of the array then
			 * return the index/loc of the array
			 * 2-if data is less than the mid value of the array then h variable will be changed to mid-1 
			 * 3-if data is greater than the mid value of the array then l variable will be changed to mid+1
			 */
			if(data==arr[mid]) {
				return mid;
			}else if(data<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		/*single dimensional array which will be sorted order.If it is not sorted then 
		 * first sort the array
		*/
		int arr[] = { 10, 22, 35, 45, 52, 60, 68, 70, 78, 85 };
		//data which is to be search
		int data = 62;
		
		int result=searchData(arr, data);
		if(result==-1) {
			System.out.println("Data is not found");
		}else {
			System.out.println("Data is found at Loc:"+result);
		}
		
	}

}
