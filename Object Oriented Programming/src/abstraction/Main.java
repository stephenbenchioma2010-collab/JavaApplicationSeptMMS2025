
package abstraction;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1.5,90193852, "John Doe", 20000);
        BankAccount current = new CurrentAccount(319289428, "Jane Smith", 15000);
        
        System.out.println("=== Savings Account Operations ===");
        savings.displayBalance();
        savings.deposit(5000);
        savings.withdraw(3000);
        savings.calculateInterest();
        savings.displayBalance();
        
        System.out.println("\n=== Current Account Operations ===");
        current.displayBalance();
        current.deposit(5000);
        current.withdraw(12000); 
        current.calculateInterest();
        current.displayBalance();
    }
    
}
