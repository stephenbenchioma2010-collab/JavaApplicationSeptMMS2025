public class TestSavings {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("=== 4% Annual Interest ===");
        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.printf("Saver 1 after 12 months: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 after 12 months: $%.2f%n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\n=== 5% Annual Interest (Next Month) ===");
        System.out.printf("Saver 1: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2: $%.2f%n", saver2.getSavingsBalance());
    }
}
