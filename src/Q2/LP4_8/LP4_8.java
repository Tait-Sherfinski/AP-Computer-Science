package Q2.LP4_8;

import java.util.*;

public class LP4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.print("Enter m: ");
        int m = input.nextInt();
        System.out.print("Enter Seed: ");
        int Xn = input.nextInt();

        ClLP4_8 wow = new ClLP4_8(a, c, m, Xn);

        for (int lcv = 0; lcv < 10; lcv++) {
            System.out.println(wow.toString());
        }
    }
}
