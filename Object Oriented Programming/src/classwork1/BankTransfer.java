package classwork1;

public class BankTransfer implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid $" + amount + " via Bank Transfer");
    }

}
