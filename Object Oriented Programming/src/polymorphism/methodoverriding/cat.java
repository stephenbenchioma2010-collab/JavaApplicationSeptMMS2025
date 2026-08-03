
package polymorphism.methodoverriding;

public class cat extends animal{
    @Override
    void sound() {
        System.out.println("All cats purr");
    }
}
