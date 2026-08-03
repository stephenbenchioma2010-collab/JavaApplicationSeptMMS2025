
package polymorphism.methodoverriding;

public class dog extends animal{
    @Override
    void sound(){
        System.out.println("All dogs growl");
    }
}
