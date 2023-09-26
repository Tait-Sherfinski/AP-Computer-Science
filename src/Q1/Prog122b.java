package Q1;

public class Prog122b {
    public static void main(String[] args) {
        for (int lcv = 0; lcv < 40; lcv++) {
            int hours = lcv + 1;
            int pay = hours * 4;
            System.out.println("Hours: " + hours + " Pay: $" + pay);
        }
    }
}
