package classwork1;

public class MobileWallet implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid $" + amount + " via Mobile Wallet");
    }

}

