import java.util.Scanner;

public class Classwork2{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your number: ");
		int  number = input.nextInt();
		
		boolean evenOrOdd = (number % 2 == 0);
		System.out.printf("Is the number even: %b",evenOrOdd);
		