package Q1.Prog54cCl;

import java.util.*;

public class Prog54cCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = input.nextDouble();

        Cl54c wow = new Cl54c(r);
        wow.calc();

        double circ = wow.getMyCirc();
        double area = wow.getMyArea();

        System.out.printf("The Circumference is: %.3f", circ);
        System.out.printf("\nThe area is: %.3f", area);
    }
}
