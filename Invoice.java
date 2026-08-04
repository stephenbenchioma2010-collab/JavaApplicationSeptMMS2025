interface Payable {
    double getPaymentAmount();
}

class Invoice implements Payable {
    private String partNum,desc;
    private int qty;
    private double pricePer;
    public Invoice(String n,String d,int q,double p) {
        partNum=n; desc=d; qty=q; pricePer=p;
    }
    public double getPaymentAmount() { return qty*pricePer; }
}

// Modified Employee subclasses implement Payable
class HourlyEmployee extends Employee implements Payable {
    private double hours,wage;
    public HourlyEmployee(String f,String l,String s,double w,double h) {
        super(f,l,s); wage=w; hours=h;
    }
    public double getPaymentAmount() {
        if (hours<=40) return hours*wage;
        else return 40*wage + (hours-40)*wage*1.5;
    }
}

class CommissionEmployee extends Employee implements Payable {
    private double sales,rate;
    public CommissionEmployee(String f,String l,String s,double sa,double r) {
        super(f,l,s); sales=sa; rate=r;
    }
    public double getPaymentAmount() { return sales*rate; }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double base;
    public BasePlusCommissionEmployee(String f,String l,String s,double sa,double r,double b) {
        super(f,l,s,sa,r); base=b;
    }
    public double getPaymentAmount() {
        return base + super.getPaymentAmount();
    }
    public void raiseBase() { base*=1.10; } // 10% raise
}

// Test
public class PayableTest {
    public static void main(String[] args) {
        Payable[] items = {
            new Invoice("123","Screws",200,0.10),
            new Invoice("456","Nuts",150,0.05),
            new SalariedEmployee("A","B","111",800),
            new HourlyEmployee("C","D","222",20,45),
            new CommissionEmployee("E","F","333",10000,0.06),
            new BasePlusCommissionEmployee("G","H","444",5000,0.04,1000)
        };
        for (Payable p : items) {
            if (p instanceof BasePlusCommissionEmployee)
                ((BasePlusCommissionEmployee)p).raiseBase();
            System.out.printf("Amount due: %.2f%n",p.getPaymentAmount());
        }
    }
}