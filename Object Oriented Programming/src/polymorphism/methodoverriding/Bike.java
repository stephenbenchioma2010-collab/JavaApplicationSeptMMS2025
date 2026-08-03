
package polymorphism.methodoverriding;

public class Bike extends Vehicle{
   @Override
    void move() {
        System.out.println("A moving bike"); 
    }
}
