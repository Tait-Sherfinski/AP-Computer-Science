package Q1;

public class Prog122i {
    public static void main(String[] args) {
        for (int lcv = -26; lcv < 25; lcv++) {
            int col1 = lcv + 1;
            double col2 = Math.cbrt(col1);
            int col3 = col1*col1*col1;
            System.out.println("\n\nNumber: " + col1);
            System.out.printf("Cube Root: %.5f", col2);
            System.out.println("\nCube: " + col3);
        }
    }
}
