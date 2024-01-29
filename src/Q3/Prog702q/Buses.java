package Q3.Prog702q;

public class Buses extends Vehicle{
    private String city;

    public Buses(String name, int tires, double value, String c) {
        super(name, tires, value);
        city = c;
    }

    public String getCity() { return city;}
}
