abstract class Employee implements Payable { // now implements Payable
    private final String firstName, lastName, ssn;
    public Employee(String f,String l,String s) {firstName=f;lastName=l;ssn=s;}
    public abstract double earnings();
    // getPaymentAmount calls earnings → polymorphic
    public double getPaymentAmount() { return earnings(); }
}