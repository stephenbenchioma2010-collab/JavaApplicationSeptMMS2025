public class Classwork2{
	public static void main(String[] args){
		System.out.printf("Your odd numbers are %d%n",addition(5,6,8,9,3,2,1));
		System.out.printf("Your odd numbers are %d%n",addition(8,6,4,7,5,6));
		System.out.printf("Your odd numbers are %d%n",addition(5,6,8,9,4));
		System.out.printf("Your odd numbers are %d%n",addition(5,6,8,6));
		System.out.printf("Your odd numbers are %d%n",addition(5,6,8));
		System.out.printf("Your odd numbers are %d%n",addition(5,6));
		System.out.printf("Your odd numbers are %d%n",addition(5));
		System.out.printf("Your odd numbers are %d%n",addition());
	}
	public static int addition(int... numbers){
		int count = 0;
		for(int number : numbers){
			if(number[0] % 2 != 0){
				System.out.printf("%d%n",number);
			}
		return number;
		}
		return sum;
	}
}