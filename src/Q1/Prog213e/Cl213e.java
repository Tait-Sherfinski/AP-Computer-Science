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
        else if (age > 19 && age < 40) {
            group = "20-39";
            distribution = 5;
            percent = 29.41;
        }
        else if (age > 39 && age < 60) {
            group = "40-59";
            distribution = 4;
            percent = 23.53;
        }
        else if (age > 59 && age < 80) {
            group = "60-79";
            distribution = 3;
            percent = 17.65;
        }
        else if (age > 79) {
            group = ">79";
            distribution = 2;
            percent = 11.76;
        }
    }

    public String toString() { return String.format("Group: \tDistribution: %d\tPercent: %.2f"); }
}
