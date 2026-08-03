
package school;

import java.time.LocalDate;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dOB;
    private String phonenumber;

    public Student(int studentID, String firstName, String lastName, char gender, LocalDate dOB, String phonenumber) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dOB = dOB;
        this.phonenumber = phonenumber;
    }
    
    public int getStudentID() {
        return studentID;
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
    
    public void payFees(double amount){
        System.out.println("Amount paid: " + amount);
    }
    
    public void payFees(double amount, String fullName){
        System.out.println("Amount paid: " + amount);
        System.out.println("Student Full Name: " + fullName);
    }
    
    public void payFees(double amount, String fullName,String paymentMethod){
        System.out.println("Amount paid: " + amount);
        System.out.println("Student Full Name: " + fullName);
        System.out.println("Payment Method: " + paymentMethod);
    }
    
    public void displayStudetInfo(){
    System.out.println("StudetID: " + studentID);
    System.out.println("First Name: " + firstName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Gender: " + gender);
    System.out.println("Date Of Birth: " + dOB);
    System.out.println("Phone No.: " + phonenumber);
    }
}
