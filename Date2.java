public class Date2 {
    private int month, day, year;
    private static final String[] monthNames = {"","January","February","March","April","May","June",
        "July","August","September","October","November","December"};

    public Date(int m, int d, int y) { month=m; day=d; year=y; }
    public Date(String mName, int d, int y) {
        for(int i=1;i<=12;i++)
            if(monthNames[i].equalsIgnoreCase(mName)) { month=i; break; }
        day=d; year=y;
    }
    public Date(int dayOfYear, int y) {
        year=y;
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=1;i<=12;i++){
            if(dayOfYear <= days[i]) { month=i; day=dayOfYear; break; }
            dayOfYear -= days[i];
        }
    }

    public String formatMMDDYYYY() { return String.format("%02d/%02d/%04d",month,day,year); }
    public String formatLong() { return monthNames[month]+" "+day+", "+year; }
    public String formatDayOfYear() {
        int doy=0;
        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=1;i<month;i++) doy+=days[i];
        doy+=day;
        return doy+" "+year;
    }
}