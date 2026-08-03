import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int itemNumber;
        double grossSales = 0.0;
        double baseWeeklySalary = 200.0;
        double commissionRate = 0.09;

        System.out.println("=== Sales Commission Calculator ===");
        System.out.println("Item prices:");
        System.out.println("  Item 1 = $239.99");
        System.out.println("  Item 2 = $129.75");
        System.out.println("  Item 3 = $99.95");
        System.out.println("  Item 4 = $350.89");
        System.out.println("Enter 0 to quit.\n");

        System.out.print("Enter item number sold (0 to quit): ");
        itemNumber = input.nextInt();

        while (itemNumber != 0) {

            // Determine item value
            switch (itemNumber) {
                case 1:
                    grossSales += 239.99;
                    System.out.println("Item 1 added: $239.99");
                    break;
                case 2:
                    grossSales += 129.75;
                    System.out.println("Item 2 added: $129.75");
                    break;
                case 3:
                    grossSales += 99.95;
                    System.out.println("Item 3 added: $99.95");
                    break;
                case 4:
                    grossSales += 350.89;
                    System.out.println("Item 4 added: $350.89");
                    break;
                default:
                    System.out.println("Invalid item. Please enter 1-4 or 0 to quit.");
                    break;
            }

            System.out.printf("Gross sales so far: $%.2f%n%n", grossSales);

            System.out.print("Enter item number sold (0 to quit): ");
            itemNumber = input.nextInt();
        }

        // Calculate earnings
        double commission = commissionRate * grossSales;
        double totalEarnings = baseWeeklySalary + commission;

        // Display final results
        System.out.println("\n=== Earnings Summary ===");
        System.out.printf("Total Gross Sales:  $%.2f%n", grossSales);
        System.out.printf("Base Weekly Salary: $%.2f%n", baseWeeklySalary);
        System.out.printf("Commission (9%%):    $%.2f%n", commission);
        System.out.printf("Total Earnings:     $%.2f%n", totalEarnings);

        input.close();
    }
}