
package abstraction;

public class CurrentAccount extends BankAccount{
   
    
    public CurrentAccount(int AccountNumber, String AccountHolder, double balance) {
        super(AccountNumber, AccountHolder, balance);
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited to Current Account: $" + amount);
            
            if (balance >= 0) {
                System.out.println("Available balance:$" + balance);
            }
        } else {
            System.out.println("Deposit failed: Amount must be positive!");
        }
    }
    
    @Override
    void withdraw(double amount){
        if (amount <= 0) {
        System.out.println("Error: Amount must be positive!");
        return;
        }
        if (amount > balance) {
        System.out.println("Error: Insufficient balance!");
        return;
        }
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
        }
    
    @Override
    public void calculateInterest() {
         System.out.println("Current accounts do not earn interest");
    }
}
    