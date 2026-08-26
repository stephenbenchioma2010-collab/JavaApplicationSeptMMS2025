
package aggregation;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class SchoolManagementSystem {
    public static void main(String[] args) {   
        Student s1 = new Student(101,"Henry","John",'M');
        Student s2 = new Student(102,"Joy","Jack",'F');
        Student s3 = new Student(103,"Franklin","Williams",'M');
        Student s4 = new Student(104,"Toby","Emmanuel",'M');
        Student s5 = new Student(105,"Lucy","Andy",'F');
        
        s1.makePayment(300000, LocalDate.of(2026,8,10), "Transfer", "Paid for Data Analytics");
        
        s3.makePayment(500000, LocalDate.of(2026,8,8), "POS", "Paid for Java");
        
        s5.makePayment(350000, LocalDate.of(2026,8,5), "Transfer", "Paid for MMS");
        
        List<Student> student = new ArrayList<>();
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);
        
        Sschool school = new Sschool("Green Land International School",student);
        
        school.displaySchoolDetails();
    }
}
