
package polymorphism.methodoverriding;

public class circle extends shape{
   @Override
    void draw() {
        System.out.println("A circle has been drawn"); 
    }
}