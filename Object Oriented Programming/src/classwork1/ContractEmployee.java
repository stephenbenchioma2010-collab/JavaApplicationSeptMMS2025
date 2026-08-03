
package classwork1;

public class ContractEmployee extends Employee{
    private double projectFee;
    public ContractEmployee(double fee){
        projectFee = fee;
    }
    @Override
    public double calculateSalary(){
        return projectFee;
    }
}