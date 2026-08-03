import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue{
	public static void main(String[] args){
		Queue<String> names = new LinkedList<>();
		
		names.add("Henry");
		names.add("Young");
		names.add("John");
		
		names.offer("Peter");
		
		System.out.println(names);
		System.out.println(names.poll());
		System.out.println(names);
		System.out.println(names.peek());
		System.out.println(names);
	}
}