
package classwork1;

public class Main {
    public static void main(String[] args){
        BankAccount acc = new BankAccount();
        
        acc.setAccountNumber(312299929);
        acc.setAccountHolder("ACC-00123");
        acc.setBalance(5000);
        acc.deposit(20000);
        acc.withdraw(1000);
        acc.displayDetails();
    }
}
