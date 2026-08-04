class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked) {
        super(first, last, ssn);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage) {
        if (hourlyWage < 0) throw new IllegalArgumentException("Wage cannot be negative");
        wage = hourlyWage;
    }

    public void setHours(double hoursWorked) {
        if (hoursWorked < 0 || hoursWorked > 168)
            throw new IllegalArgumentException("Hours must be 0–168");
        hours = hoursWorked;
    }

    public double getWage() { return wage; }
    public double getHours() { return hours; }

    public double earnings() {
        if (getHours() <= 40) return getHours() * getWage();
        else return (40 * getWage()) + ((getHours() - 40) * getWage() * 1.5);
    }

    @Override public String toString() {
        return String.format("hourly employee: %s%n%s: %.2f%n%s: %.2f",
            super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
}

// Test Program
public class TestHourly {
    public static void main(String[] args) {
        HourlyEmployee emp = new HourlyEmployee("John", "Doe", "111-22-3333", 15.00, 45);
        System.out.println(emp);
        System.out.printf("Earnings: $%.2f%n", emp.earnings());
    }
}