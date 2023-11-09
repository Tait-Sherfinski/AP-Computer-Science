package Q2.Prog214bArray;

public class Cl214b {
    private int empNum;
    private double yearToDate;
    private double myRate;
    private double shiftFactor;
    private double myHours;
    private double grossPay;
    private double withholding;
    private double FICA;
    private double netPay;

    public Cl214b(int num, double YtD, double rate, double sf, double hours) {
        empNum = num;
        yearToDate = YtD;
        myRate = rate;
        shiftFactor = sf;
        myHours = hours;
        grossPay = 0;
        withholding = 0;
        FICA = 0;
        netPay = 0;
    }

    public void calc() {
        grossPay = (myRate * shiftFactor) * myHours;
        if (grossPay < 100) withholding = 0;
        else if (grossPay >= 100 && grossPay < 150) withholding = 0.08 * grossPay;
        else if (grossPay >= 150 && grossPay < 200) withholding = 0.12 * grossPay;
        else if (grossPay >= 200 && grossPay < 300) withholding = 0.15 * grossPay;
        else if (grossPay >= 300) withholding = 0.175 * grossPay;
        if (grossPay + yearToDate > 17300) FICA = 0;
        else if (grossPay + yearToDate <= 17300) FICA = 0.0605 * grossPay;
    }
}
