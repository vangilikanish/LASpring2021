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

        /*
        int n = (int)(Math.random()*1000) + 1;
        StdOut.println("Enter a number between 1 and 1000: ");
        int guess = 0;

        while(guess != n){
            guess = StdIn.readInt();
            if(guess == n){
                StdOut.println("You got it champ!");
            }else if(guess > n){
                StdOut.println("Too high");
            }else{
                StdOut.println("Too low");
            }
        }
        */

        /*
        Problem: Drawing an Equilateral Triangle
        Promt: A principal property of an equilateral triangle of sides a, b, and c (where a = b = c) defines the height from any side to be: 
        Write a program that uses StdDraw to draw an equilateral triangle with sides of length 1.
        */

        /*
        StdDraw.line(0,0,1,0);
        StdDraw.line(1,0,0.5,Math.sqrt(3)/2);
        StdDraw.line(0.5,Math.sqrt(3)/2,0,0);    
        */

        /*
        Problem: Drawing Shapes
        Prompt: Using StdDraw methods, write a program that draws the following on the 1x1 plane:
        non-filled square
        filled square with the words "white text" inside of it
        non-filled circle
        filled polygon with 4 vertices
        */

        StdDraw.square(.2,.8,.1);
        StdDraw.filledSquare(.8,.8,.2);
        StdDraw.circle(.8,.2,.2);
        double[] x = {.1,.2,.3,.2}; //x-coordinates of polygon
        double[] y = {.2,.3,.2,.1}; //y-coordinates of polygon
        StdDraw.filledPolygon(x,y);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(.8,.8,"white text");


        
        /*
        Problem: Nested circles:
        Promt: Write a program that reads an integer number n from the command line and draws n circles with alternative colored circles nested in each other. 
        */ 
        
        /*
        int n = StdIn.readInt();
        double radius = 0.5;
        double diff = radius/n;
        for (int i = 1; i <= n; i++)
        {
            if (i%2 == 0)
            {
                StdDraw.setPenColor(StdDraw.GRAY);
            }
            else{
                StdDraw.setPenColor(StdDraw.BLACK);
            }
            StdDraw.filledCircle(0.5, 0.5, radius);
            radius -= diff;
            }
        }
        */
        //StdDraw.filledCircle(x, y, radius);
        //StdDraw.setPenColor(StdDraw.BLACK);
        //StdDraw.setPenColor(StdDraw.GREY);
        
        //StdOut.println("Enter a number: ");
        //int n = StdIn.readInt();
        //StdOut.println("you entered: " + n);
    }
}