package Q3.Prog702p;

public class Wallies extends Animal{
    public int stepsPerDay;

    public Wallies(String name, String word, int steps) {
        super(name, word);
        stepsPerDay = steps;
    }

    public int getSteps() {return stepsPerDay; }
}
