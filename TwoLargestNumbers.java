import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("=== Find the Two Largest Numbers ===");

        while (counter <= 10) {
            System.out.printf("Enter integer %d of 10: ", counter);
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.printf("%nThe largest number is:        %d%n", largest);
        System.out.printf("The second largest number is: %d%n", secondLargest);

        input.close();
    }
}