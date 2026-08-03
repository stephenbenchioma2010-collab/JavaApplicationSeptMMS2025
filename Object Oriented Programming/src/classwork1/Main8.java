package classwork1;

public class Main8 {
    public static void main(String[] args){
       Employee emp;
       emp = new FullTimeEmployee(180000);
       System.out.println("Full Time Salary: $" + emp.calculateSalary());
       
       emp = new PartTimeEmployee(1500,40);
       System.out.println("Part Time Salary: $" + emp.calculateSalary());
       
       emp = new ContractEmployee(500000);
       System.out.println("Contract Salary: $" + emp.calculateSalary());
    }
}
