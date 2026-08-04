public class DateAndTime {
    private Date date;
    private Time2 time;

    public DateAndTime(int m, int d, int y, int h, int min, int s) {
        date = new Date(m,d,y);
        time = new Time2(h,min,s);
    }

    public void incrementHour() {
        time.incrementHour();
        if (time.getHour() == 0) date.nextDay();
    }

    public String toUniversalString() {
        return date + " " + time.toUniversalString();
    }

    public String toString() {
        return date + " " + time;
    }
}