package Q1;

public class LP59 {
    public static void main(String[] args) {
        System.out.println("\nX^1: " + "X^2: " + "X^3: " + "X^4: " + "X^5: ");

        for (int lcv = 1; lcv < 7; lcv++) {
            double col1 = Math.pow(lcv, 1);
            double col2 = Math.pow(lcv, 2);
            double col3 = Math.pow(lcv, 3);
            double col4 = Math.pow(lcv, 4);
            double col5 = Math.pow(lcv, 5);
            System.out.println(col1 + " " + col2 + " " + col3 + " " + col4 + " " + col5);
        }
    }
}
