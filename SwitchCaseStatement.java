import java.util.Scanner;

public class SwitchCaseStatement{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		String subject;
		int score;
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		
		System.out.print("Enter your subject: ");
		subject = input.nextLine();
		
		System.out.print("Enter your score: ");
		score = input.nextInt();
		System.out.println("");
		System.out.println("==================");
		
		if(score > 100){
			System.out.println("Score cannot be greater than 100");
			
		}
	}
}
