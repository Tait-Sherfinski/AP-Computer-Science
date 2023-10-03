package Q1.Prog52aCL;

public class CL52a { // helper class
    private int myLen;
    private int myWid;
    private int myArea;
    private int myPerim;

    // Input section(constructor)
    public CL52a(int len, int wid) {
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;
    }

    // Calculation section
    public void calc() {
        myArea = myLen * myWid;
        myPerim = 2 * myLen + 2 * myWid;
    }

    // Output section
    public int getArea() { return myArea; }
    public int getPerim() { return myPerim; }
}
