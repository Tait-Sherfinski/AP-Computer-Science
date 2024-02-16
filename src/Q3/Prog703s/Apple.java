package Q3.Prog703s;

public class Apple extends Computer {
    private String color;

    public Apple(String name, int number, double value, String c) {
        super(name, number, value);
        color = c;
    }

    public String getColor() { return color; }
}
