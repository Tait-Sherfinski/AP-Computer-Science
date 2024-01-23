package Q3.Prog701g;

public class Teacher extends Person {
    private int myNumStus;

    public Teacher(String fn, String ln, int stus) {
        super(fn, ln);
        myNumStus = stus;
    }

    public int getNumsStus() { return myNumStus; }
}
