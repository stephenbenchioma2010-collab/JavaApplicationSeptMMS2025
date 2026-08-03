import java.util.LinkedHashSet;
import java.util.Set;

public class UsingSet{
	public static void main(String[] args){
		Set<Integer> studentID = new LinkedHashSet<>();
		
		studentID.add(101);
		studentID.add(102);
		studentID.add(103);
		studentID.add(104);
		studentID.add(105);
		studentID.add(105);
		
		System.out.println(studentID);
		
		studentID.remove(104);
		System.out.println(studentID);
		
		System.out.printf("The ID at index 1 is %b%n",studentID.contains(105));
		
	}
}