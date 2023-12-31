package Q2.LP3_9;

public class ClLP3_9 {
    public int myYear;
    public int myMonth;
    public int myDay;
    public int yearNow;
    public int monthNow;
    public int dayNow;
    public int aliveDays;
    public int sleptHours;

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
        aliveDays = (yearNow - myYear) * 365 + (Math.abs(myMonth - monthNow)) * 30 + (Math.abs(myDay - dayNow));
        sleptHours = aliveDays * 8;
    }

    public double getAliveDays() { return aliveDays; }
    public double getSleptHours() { return sleptHours; }
}
