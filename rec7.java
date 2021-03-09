public class rec7 {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
    }      

    /*
    public static double avg(double a, double b){

    }

    public static boolean adult(String n, int age){

    }

    public static String nameMaker(String first, String last){

    }
    */

    /*
    public static boolean isPower(int n){
        if(n==0) return false;
        while(n != 1){
            if(n % 3 != 0) return false; 
            n = n/3;
        }
        return true;
    }
    */

    /*
    Problem: Multiplication Table
    Question: Write a method, printTable, which takes an integer as an argument, and prints a multiplication table of that size. 
    */
    //CODE:
    public static int printTable(int a){
        int[][] table = new int[a][a];
        
            for (int i = 0; i < a ; i++){
                for (int j = 0; j < a; j++){
                    table[i][j]= (i+1)*(j+1);
                }
            }
        return table;
    }
    
    /*
    Problem: Multiplication Table
    Question: The Greatest Common Factor of two numbers is the largest factor that both numbers share.
    A number's factors are all of the numbers that it is evenly divisible by.
    In the above example, 24 and 18 are both divisible by 1, 2, 3, and 6. Since 6 is the largest, it is the GCF.
    Write a method called gcf in Methods.java which takes in 2 integers as parameters and returns their Greatest Common Factor.
    Now in a separate program called SimplifyFraction.java, take 2 numbers as input from the user (numerator and denominator) via the StdIn,
    and use the method you just wrote to simply the fraction and output it.     
    Ex: numerator = 9, denominator = 12; output: “3/4”
    */
    //CODE:
    public static int gcf(int a, int b){
    int f = 0;
    for(int i = 1; i <= a; i++){
        if ( a % i == 0 && b % i ==0)
            {
            return i; 
            }
        }    
    }

    /*
    Problem: Prime
    Question: A number is considered prime if the only numbers it is divisible by are 1 and itself. 
    Write a method, isPrime, which takes an integer as a parameter, which will return true if the given number is prime. 
    */
    //CODE:
    public static boolean isPrime(int n)
    {
        int x = n - 1; 
        boolean y = true;
        while(x != 1)
        {
            if(n % x == 0){
                y = false; 
            }
           x--;  
        }
        return y; 
    }
}
