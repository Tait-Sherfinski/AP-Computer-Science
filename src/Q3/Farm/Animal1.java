package Q3.Farm;

public abstract class Animal1 {
    private int myWeight;
    private int myNumCorn;
    private int myNumHayBales;

    public Animal1(int weight, int corn, int hay) {
        myWeight = weight;
        myNumCorn = corn;
        myNumHayBales = hay;
    }

    public abstract double value(double cornCost, double hayCost);

    public int getWeight()      { return myWeight; }
    public int getNumCorn()     { return myNumCorn; }
    public int getNumHayBales() { return myNumHayBales; }

    public double getFeedCost(double cornCost, double hayCost) {
        return (myNumCorn + cornCost) + (myNumHayBales * hayCost);
    }
}
