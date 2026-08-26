
package runtime;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchedExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.printf("Your age is %d years old", age);
        }
        catch(InputMismatchException e){
            System.out.println("Enter a num");
        }
    }
}
