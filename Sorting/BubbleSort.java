class BubbleSort {
// In Bubble sort the largest element is pushed at the last
    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        //time complexity = O(n^2)
        for (i = 0; i < n - 1; i++) { // count n-1 iterations
            swapped = false;
            for (j = 0; j < n - i - 1; j++) { // loop for the unsorted array and eliminating the elements which are already sorted by using minus i
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1] to move small before larger elements
                    temp = arr[j]; // index is defined by j where as i only acts as a counter
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    // Function to print an array
    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}

