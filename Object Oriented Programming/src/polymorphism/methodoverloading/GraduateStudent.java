
package polymorphism.methodoverloading;

public class GraduateStudent extends Student{
    @Override
    void study(){
        System.out.println("Graduatte students are conducting research");
    }
}
