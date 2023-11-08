package Q2.Prog402aArray;

public class Cl402a {
    private double myId;
    private double myScore;
    private double myDiff;
    private double myAvg;

    public Cl402a(double id, double score) {
        myId = id;
        myScore = score;
        myDiff = 0;
        myAvg = 0;
    }

    public void setId(double Id) { myId = Id; }
    public void setScore(double score) { myScore = score; }
    public String toString() {
        return String.format("ID: " + "Score: " + "Diff: %.2f", myId, myScore, myDiff);
    }
}
