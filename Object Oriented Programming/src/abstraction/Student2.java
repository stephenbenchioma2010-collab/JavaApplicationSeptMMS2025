
package abstraction;

public class Student2 extends Person2{

    public Student2(String name, int age) {
        super(name, age);
    }
    @Override
    void performDuty(){
        System.out.println("I perform my duty as a student");
    }
    @Override
    void displayDetails(){
        System.out.println("Student name : " + name);
        
        System.out.println("Student age : " + age);
    }
}
