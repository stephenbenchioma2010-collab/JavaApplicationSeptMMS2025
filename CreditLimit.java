import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;

        System.out.println("=== Department Store Credit Limit Checker ===");
        System.out.println("Enter -1 for account number to quit.\n");

        System.out.print("Enter account number (-1 to quit): ");
        accountNumber = input.nextInt();

        while (accountNumber != -1) {

            System.out.print("Enter beginning balance: ");
            beginningBalance = input.nextInt();

            System.out.print("Enter total charges this month: ");
            charges = input.nextInt();

            System.out.print("Enter total credits this month: ");
            credits = input.nextInt();

            System.out.print("Enter credit limit: ");
            creditLimit = input.nextInt();

            // Calculate new balance
            newBalance = beginningBalance + charges - credits;

            // Display results
            System.out.println("\n--- Account Summary ---");
            System.out.printf("Account Number:    %d%n", accountNumber);
            System.out.printf("Beginning Balance: $%d%n", beginningBalance);
            System.out.printf("Charges:           $%d%n", charges);
            System.out.printf("Credits:           $%d%n", credits);
            System.out.printf("New Balance:       $%d%n", newBalance);
            System.out.printf("Credit Limit:      $%d%n", creditLimit);

            // Check if credit limit exceeded
            if (newBalance > creditLimit) {
                System.out.println("*** Credit limit exceeded ***");
            } else {
                System.out.printf("Available Credit:  $%d%n",
                    creditLimit - newBalance);
            }

            System.out.println();

            // Get next account number
            System.out.print("Enter account number (-1 to quit): ");
            accountNumber = input.nextInt();
        }

        System.out.println("\nProgram ended. Goodbye!");
        input.close();
    }
}