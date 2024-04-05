// Java program for implementation of Insertion Sort
public class InsertionSort {
	//here we divide the array in two parts the first is the sorted part and the other is the unsorted part
	/*Function to sort array using insertion sort*/
	// and from unsorted part we try to move the element in the sorted part of the array at its suitable location
	// by doing this the unsorted part becomes smaller and the sorted becomes larger and larger and at the end the array becomes sorted 
	void sort(int arr[])
	{
		 /* As long as the element we're sorting (current element) is smaller, we keep shifting the elements we compare it to (pivot elements) one position back to make space for the current element in its correct sorted position.*/
		int n = arr.length;
		for (int i = 1; i < n; ++i) { // this loop represents sorted array
			int key = arr[i]; // here key represents the current element
			int j = i - 1; //sorted part last index

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			// We are using j to keep the track of the sorted part of the array
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j]; // pushing the elements at the beginning and making space for current element
				j = j - 1;
			}
			//placement of element in the array
			arr[j + 1] = key;
		}
	}

	/* A utility function to print array of size n*/
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6 };

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
	}
}

