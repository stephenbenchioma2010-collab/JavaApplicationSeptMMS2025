import java.util.Scanner;

public class SalaryCalc{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Employee name: ");
		String name = input.nextLine();
		
		System.out.print("Enter hours worked : ");
		int hours = input.nextInt();
		
		System.out.print("Enter hourly rate : ");
		double rate = input.nextDouble();
		
		double grossSalary = hours * rate;
		double tax = grossSalary * 10/100;
		double netSalary = grossSalary - tax;
		
		System.out.println("Employee name : " + name);
		System.out.println("Gross Salary : " + grossSalary);
		System.out.println("Tax : " + tax);
		System.out.println("net Salary : " + netSalary);
	}
}