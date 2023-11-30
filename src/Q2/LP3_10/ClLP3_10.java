package Q2.LP3_10;

public class ClLP3_10 {
    private double myBurgers;
    private double myFries;
    private double mySodas;
    private double B4Tax;
    private double myTax;
    private double myTotal;

    public ClLP3_10(int burgers, int fries, int sodas) {
        myBurgers = burgers;
        myFries = fries;
        mySodas = sodas;
        B4Tax = 0;
        myTax = 0;
        myTotal = 0;
    }

    public void calc() {
        B4Tax = (myBurgers * 1.69) + (myFries * 1.09) + (mySodas * 0.99);
        myTax = B4Tax * 0.065;
        myTotal = B4Tax + myTax;
    }

    public double getB4Tax() { return B4Tax; }
    public double getMyTax() { return myTax; }
    public double getMyTotal() { return myTotal; }
}
