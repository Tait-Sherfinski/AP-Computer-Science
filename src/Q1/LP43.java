package Q1;

import java.util.*;

public class LP43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of eggs: ");
        double eggs = input.nextDouble();
        double dozens = eggs / 12;
        double extras = eggs - (12 * dozens);
        double price = 0.0;

        if (dozens >= 0 && dozens < 4) {
            price = 0.50;
        } else if (dozens >= 4 && dozens < 6) {
            price = 0.45;
        } else if (dozens >= 6 && dozens < 11) {
            price = 0.40;
        } else if (dozens >= 11) {
            price = 0.35;
        }

        double cost = (price * dozens) + (extras * (price * (1/12)));
        System.out.println("The total cost is: " + cost);
    }
}
