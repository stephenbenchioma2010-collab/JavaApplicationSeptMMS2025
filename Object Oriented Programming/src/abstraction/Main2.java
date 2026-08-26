
package abstraction;

public class Main2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mary Jane",29);
        Student2 student = new Student2("Joe Hart",17);
        
        System.out.println("=== Teacher Details ===");
        teacher.displayDetails();
        teacher.performDuty();
        
        System.out.println("\n=== Student Details ===");
        student.displayDetails();
        student.performDuty();
    }
}
