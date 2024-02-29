package Q3.Farm;

public class Cow1 extends Animal1{
    private static final double MILK_PRICE_LB = 0.20;
    private double myMilk;

    public Cow1(int weight, double milk, int corn, int hay) {
        super(weight, corn, hay);
        myMilk = milk;
    }

    public double value(double cornCost, double hayCost) {
        return myMilk * MILK_PRICE_LB - getFeedCost(cornCost, hayCost);
    }

    public double getMilk()      { return myMilk; }
    public double getMilkPrice() { return MILK_PRICE_LB; }
}
