
package classwork1;

public class Main3 {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        
        System.out.println("2 + 3 = " + calc.calculate(2,3));
        System.out.println("2 + 3 + 4 = " + calc.calculate(2,3,4));
        System.out.println("2.3 + 3.2 = " + calc.calculate(2.3,3.2));
        System.out.println("2 * 3 = " + calc.calculate(2,3,"multiply"));
    }
}
