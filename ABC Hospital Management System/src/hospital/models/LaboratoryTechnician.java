
package hospital.models;

import java.time.LocalDate;

public class LaboratoryTechnician extends Staff{
    private String qualifiation;
    private String licenseNumber;
    
    public LaboratoryTechnician(){
        
    }

    public LaboratoryTechnician( String firstName,
            String lastName, char gender,
            LocalDate dOB, String phonenumber,
            String email, String street, 
            String city, String country,
            String staffID, LocalDate employeeDate,
            double salary, Department department,
            String qualifiation,
            String licenseNumber) {
        super(firstName, lastName, gender,
                dOB, phonenumber, email, 
                street, city, country, 
                staffID, employeeDate, 
                salary, department);
        this.qualifiation = qualifiation;
        this.licenseNumber = licenseNumber;
    }

    public String getQualifiation() {
        return qualifiation;
    }

    public void setQualifiation(String qualifiation) {
        this.qualifiation = qualifiation;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
}
