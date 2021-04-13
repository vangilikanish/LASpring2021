package rec11;

public class rec11 {
    public static void main(String[] args){
        /*
        Group 1: Write a program that, given an array of Strings, does two passes of printing all of the strings 
        (IE: if there are six strings, it will print all six strings once, and then print them all again).
        Ex: String[ ] arr = {“CS”, “111”, “Recitation”}
        
        You would print this:
        CS
        111
        Recitation
        CS
        111
        Recitation

        What is the Big-O running time of your algorithm?
        Answer: 
        Code:
        */

        System.out.println("CS");
        System.out.println("111");
        System.out.println("Recitation");
        System.out.println("CS");
        System.out.println("111");
        System.out.println("Recitation");
 
        /*
        Group 2:

        Complete the following method which would return the index of x in a given array using sequential search; if number is not found, return -1:

        Trace the method above for finding the number 1 in [15, 2, 8, 1, 17, 5]:
        


        How many total comparisons were made?: 
        What is the best case, worst case, and big O?:
        */

        /*
        Group 3: 
        What is the algorithm for binary search?:
        Trace the method above for finding the number 2 in [1, 2, 5, 8, 15, 17]:


        What is the best case, worst case, and big O?:
        */

    }

    public static int sequentialSearch(int[] arr, int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
