package Q3.Prog702q;

public class Cars extends Vehicle{
    private double worth;

    public Cars(String name, int tires, double value, double w) {
        super(name, tires, value);
        worth = w;
    }

    public double getWorth() { return worth; }
}
