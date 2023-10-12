package Q1.Prog54bCl;

public class CL54b {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int Sum;

    public CL54b(int num1, int num2, int num3, int num4) {
        num1 = num1;
        num2 = num2;
        num3 = num3;
        num4 = num4;
        Sum = 0;
    }

    public void Calc() {
        Sum = num1 + num2 + num3 + num4;
    }

    public int getSum() { return Sum; }
}
