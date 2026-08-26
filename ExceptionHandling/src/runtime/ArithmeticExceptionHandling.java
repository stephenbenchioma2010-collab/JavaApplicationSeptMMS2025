
package runtime;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
        System.out.println("Dividing num1 by num2");
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        
        int division = num1/num2;
        
        System.out.printf("The result is %d%n",division);
        }
        
        catch(ArithmeticException e){
            System.out.println("num cannot e divided by zero");
        }
        finally{
            System.out.println("this art of code will not run");
        }
    }
}
