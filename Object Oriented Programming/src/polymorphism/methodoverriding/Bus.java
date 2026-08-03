
package polymorphism.methodoverriding;

public class Bus extends Vehicle{
   @Override
    void move() {
        System.out.println("A moving bus"); 
    }
}
