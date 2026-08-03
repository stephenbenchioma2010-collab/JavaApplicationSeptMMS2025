
package classwork1;
import java.util.ArrayList;

public class Teacher2 {
    String id, name;
    ArrayList<Course> courses = new ArrayList<>();

    public Teacher2(String id, String name) {
        this.id = id;
        this.name = name;
    }
    

    public void assignCourse(Course c) {
        courses.add(c);
        c.setTeacher2(this);
    }
}
