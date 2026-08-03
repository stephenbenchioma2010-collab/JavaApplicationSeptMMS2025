
package classwork1;
import java.util.ArrayList;

public class Course {
    String code, name;
    Teacher2 teacher;
    ArrayList<Student2> students = new ArrayList<>();

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void setTeacher2(Teacher2 t){
        this.teacher = t; 
    }
    public void addStudent2(Student2 s){
        students.add(s); 
    }

    public void showStudents() {
        System.out.println("\nStudents in " + name + ":");
        for(Student2 s : students) 
            System.out.println("- " + s.name);
    }
}
