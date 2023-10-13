package Q1.Prog76aCl;

public class Cl76a {
    private int myNum;
    private int myNum2;

    public Cl76a(int num) {
        myNum = num;
        myNum2 = 0;
    }

    public void calc() {
        myNum2 = myNum * 9 * 12345679;
    }

    public int getMyNum2() { return myNum2; }
}
