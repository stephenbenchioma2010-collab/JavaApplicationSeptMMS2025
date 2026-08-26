
package abstraction;

public abstract class Person2 {
    String name ;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayDetails(){
        System.out.println("name : " + name);
        
        System.out.println("age : " + age);
    }
    
    abstract void performDuty();
}
