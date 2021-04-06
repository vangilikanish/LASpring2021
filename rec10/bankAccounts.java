package rec10;

/*
Problem:
You are in charge of designing software for a bank, to be used for managing customers' accounts.
You first must create a class that represents an individual bank account. 
What data should your class store? 
What operations should you class offer? Think about what people do with bank accounts.
Now, implement the class in Java with the behavior you outlined above. 
Define fields for each of the pieces of data you decided to store.
Define and implement methods for each of the operations you decided to have your class offer.
Think of sequences of operations that would be good to try to test your methods. Justify your choices. 
Can you think of a sequence of operations that may cause problems with a bank account? In essence, how can we break a bank account?
In another file, create a simple test drive class that creates an instance of your bank account class,
executes the sequences you came up with in part 3, and display the results.
*/

public class bankAccounts { 
    
private double balance;
    bankAccounts()
    {
        balance = 0;
    }
    public static void setBalance(double balance)
    {
        this.balance = balance;
    }
    public static void depositMoney(double deposit)
    {
        balance += deposit;
    }
    public static void withdrawlMoney(double withdrawl)
    {
        if (balance <= 0)
        {
            System.out.println("No money to withdraw");
        }
        else
            balance -= withdrawl;
    }
    public double getBalance()
    {
        return balance;



} 
