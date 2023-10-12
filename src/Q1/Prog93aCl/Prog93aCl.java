package Q1.Prog93aCl;

import java.util.*;

public class Prog93aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Kilowatts Used: ");
        int kw = input.nextInt();

        CL93a wow = new CL93a(kw);
        wow.calc();

        double br = wow.getBase();
        double sc = wow.getsurcharge();
        double ct = wow.getcitytax();
        double t = wow.getTotal();
        double lt = wow.getltotal();

        System.out.printf("Base Rate: %.2f", br);
        System.out.printf("\nSurcharge: %.2f", sc);
        System.out.printf("\nCity Tax: %.2f", ct);
        System.out.printf("\nTotal %.2f", t);
        System.out.printf("\nPay if Late: %.2f", lt);
    }
}
