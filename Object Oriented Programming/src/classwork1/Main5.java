package classwork1;

public class Main5 {
    public static void main(String[] args){
        Payment card = new CreditCard();
        Payment bank = new BankTransfer();
        Payment wallet = new MobileWallet();
        
        card.pay(15000);
        bank.pay(45000);
        wallet.pay(7500);
    }
}
