package Q1.Prog54bCl;

public class CL54b {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int Sum;
    private int average;

    public CL54b(int Num1, int Num2, int Num3, int Num4) {
        num1 = Num1;
        num2 = Num2;
        num3 = Num3;
        num4 = Num4;
        Sum = 0;
        average = 0;
    }

    public void Calc() {
        Sum = num1 + num2 + num3 + num4;
        average = Sum / 4;
    }

    public int getSum() { return Sum; }
    public int getAverage() { return average; }
}
