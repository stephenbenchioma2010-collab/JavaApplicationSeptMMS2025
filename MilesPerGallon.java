import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        int miles;
        int gallons;

        System.out.println("=== Miles Per Gallon Calculator ===");
        System.out.println("Enter -1 for miles to quit.\n");

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = input.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            gallons = input.nextInt();

            // Calculate MPG for this trip
            double tripMPG = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", tripMPG);

            // Accumulate totals
            totalMiles += miles;
            totalGallons += gallons;

            // Calculate combined MPG so far
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f%n%n", combinedMPG);

            // Get next input
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        // Final summary
        if (totalGallons > 0) {
            System.out.println("\n=== Final Summary ===");
            System.out.printf("Total miles driven: %d%n", totalMiles);
            System.out.printf("Total gallons used: %d%n", totalGallons);
            System.out.printf("Overall miles per gallon: %.2f%n",
                (double) totalMiles / totalGallons);
        } else {
            System.out.println("No trips were recorded.");
        }

        input.close();
    }
}