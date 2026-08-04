public class TestTime2 {
    public static void main(String[] args) {
        Time2 t = new Time2(23, 59, 58);
        System.out.println("Start: " + t);
        t.tick(); System.out.println("After tick: " + t);
        t.tick(); System.out.println("After tick: " + t);
        t.incrementMinute(); System.out.println("After +1min: " + t);
        t.incrementHour(); System.out.println("After +1hr: " + t);
    }
}