package searhing;

public class BinarySearch {
	private static int searchData(int[] arr, int data) {
		int n=arr.length;
		int l=0,h=n-1,mid;
		while(l<=h) {
			mid=(l+h)/2;
			//condition
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
		int arr[] = { 10, 22, 35, 45, 52, 60, 68, 70, 78, 85 };
		int data = 62;
		int result=searchData(arr, data);
		if(result==-1) {
			System.out.println("Data is not found");
		}else {
			System.out.println("Data is found at Loc:"+result);
		}
		
	}

}
