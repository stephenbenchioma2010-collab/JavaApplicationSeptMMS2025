
package abstraction;

public abstract class BankAccount {
    int AccountNumber;
    String AccountHolder;
    double balance;

    public BankAccount(int AccountNumber, String AccountHolder, double balance) {
        this.AccountNumber = AccountNumber;
        this.AccountHolder = AccountHolder;
        this.balance = balance;
    }
    
    void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } 
        else {
            System.out.println("Deposit amount must be positive!");
        }
    }
    
    void displayBalance(){
        System.out.printf("Account: %d | Holder: %s | Balance: $%.2f%n",
                AccountNumber, AccountHolder, balance);
    }
    
    abstract void withdraw(double amount);
    
    abstract void calculateInterest();
}
