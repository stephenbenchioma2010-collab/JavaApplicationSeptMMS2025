import java.util.Scanner;

public class AcceptNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int Sum;
		int Product;
		
		System.out.print("Enter your first number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter your second number: ");
		int num2 = scanner.nextInt();
		
		System.out.print("Enter your third number: ");
		int num3 = scanner.nextInt();
		
		Sum = num1 + num2 + num3;
		
		System.out.printf("Your sum is: %d%n",Sum);
		
		if(Sum % 2 == 0 && Sum % 10 == 0){
			System.out.print("Enter your first new number: ");
			int newNum1 = scanner.nextInt();
			
			System.out.print("Enter your second new number: ");
			int newNum2 = scanner.nextInt();
			
			System.out.print("Enter your third new number: ");
			int newNum3 = scanner.nextInt();
			
			Product = num1 * num2 * num3;
			
			System.out.printf("Your product is: %d%n",Product);
			
		
		if(Product < 200){
				System.out.print("Hurray");
			}
			else{
				System.out.print("On going");
			}
		}
		else{
			System.out.printf("I must solve the program on my own");
		}
	}
}