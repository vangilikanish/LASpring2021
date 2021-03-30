public class rec8 {
    public static void fill( int[] arr, int n){
        if(n==0){
            arr[0] = 0;
        }
        if(n==1 || n==2){
            arr[1]=1;
            arr[2]=1;
        }
        else{
           arr[n]= fill(n-1)+fill(n-2)+fill(n-3);
        }
    } 
    
    public static int factorial (int n){
        if(n == 0)
            return 1;
        return n*factorial(n-1);
    }

    public static int fib(int n)
        {
            if(n <= 1)
                return n;
            else
                return fib(n-1) + fib(n-2);
        }

    public static void main(String[] args){
        /*
        Problem 1:
        Write a recursive method for finding the factorial of a given number: 
        public int factorial(int n)
        You may assume you won't be given a negative number, nor a number larger than 13, and that factorial(0) is 1.
        What is the base case? n = 0
        What is the recursive step? n!(n-1)
        */        

        /* Problem 2:
        Fibonacci's sequence is a sequence in which the current term is obtained by adding the previous two terms. The first two terms of the sequence are 1. Here are the first 10:
        Write a recursive method, fib, which takes an integer, n, as a parameter, and computes the nth term of the sequence.
        */
        

        /*
        Problem 3:
        Write the method fill that fills up its parameter integer array with tribonacci using recursion. The method header is given below:
        public static void fill( int[] arr, int index){}
        *Tribonacci is Fibonacci but adding previous 3 nums rather than 2;
        Ex: [ 0, 1, 1, 2, 4, 7, 13, 24, 44, 81]
        */

        int size = 10;
        int[] arr = new int[size];
        fill(arr, size-1);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        
        
    }
}
