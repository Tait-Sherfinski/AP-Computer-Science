package Q3.Prog702q;

public class Trucks extends Vehicle{
    private int miles;

    public Trucks(String name, int tires, double value, int m) {
        super(name, tires, value);
        miles = m;
    }

    public int getMiles() { return miles; }
}
