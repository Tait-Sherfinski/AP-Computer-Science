package Q1.Prog88aCl;

public class Cl88a {
    private int num1;
    private int num2;
    private int Sum;
    private int diff;
    private int product;
    private int average;
    private int abs;
    private int max;
    private int min;

    public Cl88a(int n1, int n2) {
        num1 = n1;
        num2 = n2;
        Sum = 0;
        diff = 0;
        product = 0;
        average = 0;
        abs = 0;
        max = 0;
        min = 0;
    }

    public void calc() {
        Sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        average = Sum / 2;
        abs = Math.abs(diff);
        max = (abs + num1 + num2) / 2;
        min = max - abs;
    }

    public int getSum() { return Sum; }
    public int getDiff() { return diff; }
    public int getProduct() { return product; }
    public int getAverage() { return average; }
    public int getAbs() { return abs; }
    public int getMax() { return max; }
    public int getMin() { return min; }
}
