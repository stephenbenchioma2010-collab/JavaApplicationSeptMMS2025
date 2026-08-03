public class PassSingleArrayToMethodClasswork{
	public static void main(String[] args){
		
		int[] arr = {7,8,4,3,2,9,0,1,6,8};
		System.out.println("Your even numbers are: ");
		evenNumbers(arr);
	}
	public static void evenNumbers(int[] even){
		for(int i = 0;i < even.length;i++){
			if(even[i] % 2 != 0){
				continue;
			}
			System.out.printf("%d%n",even[i]);
		}
	}
}