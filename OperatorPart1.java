public class OperatorPart1{
	public static void main(String[] args){
		 //Assignment Operators(=)
		 int num = 200;
		 System.out.printf("The value of num is %d%n",num);
		 
		 //Arithmetic Operators(+,-,/,*,%)
		 int num1 = 80;
		 int num2 = 100;
		 
		 int addition = num1 + num2;
		 int subtraction = num1 - num2;
		 
		 System.out.println("");
		 System.out.println("=====================");
		 System.out.printf("");
		 
		 //Compound Assignment Operators(+=,-=,*=,/=,%=)
		 num1 += num2;
		 System.out.printf("The value of num1 has been updated to %d%n",num1);
		 
		 num1 -= num2;
		 System.out.printf("The value of num1 has been updated to %d%n",num1);
		 
		 num1 *= num2;
		 System.out.printf("The value of num1 has been updated to %d%n",num1);
		 
		 num1 /= num2;
		 System.out.printf("The value of num1 has been updated to %d%n",num1);
		 
		 num1 %= num2;
		 System.out.printf("The value of num1 has been updated to %d%n",num1);
		 
		 //Relational Operators
		 int number1 = 15;
		 int number2 = 30;
		 
		 boolean isGreater = number1 > number2;
		 boolean isLesserThan = number1 < number2;
		 boolean isGreaterOrEqualTo = number1 >= number2;
		 boolean isLessThanOrEqualTo = number1 <= number2;
		 boolean EqualTo = number1 == number2;
	}
}