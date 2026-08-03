
package classwork1;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    public PartTimeEmployee(double rate,int hours){
        hourlyRate = rate;
        hoursWorked = hours;
    }
    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}