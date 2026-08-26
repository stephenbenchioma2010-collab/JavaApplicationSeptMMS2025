
package abstraction;

public class SavingsAccount extends BankAccount{
    
    double InterestRate;

    public SavingsAccount(double InterestRate, int AccountNumber, String AccountHolder, double balance) {
        super(AccountNumber, AccountHolder, balance);
        this.InterestRate = InterestRate;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited to Savings: $" + amount);
        } 
        else {
            System.out.println("Deposit failed: Amount must be positive!");
        }
    }
    
    @Override
    void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } 
        else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    @Override
    public void calculateInterest() {
        double interest = balance * InterestRate;
        balance += interest;
        System.out.printf("Interest added: $%.2f%n", interest);
    }
}
