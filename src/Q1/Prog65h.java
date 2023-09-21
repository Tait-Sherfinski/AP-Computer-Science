package Q1;

import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter shillings: ");
        double shil = input.nextDouble();

        System.out.print("Enter pence: ");
        double pence = input.nextDouble();

        double decpounds = pounds + (shil / 20) + (pence / 240);
        System.out.printf("Decimal pounds: %.2f\n", decpounds);
    }
}
