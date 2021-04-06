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

    private String accountNumber;
    private String routingNumber;
    public String customerName;
    private String customerAddress;
    private double accountBalance;
    
    bankAccounts(String account, String routing, String name, String address, double balance) {
        accountNumber = account;
        //..etc.
    }

    // We can also add setting functions for both accountNumber and routingNumber
    // to set a random seed, but I think that might be overkill. I think we're done?
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
        } else {
            System.out.println("Please enter a valid withdrawal amount.");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void updateCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void updateCustomerAddress(String address) {
        this.customerAddress = address;
    }
}