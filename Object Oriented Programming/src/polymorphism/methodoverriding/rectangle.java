
package polymorphism.methodoverriding;

public class rectangle extends shape{
   @Override
    void draw() {
        System.out.println("A rectangle has been drawn"); 
    }
}

