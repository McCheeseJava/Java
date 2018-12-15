package binarysearch;

public class BinarySearch {

	public static int leftIndex;
	public static int rightIndex;

	public static int  binarySearch(int arr[], int x) 
    { 
		rightIndex = arr.length - 1; 
        while (leftIndex <= rightIndex) 
        { 
            int m = leftIndex + (rightIndex - leftIndex)/2; 
            if (arr[m] == x) 
                return m; 
  
            if (arr[m] < x) 
            	leftIndex = m + 1; 
  
            else
            	rightIndex = m - 1; 
        } 
        return -1; 
    } 

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 10, 40 };
		int x = 3;

		int result = BinarySearch.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}