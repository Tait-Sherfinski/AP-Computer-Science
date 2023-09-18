package Q1;

public class Prog122a {
    public static void main(String[] args) {
        int lcv = 0;
        int lcv2 = 0;
        while (lcv < 50) {
        lcv += 1;
        lcv2 *= lcv;
        System.out.println(lcv + " " + lcv2);
        }
    }
}
