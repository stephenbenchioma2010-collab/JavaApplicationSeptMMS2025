
package classwork1;

public class Main10 {
    public static void main(String[] args) {
        Course cs101 = new Course("CS101", "Introduction to Java");
        Course cs201 = new Course("CS201", "Data Structures");

        Teacher2 t1 = new Teacher2("T01", "Mrs. Fatima");
        t1.assignCourse(cs101);
        t1.assignCourse(cs201);

        Student2 s1 = new Student2("S01", "Peter");
        Student2 s2 = new Student2("S02", "Amara");
        s1.enrollCourse(cs101);
        s2.enrollCourse(cs101);
        s2.enrollCourse(cs201);

        cs101.showStudents();
        System.out.println("\nCourses taught by " + t1.name + ":");
        for(Course c : t1.courses) System.out.println("- " + c.name);
    }
}
