package rec12;

public class rec12{
    public static void main(String[] args){
        /*
        Group 1: 
        Q1: Complete the following method which would return the index of x in a given array using sequential search; if number is not found, return -1:
            public int sequentialSearch(int[] arr, int x)
            Trace the method above for finding the number 1 in [15, 2, 8, 1, 17, 5]
            What is the best case, worst case, and big O?

        public int sequentialSearch(int[] arr, int x)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] == x)
                    return i;

            }
            return -1
        }
            
        Best Case: O(1)
        Worst Case: 0(n)
        Big 0 : O(n)
            
        Q2: Trace a Binary Search of the following dataset, where we are attempting to find the number 8.
            {1,3,5,6,12,19,20,25,28,33}

           
        */

        /*
        Group 2:
        Q1: 1. What is the algorithm for Insertion Sort?
            2. Trace Insertion Sort on the following array:
                [15, 2, 8, 1, 17, 5]
            3. What is the best case, worse case, and big O?
        
        1.
        public static void insertionSort(int[] A){
            int itemsSorted;
            for (itemsSorted= 1; itemsSorted< A.length; itemsSorted++){
                int temp = A[itemsSorted];
                int loc = itemsSorted-1;
                while (loc >= 0 && A[loc] > temp){
                    A[loc + 1] = A[loc];
                    loc = loc -1;
                }
                A[loc + 1] = temp;
            }
        }
        
        2. [15, 2, 8, 1, 17, 5]
           [2, 15, 8, 1, 17, 5]
           [2, 8, 15, 1, 17, 5]
           [2, 8, 1, 15, 17, 5]
           [2, 1, 8, 15, 17, 5]
           [1, 2, 8, 15, 17, 5]
           [1, 2, 8, 15, 5, 17]
           [1, 2, 8, 5, 15, 17]
           [1, 2, 5, 8, 15, 17]
           [1, 2, 5, 8, 15, 17], makes another n passes to check if sorted.
           
        3. Best case is O(n); first pass checks n elements, which are already sorted. 
           Worst case is O(n^2), where the array is sorted in reverse order since every element has to be shifted n times.
           Big-O in this case will assume the worst case, which is O(n^2).

        Q2: As a good computer science student, made 9999999 sorted arrays for fun; And someone pranked you by cutting each array into two parts and flip the order of the two parts.
            Example: [1 2 3 4 5 6] -> [5 6 1 2 3 4] (where the cut happened is random)
            Your task is to make a method that return the index of where this cut happened in O(log2n) time, where  n is the array length;
         public static int binarySearch(int[] array, int n, int target){
             int left = 0, right = n - 1;
             while (left >= right){
                 int mid = (left + right) / 2;
                 if (target == array[mid]){
                     return mid; //position
                 }
                 if (target < array[mid]){
                     right = mid -1;
                 } else {
                     left = mid + 1;
                 }
             }
         }
        */

        /*
        Group 3:
        Q1: 1. What is the algorithm for selection sort?
                Use a loop to find the min index of the numbers, then swap each
                iteration of i with the min number. arr[i] <--> arr[min]. Run until the 
                end of array and can be iterated no further. 
                
                arr[] = 20, 45, 64, 23, 82
                int num = arr.length;
                for (int i = 0; i < num-1; i++)
                {
                    int minNum = i;
                    for (int j = i+1; j < num; j++)
                    {
                        if (arr[j] < arr[minNum])
                        {
                            minNum = j;
                        }
                    }
                    int dummy = arr[minNum];
                    arr[minNum] = arr[i];
                    arr[i] = dummy;
                }
            2. Trace selection sort over the following array:
                [15, 2, 8, 1, 17, 5]
                [1, 2, 8, 15, 17, 5]
                [1, 2, 5, 15, 17, 8]
                [1, 2, 5, 8, 17, 15]
                [1, 2, 5, 8, 15, 17]
                
            3. What is the best case, worst case, and big O?

        Q2: 1. How does the Merge Sort algorithm work?
            2. Use the code below to trace MergeSort on the following array: [L,D,Z,V,G,O,W,B]
                List the resulting array after each iteration of the mergesort algorithm. Indicate the number of character-to-character comparisons made for each call to merge 

        */
    }
}
