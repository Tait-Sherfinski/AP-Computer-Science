package Q1;

import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Speed Limit: ");
        double limit = input.nextDouble();

        System.out.print("Car Speed: ");
        double speed = input.nextDouble();

        double fine = 20 + ((speed - limit) * 5);
        System.out.println("Fine = " + fine);
    }
}
