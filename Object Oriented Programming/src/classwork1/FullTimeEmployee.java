
package classwork1;

public class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(double sal){
        monthlySalary = sal;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}