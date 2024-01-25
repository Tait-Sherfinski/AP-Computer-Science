package Q3.Prog702p;

public class Hiccas extends Animal {
    private double furWorth;

    public Hiccas(String name, String word, double fw) {
        super(name, word);
        furWorth = fw;
    }

    public double getFurWorth() { return furWorth; }
}
