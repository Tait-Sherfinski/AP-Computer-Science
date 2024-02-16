package Q3.Prog703s;

public class Linux extends Computer{
    private int hiddenCode;

    public Linux(String name, int number, double value, int hC) {
        super(name, number, value);
        hiddenCode = hC;
    }

    public int getHiddenCode() { return hiddenCode; }
}
