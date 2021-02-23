public class rec5 {
    public static void main(String[] args){
        /*
        Breakout Room 1
        Problem: Array Average
        Write a program which computes the average of an array of integers.
        Output Example: 
        $ javac ArrayAverage.java
        $ java ArrayAverage
        3.667
        //or sth similar
        //If//If//If//If
        */

        //CODE:
        /*
        int[] arr = {1,7,3,6,3,2};
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum/arr.length);
        */

        /*

        Breakout Room 2
        Problem: Matrix 1’s and 0’s
        Write a program which takes a 2D array(this 2D array should be randomly filled with 1s and 0s), and prints:
        How many 1's are in the 2D 
        array.
        How many 0's are in the 2D
        array.
        Sample 2D array:
        {1,0,1,0},
        {1,1,0,1},
        {1,0,0,1},
        {0,0,1,0}
        Output Example:
        $ javac OneZeroArray.java
        $ java OneZeroArray
        There were 8 ones and 8 zeroes.
        */

        //CODE:
        //public static void main ( String[] args ) {
        /*
        int[][] arr = {{1,0,1,0}, {1,1,0,1}, {1,0,0,1}, {0,0,1,0}};
        int onesCount = 0;
        int zerosCount = 0;
        for (int row = 0; row <arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == 1){
                    onesCount = onesCount + 1;
                }else if ( arr[row][col] == 0){
                    zerosCount = zerosCount + 1;
                }
            }
        }
        System.out.println("There were " + onesCount + " ones and " + zerosCount + " zeroes.");
        */
        
        
        /*
        Breakout Room 3
        Problem: Nth Column of Matrix
        Write a program which takes a 2D integer array, arr, and an integer, n, and creates an array containing the nth column of arr.
        You may assume that the matrix has the same number of rows in each column, and that n is a valid column index.
        Sample 2D array:
        {1,0,1,0},
        {1,1,0,1},
        {1,0,0,1}
        Output Example:
        $ javac NthColumn.java
        $ java NthColumn 0
        1
        1
        1
        $ java NthColumn 1
        0
        1
        0
        */

        //CODE: 
        /*
        int n = Integer.parseInt(args[0]);
        int[][] arr = { {1,0,1,0}, {1,1,0,1}, {1,0,0,1} };
        int[] col = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            col[i] = arr[i][n]; 
        }
        for(int j = 0; j < col.length; j++){
            System.out.println(col[j] + ", ");
        }
        */

        /*
        Breakout Room 4
        Problem: Array Concatenation
        Write a program which takes two integer arrays, a and b, and creates an array which is a concatenated with b.
        Sample arrays:
        a = {1, 2, 3}
        b = {4, 5, 6}
        Output Example:
        $ javac ArrayConcatenation.java
        $ java ArrayConcatenation
        1, 2, 3, 4, 5, 6,
        */

        //CODE:
        /*
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {4, 5, 6};
        int[] c = new int[] {};
        for (int i = 0; i < a.length; i++) {             
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {             
            c[i] = b[i];
        }
    


        System.out.println(c);
        */

        /*
        int[] a = {2,5,7,3};
        int[] b = {8,7,1,7};
        int finalSize = a.length + b.length;
        int[] result = new int[finalSize];
        int currentIndex = 0;
        for(int i = 0; i < a.length; i ++){
            result[currentIndex] = a[i];
            currentIndex ++;
        }
        for(int i = 0; i < b.length; i ++){
            result[currentIndex] = b[i];
            currentIndex ++;
        }
        // prints the resulting array
        for(int i = 0; i < finalSize; i ++){
        System.out.print(result[i] + ",");
        }
        System.out.println();
        */


        // In case we need to print out the contents of c.
        // for (int i = 0; i < c.length; i++) {
        //     System.out.println(c[0]);
        // }
        
    }
}
