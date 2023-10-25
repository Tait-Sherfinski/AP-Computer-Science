package Q1.Prog213fCl;

public class Cl213f {
    private double kilowatth;
    private double cents;
    private double cost;

    public Cl213f(double kwh) {
        kilowatth = kwh;
        cost = 0;
        cents = 0;
    }

    public void calc() {
        if (kilowatth <= 2000 && kilowatth > 0) {
            cents = 0.07;
            cost = cents * kilowatth;
        }
        else if (kilowatth > 2000 && kilowatth <= 10000) {
            cents = 0.05;
            cost = Math.abs(2000 - kilowatth) * 0.07;
        }
    }

    public double getCost() { return cost; }
}
