
package hospital.models;
import java.time.LocalDate;

public abstract class Staff extends Person{
    private String staffID;
    private LocalDate employeeDate;
    private double salary;
    private Department department;
    
    public Staff(){
        
    }

    public Staff(String firstName, 
            String lastName, char gender, 
            LocalDate dOB, String phonenumber, 
            String email, String street, 
            String city, String country,String staffID, 
            LocalDate employeeDate, 
            double salary, Department department) {
        
        super(firstName, lastName, gender, dOB, phonenumber, email, street, city, country);
        this.staffID = staffID;
        this.employeeDate = employeeDate;
        this.salary = salary;
        this.department = department;
    }

    public String getStaffID() {
        return staffID;
    }
    
    public LocalDate getEmployeeDate() {
        return employeeDate;
    }

    public void setEmployeeDate(LocalDate employeeDate) {
        this.employeeDate = employeeDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
     public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
