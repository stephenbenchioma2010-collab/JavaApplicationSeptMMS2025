// CommissionEmployee class (unchanged)
class CommissionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        grossSales = sales;
        commissionRate = rate;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public double getGrossSales() { return grossSales; }
    public double getCommissionRate() { return commissionRate; }
    public double earnings() { return grossSales * commissionRate; }
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
            "commission employee", firstName, lastName,
            "social security number", socialSecurityNumber,
            "gross sales", grossSales,
            "commission rate", commissionRate);
    }
}

// BasePlusCommissionEmployee using COMPOSITION
class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee; // Composition
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn,
        double sales, double rate, double salary) {
        commissionEmployee = new CommissionEmployee(first, last, ssn, sales, rate);
        baseSalary = salary;
    }

    public void setBaseSalary(double salary) { baseSalary = salary; }
    public double getBaseSalary() { return baseSalary; }

    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    public String toString() {
        return String.format("%s %s; %s: %.2f",
            "base-salaried", commissionEmployee.toString(),
            "base salary", getBaseSalary());
    }

    // Delegate all other get methods to the contained object
    public String getFirstName() { return commissionEmployee.getFirstName(); }
    public String getLastName() { return commissionEmployee.getLastName(); }
    public String getSocialSecurityNumber() { return commissionEmployee.getSocialSecurityNumber(); }
    public double getGrossSales() { return commissionEmployee.getGrossSales(); }
    public double getCommissionRate() { return commissionEmployee.getCommissionRate(); }
}