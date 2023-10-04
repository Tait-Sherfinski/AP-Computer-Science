package Q1;

import java.util.*;

public class LP410 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular Prism");

        System.out.print("Enter the length: ");
        int len = input.nextInt();

        System.out.print("Enter the width: ");
        int wid = input.nextInt();

        System.out.print("Enter the height: ");
        int height = input.nextInt();

        int vol = len * wid * height;

        System.out.println("The volume is: " + vol);
        System.out.println("\nSphere");

        System.out.print("Enter the radius: ");
        int rad = input.nextInt();
        int dia = rad * 2;
        double vol2 = (3.14 * Math.pow(dia, 3)) / 6;
        System.out.println("The volume is: " + vol2);
        System.out.println("Cube");

        System.out.print("Enter the length of each side: ");
        int sLength = input.nextInt();
        int vol3 = sLength * sLength * sLength;
        System.out.println("The volume is: " + vol3);
    }
}
