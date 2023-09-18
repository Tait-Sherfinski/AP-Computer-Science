package Q1;

import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Please enter radius: ");
        double radius = input.nextDouble();
        System.out.println();

        double pi = 3.14159;

        double area = pi * (radius * radius);
        double circumference = 2 * pi * radius;
        System.out.printf("Area = %.3f\n", area);
        System.out.printf("Circumference = %.3f\n", circumference);
    }
}
