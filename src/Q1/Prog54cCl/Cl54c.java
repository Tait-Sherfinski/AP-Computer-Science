package Q1.Prog54cCl;

public class Cl54c {
    private double myRad;
    private double myCirc;
    private double myArea;
    private double pi;

    public Cl54c(double radius) {
        myRad = radius;
        myCirc = 0;
        myArea = 0;
        pi = 3.14159;
    }

    public void calc() {
        myCirc = (myRad * 2) * pi;
        myArea = pi * (myRad * myRad);
    }

    public double getMyCirc() { return myCirc; }
    public double getMyArea() { return myArea; }
}
