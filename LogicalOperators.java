import java.util.Scanner;

public class LogicalOperators{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String name;

        System.out.print("Enter your name: ");

        if(name.length() < 5){
            System.out.print("Your name is less than the required amount");
            name = scan.nextLine();
        }
        else{
            System.out.printf("Your name is %s%n",name);
        }
    }
}