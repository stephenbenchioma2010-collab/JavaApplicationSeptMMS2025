import java.util.Arrays;

public class UsingArrayClass{
	public static void main(String[] args){
		int[] numbers = {5,8,2,3,9,4,1,6,7,10};
		int[] a = {7,9,6};
		int[] b = {7,9,6};
		
		
		int[] c = {7,9,9};
		int[] d = {7,9,6};
		
		int[] e = {7,9,9};
		int[] f = {7,9,9};
		
		Arrays.sort(numbers);
		System.out.println("The elements of the array are");
		
		for(int number : numbers){
			System.out.printf("%d%n",number);
		}
		System.out.println("Binary search");
		int index = Arrays.binarySearch(numbers,9);
		System.out.printf("The index number of 9 is %d%n",index);
		
		boolean isEqual = Arrays.equals(a,b);
		System.out.printf("The result is %b%n",isEqual);
		
		int isGreater = Arrays.compare(c,d);
		System.out.printf("The result is %d%n",isGreater);
		
		int isLesser = Arrays.compare(d,c);
		System.out.printf("The result is %d%n",isLesser);
		
		int isEqualTo = Arrays.compare(e,f);
		System.out.printf("The result is %d%n",isEqualTo);
	}
}