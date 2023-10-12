package Q1.Prog93aCl;

public class CL93a {

    private int kilowatts;
    private double base;
    private double surcharge;
    private double citytax;
    private double total;
    private double latetotal;


    public CL93a (int kw) {
        kilowatts = kw;
        base = 0;
        surcharge = 0;
        citytax = 0;
        total = 0;
        latetotal = 0;
    }

    public void calc() {
        base = kilowatts * 4.75;
        surcharge = base * 0.1;
    }


    public double getBase() { return base; }
    public double getsurcharge() {return surcharge;}
}
