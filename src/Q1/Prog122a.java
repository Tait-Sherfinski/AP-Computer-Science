package Q1;

public class Prog122a {
    public static void main(String[] args) {
        for (int lcv = 0; lcv < 50; lcv++) {
            int col1 = lcv+1;
            double col2 = col1 * col1;
            double col3 = Math.sqrt(col1);
            System.out.println("\nNumber: " + col1 + "\n\nSquared: " + col2 + "\n\nSquare Root: " + col3);
        }
        }
    }
