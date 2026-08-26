
package hospital.models;

import java.time.LocalDate;

public class Doctor extends Staff{
    private String specialization;
    private String licenseNumber;
    private Department department;
    
    public Doctor(){
        
    }

    public Doctor(String firstName, 
            String lastName, char gender, 
            LocalDate dOB, String phonenumber,
            String email, String street, 
            String city, String country,
            String staffID,
            LocalDate employeeDate,
            double salary,
            Department department,
            String specialization, 
            String licenseNumber
            ) {
        super(firstName, lastName, gender,
              dOB, phonenumber, email, 
              street, city, country,staffID,
              employeeDate, salary,  department);
        this.specialization = specialization;
        this.licenseNumber = licenseNumber;
    }

  

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

}
