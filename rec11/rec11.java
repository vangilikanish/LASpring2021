package rec11;

public class rec11 {
    public static void main(String[] args){
        /*
        Group 1: Write a program that, given an array of Strings, does two passes of printing all of the strings 
        (IE: if there are six strings, it will print all six strings once, and then print them all again).
        Ex: String[ ] arr = {“CS”, “111”, “Recitation”}
        
        String[ ] arr = {“CS”, “111”, “Recitation”};
        for(i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for(i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        You would print this:
        CS
        111
        Recitation
        CS
        111
        Recitation
        
        What is the Big-O running time of your algorithm?
        Answer: O(n)
        Code: ?
        */

        /*
        Group 2: What are the Big-O's of the following code snippets? Why?
        int[] array = ... // Somehow create an array
        for(int i = 0; i < array.length; i ++){
            for(int j = 0; j < array.length; j ++){
                System.out.println(array[i]);
            }
        }​
        Answer: O(n^2) because there are two nested for loops, each iterating through n elements.

        int[] array = ... // Create an array
        for(int i = 0; i < array.length; i ++){
            for(int j = 0; j < 10; j ++){
                System.out.println(array[i]);
            }
        }
        Answer: O(n) because only one loop iterates over n elements, the other loop iterates through 10 elements, which is a constant that get's dropped.

        Complete the following method which would return the index of x in a given array using sequential search; if number is not found, return -1:
        public static int sequentialSearch(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i;
                }
            }
            return -1;
        }

        Trace the method above for finding the number 1 in [15, 2, 8, 1, 17, 5]:


        How many total comparisons were made?: 4 comparisons
        What is the best case, worst case, and big O?: O(1) best case (target is the first element), O(n) worse case (target is last element), big-O is O(n).
        */

        /*
        Group 3: 
        What is the algorithm for binary search?:
        Trace the method above for finding the number 2 in [1, 2, 5, 8, 15, 17]:


        What is the best case, worst case, and big O?:
        */

    }
}
