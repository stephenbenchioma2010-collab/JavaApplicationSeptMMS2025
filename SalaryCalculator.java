import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int employee = 1; employee <= 3; employee++) {
            System.out.printf("%n--- Employee %d ---%n", employee);

            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();

            System.out.print("Enter hourly rate: $");
            double rate = input.nextDouble();

            double grossPay;

            if (hours <= 40) {
                grossPay = hours * rate;
            } else {
                grossPay = (40 * rate) + ((hours - 40) * rate * 1.5);
            }

            System.out.printf("Gross Pay: $%.2f%n", grossPay);
        }

        input.close();
    }
}