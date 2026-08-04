public class Time2 {
    // Internal storage: total seconds since midnight
    private int totalSeconds;

    // Constructors
    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60) throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60) throw new IllegalArgumentException("second must be 0-59");
        totalSeconds = hour * 3600 + minute * 60 + second;
    }

    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Setters
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60) throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60) throw new IllegalArgumentException("second must be 0-59");
        totalSeconds = hour * 3600 + minute * 60 + second;
    }

    public void setHour(int hour) {
        int oldMinute = getMinute();
        int oldSecond = getSecond();
        setTime(hour, oldMinute, oldSecond);
    }

    public void setMinute(int minute) {
        int oldHour = getHour();
        int oldSecond = getSecond();
        setTime(oldHour, minute, oldSecond);
    }

    public void setSecond(int second) {
        int oldHour = getHour();
        int oldMinute = getMinute();
        setTime(oldHour, oldMinute, second);
    }

    // Getters (derive values from totalSeconds)
    public int getHour() { return totalSeconds / 3600; }
    public int getMinute() { return (totalSeconds % 3600) / 60; }
    public int getSecond() { return totalSeconds % 60; }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
	public void tick() {
        totalSeconds++;
        if (totalSeconds >= 86400) totalSeconds = 0; // wrap midnight
    }

    // Increment by one minute
    public void incrementMinute() {
        totalSeconds += 60;
        if (totalSeconds >= 86400) totalSeconds = 0;
    }

    // Increment by one hour
    public void incrementHour() {
        totalSeconds += 3600;
        if (totalSeconds >= 86400) totalSeconds = 0;
    }
}