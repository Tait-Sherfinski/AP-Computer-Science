package Q2.Prog213fArray;

public class Cl213f {
    private double myKWH;
    private double myCost;

    public Cl213f(double kwh) {
        myKWH = kwh;
        myCost = 0;
    }

    public void calc() {
        if (myKWH <= 2000) myCost = myKWH * 0.07;
        else if (myKWH > 2000 && myKWH <= 10000) myCost = (2000 * 0.07) + (myKWH - 2000) * 0.05;
        else if (myKWH > 10000) myCost = (2000 * 0.07) + (8000 * 0.05) + (myKWH - 10000) * 0.04;
        else myCost = 0;
    }

    public String toString() {
        return "The total cost is: $" + myCost;
    }
}
