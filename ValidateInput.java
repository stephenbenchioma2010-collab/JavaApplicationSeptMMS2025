import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;

        System.out.println("Enter 1 or 2 only:");

        System.out.print("Enter your choice: ");
        value = input.nextInt();

        // Keep looping until valid input
        while (value != 1 && value != 2) {
            System.out.println("Invalid input. Please enter 1 or 2 only.");
            System.out.print("Enter your choice: ");
            value = input.nextInt();
        }

        System.out.printf("You entered: %d%n", value);

        input.close();
    }
}