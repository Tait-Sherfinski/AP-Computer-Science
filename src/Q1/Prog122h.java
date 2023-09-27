package Q1;

public class Prog122h {
    public static void main(String[] args) {
        for (int lcv = 0; lcv < 20; lcv++) {
            int col1 = lcv + 1;
            int col2 = col1 * col1;
            double col3 = Math.sqrt(col1);
            int col4 = col1*col1*col1;
            double col5 = Math.sqrt(col3);
            System.out.println("\n\nNumber: " + col1);
            System.out.println("Square: " + col2);
            System.out.printf("Square Root: %.4f", col3);
            System.out.println("\nCube: " + col4);
            System.out.printf("4th Root: %.4f", col5);
        }
    }
}
