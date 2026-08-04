// Test Program
public class TestDate {
    public static void main(String[] args) {
        Date d = new Date(12, 31, 2025);
        for (int i = 0; i <= 3; i++) {
            System.out.println(d);
            d.nextDay();
        }
    }
}