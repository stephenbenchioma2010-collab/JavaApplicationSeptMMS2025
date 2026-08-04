public class Date {
    private int month;
    private int day;
    private int year;
    private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int month, int day, int year) {
        // Validate year
        if (year < 1) throw new IllegalArgumentException("Year must be positive");
        // Validate month
        if (month < 1 || month > 12) throw new IllegalArgumentException("Month must be 1-12");
        // Validate day
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("Day out of range for month/year");
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("Day out of range for month/year");

        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void nextDay() {
        day++;
        if (month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            day = 29; // leap year Feb 29 stays
        } else if (day > daysPerMonth[month] || (month == 2 && day > 28)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}

