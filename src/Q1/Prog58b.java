package Q1;

import java.util.Scanner;

public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("A = ");
        int a = input.nextInt();

        System.out.print("B = ");
        int b = input.nextInt();

        System.out.print("C = ");
        int c = input.nextInt();

        double root = (-b + (Math.sqrt(b*b - 4 * (a*c)))) / 2 * a;
        double root2 = (-b - (Math.sqrt(b*b - 4 * (a*c)))) / 2 * a;
        System.out.println("The roots are " + root + " and " + root2);
    }
}
