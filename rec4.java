public class rec4{
    public static void main(String[] args){
        /*
        Can You Vote?
        Problem: Write a program that reads in an age via an argument from the command line, and outputs whether or not you are allowed to vote at that age.
        Hints: When are you allowed to vote? What data type is an age when it comes to voting? Is there a difference between 17.9 years old, 17 years old, and 18 years old?
        */

        //CODE HERE:
        /*
        int age = Integer.parseInt(args[0]);
        if(age >= 18){
            System.out.println("You are allowed to vote");
        } else{
            System.out.print("You arent allowed to vote");
        }
        */
        
        /*
        Speeding Tickets
        Problem: Assume you are about to give a ticket to a person that you caught speeding.
        Get the speed as the input to your program via an argument from the command line, and output the correct fine:
            Speed is less than or equal to 60mph: $0 fine
            Speed is above 60 and less than or equal to 75: $100 fine
            Speed is above 75 and less than or equal to 90: $200 fine
            Speed is above 90: $500 fine
        */

        //CODE HERE:
        /*
        int speed = Integer.parseInt(args[0]);
        if(speed <= 60){
            System.out.println("$0 fine");
        } else if(speed <= 75){
            System.out.println("$100 fine");
        } else if(speed <= 90) {
            System.out.println("$200 fine");
        } else {
            System.out.println("$500 fine");
        }
        */

        /*
        Horizontal Pyramid
        Problem: Write a program that reads in a number, n, via an argument from the command line, and then creates a horizontal pyramid of height n
        Example: height = 5:
                            *
                            **
                            ***
                            ****
                            *****
                            ****
                            ***
                            **
                            *
        */

        //CODE HERE:
        

        /*
        Prime?
        Problem: Write a program that will determine if a number is prime or not. If the number is prime, it will return true. If not, it will return false.
        Hints: A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.
        */

        //CODE HERE:
        /*
        boolean answer = true;
        int num = Integer.parseInt( args[0] );
        for (int i = 2; i <= num /2; i++){
            if(num % i == 0){
                    System.out.println("not prime");
                    answer = false;
                    break;
                }
            }
            if(answer == true){
                System.out.println("is prime");
        }
        */

    }
}
