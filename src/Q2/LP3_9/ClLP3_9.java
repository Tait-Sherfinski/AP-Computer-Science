package Q2.LP3_9;

public class ClLP3_9 {
    public int myYear;
    public int myMonth;
    public int myDay;
    public int yearNow;
    public int monthNow;
    public int dayNow;
    public double aliveDays;
    public double sleptHours;

    public ClLP3_9(int year, int month, int day, int cYear, int cMonth, int cDay) {
        myYear = year;
        myMonth = month;
        myDay = day;
        yearNow = cYear;
        monthNow = cMonth;
        dayNow = cDay;
        aliveDays = 0;
        sleptHours = 0;
    }

    public void calc() {
        aliveDays = (yearNow - myYear) * 365.25 + (monthNow - myMonth) * 365.25 / 12;
        sleptHours = aliveDays * 8;
    }
}
