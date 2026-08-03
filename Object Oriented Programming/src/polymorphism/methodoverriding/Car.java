
package polymorphism.methodoverriding;

public class Car extends Vehicle{
   @Override
    void move() {
        System.out.println("A moving car"); 
    }
}
