package searhing;

public class LinearSearch {
	public static int linearSearch(int array[], int key) {
		int n = array.length;

		//Conditions for checking the key element
		for (int i = 0; i < n; i++) {
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String args[]) {
		int array[] = { 2, 6, 0, 8, 7,5 };
		int key = 9;

		int result = linearSearch(array, key);

		if (result == -1)
			System.out.print("Item not found");
		else
			System.out.print("Item found at index: " + result);
	}
}