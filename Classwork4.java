public class Classwork4{
	public static void main(String[] args){
		System.out.printf("Your odd numbers are %d%n",odd(5,6,8,9,3,2,1));
		System.out.printf("Your odd numbers are %d%n",odd(8,6,4,7,5,6));
		System.out.printf("Your odd numbers are %d%n",odd(5,6,8,9,4));
		System.out.printf("Your odd numbers are %d%n",odd(5,6,8,6));
		System.out.printf("Your odd numbers are %d%n",odd(5,6,8));
		System.out.printf("Your odd numbers are %d%n",odd(5,6));
		System.out.printf("Your odd numbers are %d%n",odd(5));
		System.out.printf("Your odd numbers are %d%n",odd());
	}
	public static int odd(int... numbers){
		int count = 0;
		for(int number : numbers){
			if(number % 2 != 0){
				count++;
			}
		}
		return count;
	}
}