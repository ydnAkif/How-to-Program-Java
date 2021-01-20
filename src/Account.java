// Fig. 3.1: Account.java
// Account class that contains a name instance variable
// and methods to set and get its value.

public class Account {

    private String name;
    private double balance;

    // constructor initialize name with parameter name
    public Account(String name, double balance) { // constructor name is class name
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;

    }

    // method to set the name in object
    public void setName(String name) {
        this.name = name; // store the name
    }

    public double getBalance() {
        return balance;
    }

    // method to retrieve the name from object
    public String getName() {
        return name; // return value of name to caller
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance += depositAmount;
    }

} // end class Account