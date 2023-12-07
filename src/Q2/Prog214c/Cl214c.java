package Q2.Prog214c;

public class Cl214c {
    private String gasType;
    private double gallons;
    private double carWash;
    private double total;

    public Cl214c(String gT, double gl) {
        gasType = gT;
        gallons = gl;
        carWash = 2.0;
        total = 0.0;
    }

    public void calc() {
        if (gasType == "R") {
            if (gallons < 20 && gallons > 10) {
                total = (gallons * 1.359) + carWash * ((gallons - 10) * 0.1);
            } else if (gallons > 20) {
                total = (gallons * 1.359);
            } else total = (gallons * 1.359) + carWash;
        }
        else if (gasType == "P") {
            if (gallons < 20 && gallons > 10) {
                total = (gallons * 1.479) + carWash * ((gallons - 10) * 0.1);
            } else if (gallons > 20) {
                total = (gallons * 1.479);
            } else total = (gallons * 1.479) + carWash;
        }
        else if (gasType == "H") {
            if (gallons < 20 && gallons > 10) {
                total = (gallons * 1.429) + carWash * ((gallons - 10) * 0.1);
            } else if (gallons > 20) {
                total = (gallons * 1.429);
            } else total = (gallons * 1.429) + carWash;
        }
    }

    public double getTotal() { return total; }
}
