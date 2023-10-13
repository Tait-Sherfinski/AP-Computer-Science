package Q1.Prog82aCl;

import java.util.*;

public class Prog82aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Speed Limit: ");
        int sl = input.nextInt();

        System.out.print("Enter speed: ");
        int s = input.nextInt();

        Cl82a wow = new Cl82a(sl, s);
        wow.calc();

        int fine = wow.getMyFine();

        System.out.println("Fine: $" + fine);
    }
}
