package Q1.Prog213e;

public class Cl213e {
    private int age;
    private int distribution;
    private double percent;
    private String group;

    public Cl213e(int a) {
        age = a;
        distribution = 0;
        percent = 0;
        group = "0";
    }

    public void calc() {
        if (age < 20) {
            group = "<20";
            distribution = 3;
            percent = 17.65;
        }
    }
}
