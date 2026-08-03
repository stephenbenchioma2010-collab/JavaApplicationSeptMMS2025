import java.util.HashSet;
import java.util.Set;

public class UsingSet2{
	public static void main(String[] args){
		Set<String> emails = new HashSet<>();
		
		emails.add("you@gmail.com");
		emails.add("littleguy123@yahoo.com");
		emails.add("simonsays@gmail.com");
		emails.add("pizzaguy@gmail.com");
		emails.add("yahoo@yahoo.com");
		emails.add("jaywalker253@bing.com");
		emails.add("salmon@gmail.com");
		emails.add("trashtalker@gmail.com");
		emails.add("satire@gmail.com");
		emails.add("haroe@gmail.com");
		
		for(String email : emails){
			System.out.println(email);
		}
	}
}