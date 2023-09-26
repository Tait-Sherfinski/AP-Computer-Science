package Q1;

public class Prog122c {
    public static void main(String[] args) {
        for (int lcv = 0; lcv < 10; lcv+=2) {
            int col1 = lcv + 2;
            int col2 = col1 + 1;
            int col3 = col1 * 2;
            int col4 = col1 * col1;
            System.out.println(col1 + " " + col2 + " " + col3 + " " + col4);
        }
    }
}
