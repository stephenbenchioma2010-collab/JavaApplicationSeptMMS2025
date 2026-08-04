// Superclass Employee
class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    @Override
    public String toString() {
        return String.format("%s %s%nsocial security number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}

// CommissionEmployee now extends Employee
class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        super(first, last, ssn); // call super constructor
        grossSales = sales;
        commissionRate = rate;
    }

    public double getGrossSales() { return grossSales; }
    public double getCommissionRate() { return commissionRate; }
    public double earnings() { return getGrossSales() * getCommissionRate(); }

    @Override
    public String toString() {
        return String.format("%s%n%s: %.2f%n%s: %.2f",
            super.toString(), // call super toString
            "gross sales", getGrossSales(),
            "commission rate", getCommissionRate());
    }
}

// BasePlusCommissionEmployee extends CommissionEmployee
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn,
        double sales, double rate, double salary) {
        super(first, last, ssn, sales, rate);
        baseSalary = salary;
    }

    public void setBaseSalary(double salary) { baseSalary = salary; }
    public double getBaseSalary() { return baseSalary; }
    @Override public double earnings() { return getBaseSalary() + super.earnings(); }
    @Override public String toString() {
        return String.format("%s; %s: %.2f",
            super.toString(), "base salary", getBaseSalary());
    }
}