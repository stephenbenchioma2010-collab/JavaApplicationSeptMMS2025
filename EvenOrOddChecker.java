import java.util.Scanner;

public class EvenOrOddChecker{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		char option;
		do{
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			
			if(num % 2 == 0){
				System.out.printf("%d is an even number%n",num);
				System.out.println("");
				System.out.println("======================");
			}
			else{
				System.out.printf("%d is an odd number%n",num);
				System.out.println("");
				System.out.println("======================");
			}
			System.out.print("Do you want to run the program again(y/n): ");
			option = scanner.next().charAt(0);
		}while(option == 'y' || option == 'Y');
		System.out.println("");
		System.out.println("======================");
		System.out.println("Good bye................");
	}
}

