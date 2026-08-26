
package runtime;
import java.util.Scanner;

public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try{
        String name = null;
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        
        System.out.println("The length of name is " + name.length());
        }
        catch(NullPointerException e){
            System.out.println("Name has not been initialized");
        }
    }
}
