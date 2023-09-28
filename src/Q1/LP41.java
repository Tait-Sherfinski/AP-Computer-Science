package Q1;

import java.util.*;

public class LP41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Copies: ");
        int copies = input.nextInt();
        double price = 0.0;
        if (copies > 0 && copies <= 99) {
            price = 0.30;
        } else if (copies > 99 && copies <= 499) {
            price = 0.28;
        } else if (copies > 499 && copies <= 749) {
            price = 0.27;
        } else if (copies > 749 && copies <= 1000) {
            price = 0.26;
        } else if (copies > 1000) {
            price = 0.25;
        } else {
            System.out.println("Please enter a valid number of copies");
        }

        double total = price * copies;
        System.out.println("The price per copy is: $" + price);
        System.out.println("The total cost is: $" + total);
    }
}
