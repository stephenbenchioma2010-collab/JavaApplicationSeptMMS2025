
package classwork1;

public class Student extends Person{
    String course;
    int level;

    public Student(String name, int age, String course, int level) {
        super(name, age);
        this.course = course;
        this.level = level;
    }
    public void showInfo(){
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Level: " + level);
    }
}
