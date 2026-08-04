// Date class
class Date {
    private int month, day, year;
    private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int m, int d, int y) {
        if (m<1||m>12) throw new IllegalArgumentException("Month 1-12");
        if (d<1||d>daysPerMonth[m]) throw new IllegalArgumentException("Invalid day");
        month=m; day=d; year=y;
    }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }
    public String toString() { return month+"/"+day+"/"+year; }
}

// Employee superclass with birthDate
abstract class Employee {
    private final String firstName, lastName, ssn;
    private Date birthDate;

    public Employee(String f, String l, String s, Date bday) {
        firstName=f; lastName=l; ssn=s; birthDate=bday;
    }
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getSSN() {return ssn;}
    public Date getBirthDate() {return birthDate;}
    public abstract double earnings();
    @Override public String toString() {
        return String.format("%s %s\nSSN: %s\nBirthday: %s",
            firstName,lastName,ssn,birthDate);
    }
}

// SalariedEmployee subclass
class SalariedEmployee extends Employee {
    private double weeklySalary;
    public SalariedEmployee(String f,String l,String s,Date bday,double sal) {
        super(f,l,s,bday); weeklySalary=sal;
    }
    @Override public double earnings() { return weeklySalary; }
    @Override public String toString() {
        return String.format("Salaried: %s\nWeekly salary: %.2f",super.toString(),weeklySalary);
    }
}

// CommissionEmployee subclass
class CommissionEmployee extends Employee {
    private double sales,rate;
    public CommissionEmployee(String f,String l,String s,Date bday,double sa,double r) {
        super(f,l,s,bday); sales=sa; rate=r;
    }
    @Override public double earnings() { return sales*rate; }
}

// Test program
import java.time.LocalDate;
public class PayrollBonusTest {
    public static void main(String[] args) {
        Employee[] staff = {
            new SalariedEmployee("John","Doe","111-22",new Date(8,15,1995),800),
            new CommissionEmployee("Mary","Ann","333-44",new Date(8,22,1998),10000,0.06),
            new SalariedEmployee("Joe","Bloggs","555-66",new Date(9,5,1990),900)
        };
        int currentMonth = LocalDate.now().getMonthValue(); // get real current month

        for (Employee e : staff) {
            double pay = e.earnings();
            if (e.getBirthDate().getMonth() == currentMonth) pay += 100;
            System.out.println(e);
            System.out.printf("Pay: %.2f%n%n",pay);
        }
    }
}