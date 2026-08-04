// Reuse Employee, CommissionEmployee, BasePlusCommissionEmployee from Ch9
// New subclass:
class PieceWorker extends Employee {
    private double wage;
    private int pieces;
    public PieceWorker(String f,String l,String s,double w,int p) {
        super(f,l,s); wage=w; pieces=p;
    }
    @Override public double earnings() { return wage*pieces; }
    @Override public String toString() {
        return String.format("Piece Worker: %s\nWage/piece: %.2f\nPieces: %d",super.toString(),wage,pieces);
    }
}

// Test
public class PieceWorkerTest {
    public static void main(String[] args) {
        Employee[] staff = {
            new SalariedEmployee("A","B","111",1000),
            new CommissionEmployee("C","D","222",5000,0.10),
            new BasePlusCommissionEmployee("E","F","333",4000,0.08,600),
            new PieceWorker("G","H","444",2.50,120)
        };
        for (Employee e : staff) {
            System.out.println(e);
            System.out.printf("Earnings: %.2f%n%n",e.earnings());
        }
    }
}