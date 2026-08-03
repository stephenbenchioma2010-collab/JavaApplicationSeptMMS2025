public class EnhancedForLoop2{
	public static void main(String[] args){
		int[] marks = {90,76,67,31,15,73,84,95,65,73};
		
		System.out.println("Student Marks are");
		for(int mark : marks){
			System.out.printf("%d%n",mark);
		}
	}
}