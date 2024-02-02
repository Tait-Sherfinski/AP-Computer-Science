package Q3.Prog703s;

public class Computer implements comps{
    private String myName;
    private int myNum;
    private double myValue;

    public Computer(String n, int num, double v) {
        myName = n;
        myNum = num;
        myValue = v;
    }

    public String getName() { return myName; }
    public int getNumber() { return myNum; }
    public double getValue() { return myValue; }
}
