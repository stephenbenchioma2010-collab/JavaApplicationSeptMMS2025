import java.util.Scanner;

public class UserInput{
	public static void main(String[] agrs){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your gender: ");
		String gender = input.next();
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter the number of student in your class: ");
		short numberOfstudent = input.nextShort();
		
		System.out.printf("Hello %s, you are welcome to niit%n",name);
		System.out.printf("You are a %s and you are %d years old%n",gender,age);
		System.out.printf("There are %d students in your class%n",numberOfstudent);
		System.out.printf("The total number of students in your school is %d%n",total);
		System.out.printf("Your grade is %c%n",grade);
		System.out.printf("Do you love Java?
		");
	}
}