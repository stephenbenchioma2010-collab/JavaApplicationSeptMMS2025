import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Accept age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // clear the buffer

        // Accept address
        System.out.print("Enter your address: ");
        String address = input.nextLine();

        // Display formatted output
        System.out.println("\n===== PERSONAL INFORMATION =====");
        System.out.printf("Name    : %s%n", name);
        System.out.printf("Age     : %d%n", age);
        System.out.printf("Address : %s%n", address);
        System.out.println("================================");
    }
}