
package abstraction;

public class Teacher extends Person2{

    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    void performDuty(){
        System.out.println("I perform my duty as a teacher");
    }
    @Override
    void displayDetails(){
        System.out.println("Teacher name : " + name);
        
        System.out.println("Teacher age : " + age);
    }
    
}
