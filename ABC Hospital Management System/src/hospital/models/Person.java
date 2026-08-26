
package hospital.models;
import java.time.LocalDate;

public abstract class Person {
    private int id;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dOB;
    private String phonenumber;
    private String email;
    private String street;
    private String city;
    private String country;
    
    public Person(){
        
    }
    
    public Person(String firstName, String lastName, char gender, 
            LocalDate dOB, String phonenumber, String email, String street,
            String city, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dOB = dOB;
        this.phonenumber = phonenumber;
        this.email = email;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getdOB() {
        return dOB;
    }

    public void setdOB(LocalDate dOB) {
        this.dOB = dOB;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
