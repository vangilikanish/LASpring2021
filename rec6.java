public class rec6 {
    public static void main(String[] args){
         /*
        Problem: Guessing Game
        Promt:
        You are to write a program which implements a Guessing Game. 
        Generate a random int between 1 to 1,000, and prompt the user to try to guess what the number is. 
        As the user enters numbers, the program should tell whether the guess is too high or too low. 
        Once the user guesses correctly, have the program output "You win!"
        All input and output must be done using StdIn and StdOut libraries.
        */
        StdOut.println("Enter a number: ");

        //read number from user using StdIn
        int n = StdIn.readInt();
        
        //print the number back to the user
        StdOut.println("you entered: " + n); 
    }
}
