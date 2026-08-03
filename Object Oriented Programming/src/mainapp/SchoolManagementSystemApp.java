package mainapp;

import java.time.LocalDate;
import school.UnderGraduateStudent;
import school.GraduateStudent;
import school.Student;
import java.util.Scanner;

public class SchoolManagementSystemApp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1: For Graduate Student");
        System.out.println("Enter 2: For Under Graduate Student");
        System.out.println("Enter 3: To Pay School Fee");
        
        System.out.print("Enter yout choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
        
        switch(choice){
            case 1 -> {
                System.out.print("Enter your student ID: ");
                int studentID = scan.nextInt();
                scan.nextLine();
                
                System.out.print("Enter First Name: ");
                String firstName = scan.nextLine();
                
                System.out.print("Enter Last Name: ");
                String lastName = scan.nextLine();
                
                System.out.print("Enter Gender: ");
                char gender = scan.next().charAt(0);
                scan.nextLine();
                
                System.out.print("Enter Date Of Birth(YYYY-MM-DD): ");
                String dOB = scan.nextLine();
                
                System.out.print("Enter Phone Number: ");
                String phonenumber = scan.nextLine();
                
                System.out.print("Enter Final Year Project: ");
                String finalYearProject = scan.nextLine();
                
                GraduateStudent gstudent = new GraduateStudent(studentID,firstName,
                lastName,gender,LocalDate.parse(dOB),phonenumber,finalYearProject);
                
                gstudent.displayStudetInfo();
                System.out.println("=============================");
                System.out.println("");
                
            }
            case 2 -> {   
                System.out.print("Enter your student ID: ");
                int studentID = scan.nextInt();
                scan.nextLine();
                
                System.out.print("Enter First Name: ");
                String firstName = scan.nextLine();
                
                System.out.print("Enter Last Name: ");
                String lastName = scan.nextLine();
                
                System.out.print("Enter Gender: ");
                char gender = scan.next().charAt(0);
                scan.nextLine();
                
                System.out.print("Enter Date Of Birth(YYYY-MM-DD): ");
                String dOB = scan.nextLine();
                
                System.out.print("Enter Phone Number: ");
                String phonenumber = scan.nextLine();
                
                System.out.print("Enter level: ");
                int level = scan.nextInt();
                scan.nextLine();
               
                UnderGraduateStudent ugstudent = new UnderGraduateStudent(studentID,firstName,
                lastName,gender,LocalDate.parse(dOB),phonenumber,level);
                
                ugstudent.displayStudetInfo();
            }
            case 3 -> {
                System.out.println("Choose the following options");
                System.out.println("Enter 1: Amount only");
                System.out.println("Enter 2: Amount,Full Name only");
                System.out.println("Enter 2: Amount,Full Name,Payment Method only");
                
                System.out.println("Enter your option");
                int myOption = scan.nextInt();
                
                switch(myOption){
                    case 1 -> {
                        System.out.print("Enter your student ID: ");
                        int studentID = scan.nextInt();
                        scan.nextLine();
                
                        System.out.print("Enter First Name: ");
                        String firstName = scan.nextLine();
                
                        System.out.print("Enter Last Name: ");
                        String lastName = scan.nextLine();
                
                        System.out.print("Enter Gender: ");
                        char gender = scan.next().charAt(0);
                        scan.nextLine();
                
                        System.out.print("Enter Date Of Birth(YYYY-MM-DD): ");
                        String dOB = scan.nextLine();
                
                        System.out.print("Enter Phone Number: ");
                        String phonenumber = scan.nextLine();
                        
                        
                        Student student = new Student(studentID,firstName,
                        lastName,gender,LocalDate.parse(dOB),phonenumber);
                        
                        System.out.print("Enter Amount: ");
                        double amount = scan.nextDouble();
                        student.payFees(amount);
                    }
                    
                    case 2 -> {
                        System.out.print("Enter your student ID: ");
                        int studentID = scan.nextInt();
                        scan.nextLine();
                
                        System.out.print("Enter First Name: ");
                        String firstName = scan.nextLine();
                
                        System.out.print("Enter Last Name: ");
                        String lastName = scan.nextLine();
                
                        System.out.print("Enter Gender: ");
                        char gender = scan.next().charAt(0);
                        scan.nextLine();
                
                        System.out.print("Enter Date Of Birth(YYYY-MM-DD): ");
                        String dOB = scan.nextLine();
                
                        System.out.print("Enter Phone Number: ");
                        String phonenumber = scan.nextLine();
                        
                        
                        Student student = new Student(studentID,firstName,
                        lastName,gender,LocalDate.parse(dOB),phonenumber);
                        
                        System.out.print("Enter Amount: ");
                        double amount = scan.nextDouble();
                        
                        System.out.print("Enter full Name: ");
                        String fullName = scan.nextLine();
                        
                        student.payFees(amount,fullName);
                    }
                    
                    case 3 -> {
                        System.out.print("Enter your student ID: ");
                        int studentID = scan.nextInt();
                        scan.nextLine();
                
                        System.out.print("Enter First Name: ");
                        String firstName = scan.nextLine();
                
                        System.out.print("Enter Last Name: ");
                        String lastName = scan.nextLine();
                
                        System.out.print("Enter Gender: ");
                        char gender = scan.next().charAt(0);
                        scan.nextLine();
                
                        System.out.print("Enter Date Of Birth(YYYY-MM-DD): ");
                        String dOB = scan.nextLine();
                
                        System.out.print("Enter Phone Number: ");
                        String phonenumber = scan.nextLine();
                        
                        
                        Student student = new Student(studentID,firstName,
                        lastName,gender,LocalDate.parse(dOB),phonenumber);
                        
                        System.out.print("Enter Amount: ");
                        double amount = scan.nextDouble();
                        
                        System.out.print("Enter full Name: ");
                        String fullName = scan.nextLine();
                        
                        System.out.print("Enter Payment Method: ");
                        String paymentMethod = scan.nextLine();
                        
                        student.payFees(amount,fullName,paymentMethod);
                    }
                default -> System.out.println("Invalid Input");
                }
            }
        }
    }
}