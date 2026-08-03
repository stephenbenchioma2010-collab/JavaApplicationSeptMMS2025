import java.util.Random;

public class PasswordGenerator{
	public static void main(String[] args){
		Random rand = new Random();
		
		String password = rand.nextLine;
		int num = rand.nextInt(10);
		char Character = rand.nextCharAt(0);
		
		System.out.printf("Your generated password is %s%d%d%d%s%c%s%s%d%s%d%s%c%d%s%n",password,num,Character);
	}
}