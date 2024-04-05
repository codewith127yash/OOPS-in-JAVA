public class SelectionSort {  
    // in selection sort we put the smallest element in the array at the very beginning i.e first
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  // here index represents the smallest element in the array 
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  //here j = i+1 means the length is decreasing from beginning whereas in bubble sort decreases from end 
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            // one swap per one complete loop
            // here we have taken smallerNumber as a temporary variable 
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  // here the time complexity = O(n^2)
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
} 