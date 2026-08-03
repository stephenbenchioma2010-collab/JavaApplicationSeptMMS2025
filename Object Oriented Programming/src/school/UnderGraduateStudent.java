
package school;

import java.time.LocalDate;

public class UnderGraduateStudent extends Student{
    private int level;

    public UnderGraduateStudent(int studentID, String firstName, String lastName, char gender, LocalDate dOB, String phonenumber,int level) {
        super(studentID, firstName, lastName, gender, dOB, phonenumber);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    @Override
    public void displayStudetInfo() {
        super.displayStudetInfo(); 
        System.out.println("Level: " + level);
    }
    
}
