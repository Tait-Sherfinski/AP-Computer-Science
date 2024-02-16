package Q3.Prog703s;

public class Windows extends Computer{
    private double WVNumber;

    public Windows(String name, int number, double value,  double wvN) {
        super(name, number, value);
        WVNumber = wvN;
    }

    public double getWVNumber() { return WVNumber; }
}
