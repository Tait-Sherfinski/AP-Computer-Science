package Q1;

import java.util.*;

public class LP42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Weight(kg): ");
        int weight = input.nextInt();

        System.out.println("Enter length(cm): ");
        int len = input.nextInt();

        System.out.println("Enter width(cm): ");
        int wid = input.nextInt();

        System.out.println("Enter height(cm): ");
        int height = input.nextInt();

        int size = len * wid * height;


        if (weight > 27 && size > 100000) {
            System.out.println("Too Large and Too Heavy");
        } else if (weight > 27) {
            System.out.println("Too Heavy");
        } else if (size > 100000) {
            System.out.println("Too Large");
        }
    }
}
