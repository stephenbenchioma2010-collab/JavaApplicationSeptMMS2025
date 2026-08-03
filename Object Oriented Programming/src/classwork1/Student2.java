
package classwork1;
import java.util.ArrayList;

public class Student2 {
    String id, name;
    ArrayList<Course> courses = new ArrayList<>();

    public Student2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent2(this);
    }   
}
