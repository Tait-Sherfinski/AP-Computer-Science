package Q1.Prog54bCl;

public class CL54b {
    private int Num1;
    private int Num2;
    private int Num3;
    private int Num4;
    private int Sum;

    public CL54b(int num1, int num2, int num3, int num4) {
        num1 = Num1;
        num2 = Num2;
        num3 = Num3;
        num4 = Num4;
        Sum = 0;
    }

    public void Calc() {
        Sum = Num1 + Num2 + Num3 + Num4;
    }

    public int getSum() { return Sum; }
}
