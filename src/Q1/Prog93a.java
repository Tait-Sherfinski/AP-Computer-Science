package Q1;

import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kilowatts Used: ");
        int kwatts = input.nextInt();
        double brate = kwatts * 0.0475;
        double scharge = brate * 0.1;
        double ctax = brate * 0.03;
        double total = brate + scharge + ctax;
        double ltotal = total * 1.04;
        System.out.println("Base Rate: " + brate + "Surcharge: " + scharge + "City Tax: " + ctax + "Pay this: ");
    }
}
