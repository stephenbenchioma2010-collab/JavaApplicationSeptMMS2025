
package school;

import java.time.LocalDate;

public class GraduateStudent extends Student{
    
    private String finalYearProject;
    
    public GraduateStudent(int studentID, String firstName, String lastName,
        char gender, LocalDate dOB, 
        String phonenumber,String finalYearProject) {
        super(studentID, firstName, lastName, gender, dOB, phonenumber);
        this.finalYearProject = finalYearProject;
    }

    public String getFinalYearProject() {
        return finalYearProject;
    }

    public void setFinalYearProject(String finalYearProject) {
        this.finalYearProject = finalYearProject;
    }
    
    @Override
    public void displayStudetInfo(){
        super.displayStudetInfo();
        System.out.println("Final Year Project: " + finalYearProject);
    }
}
