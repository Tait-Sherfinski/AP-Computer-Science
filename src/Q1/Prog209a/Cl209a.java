package Q1.Prog209a;

public class Cl209a {
    private int nums;
    private int lessThan;
    private int greaterThan;

    public Cl209a(int n) {
        nums = n;
        lessThan = 0;
        greaterThan = 0;
    }

    public void calc() {
        for (nums = 0; nums < 500; nums++) {
            lessThan += nums;
        }
        for (nums = 0; nums > 500; nums++) {
            greaterThan += nums;
        }
    }

    public int getGreaterThan() {
        return greaterThan;
    }

    public int getLessThan() {
        return lessThan;
    }
}
