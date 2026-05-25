import java.util.Scanner;

public class Classwork{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		int num1 =  input.nextInt();
		
		System.out.print("Enter your second number: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter your third number: ");
		int num3 = input.nextInt();
		
		System.out.print("Enter your fourth number: ");
		int num4 = input.nextInt();
		
		System.out.print("Enter your fifth number: ");
		int num5  = input.nextInt();
		
		int sumOperator = num1 + num2 + num3 + num4 + num5;

		double avgOperator = (num1 + num2 + num3 + num4 + num5)/5;
		
		int productOperator = num1 * num2 * num3 * num4 * num5;

		System.out.printf("The sum of the 5 numbers is: %d%n",sumOperator);
		System.out.printf("The average of the 5 numbers is: %f%n",avgOperator);
		System.out.printf("The product of the 5 numbers is: %d%n",productOperator);
		
		System.out.print("Enter your number: ");
		int  number = input.nextInt();
		
		boolean evenOrOdd = (number % 2 == 0);
		System.out.printf("Is the number even: %b",evenOrOdd);
		
		
	}
}