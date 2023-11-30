package Q2.LP3_10;

import java.util.*;

public class LP3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of burgers: ");
        int burgers = input.nextInt();
        System.out.print("Enter the number of fries: ");
        int fries = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        int sodas = input.nextInt();

        ClLP3_10 wow = new ClLP3_10(burgers, fries, sodas);
        wow.calc();

        double B4Tax = wow.getB4Tax();
        double tax = wow.getMyTax();
        double total = wow.getMyTotal();

        System.out.printf("Before tax: $%.2f", B4Tax);
        System.out.printf("\nTax: $%.2f", tax);
        System.out.printf("\nFinal total: $%.2f", total);
    }
}
