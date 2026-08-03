
package classwork1;

public class Teacher extends Person{
    String department;
    double salary;

    public Teacher(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }
    public void showInfo(){
        System.out.println("Teacher: " + name);
        System.out.println("Age: " + age);
        System.out.println("Dept: " + department);
        System.out.println("Salary: " + salary);
    }
}
