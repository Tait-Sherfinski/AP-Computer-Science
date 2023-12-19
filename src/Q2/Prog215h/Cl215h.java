package Q2.Prog215h;

import java.util.ArrayList;

public class Cl215h {
    private int[] cont1;
    private int[] cont2;
    private int[] cont3;
    private double c1Avg;
    private double c2Avg;
    private double c3Avg;

    public Cl215h(int[] c1, int[] c2, int[] c3) {
        cont1 = c1;
        cont2 = c2;
        cont3 = c3;
        c1Avg = 0;
        c2Avg = 0;
        c3Avg = 0;
    }

    public void calc() {
        for (int lcv = 0; lcv < cont1.length; lcv++) {
            double sum = cont1[lcv];
            c1Avg = sum / cont1.length;
        }
        for (int lcv = 0; lcv < cont2.length; lcv++) {
            double sum = cont2[lcv];
            c2Avg = sum / cont2.length;
        }
        for (int lcv = 0; lcv < cont3.length; lcv++) {
            double sum = cont3[lcv];
            c3Avg = sum / cont3.length;
        }
    }
}
