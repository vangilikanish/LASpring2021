public class rec7 {
    public static void main(String[] args){
        int size = Integer.parseInt(args[0]);
        //int f = printTable(size);
        
    }   
    
    /*
    public static double avg(double a, double b){
        double gg = 2.0;
        return gg;
    }

    public static boolean age(int a, String b){
        return true;
    }

    public static String name(String a, String b){ }
    */

    /*
    public static boolean isPower3(int n){
        if(n==0) return false;
        while(n!=1){
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
    public static void printTable(int a){
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= a; j++){
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }
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
    

    /*
    Problem: Prime
    Question: A number is considered prime if the only numbers it is divisible by are 1 and itself. 
    Write a method, isPrime, which takes an integer as a parameter, which will return true if the given number is prime. 
    */
    //CODE:
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
