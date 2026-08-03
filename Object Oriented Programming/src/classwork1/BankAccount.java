
package classwork1;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("Amount must be positive");
        }
    }
    
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance = balance - amount;
        }
    }
    
    public void displayDetails(){
        System.out.println("Account No.: " + accountNumber);
        System.out.println("account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}
