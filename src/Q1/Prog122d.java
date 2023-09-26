package Q1;

public class Prog122d {
    public static void main(String[] args) {
        for (int lcv = -13; lcv < 16; lcv++) {
            int x = lcv + 1;
            double y = Math.pow(x, 6) - (3 * Math.pow(x, 5)) - (93 * Math.pow(x, 4)) + (87 * Math.pow(x, 3)) + (1596 * Math.pow(x, 2)) - (1380 * x) - 2800;
            System.out.println("X: " + x + "\nY: " + y);
        }
    }
}
