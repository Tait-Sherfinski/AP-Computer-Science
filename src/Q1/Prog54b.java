package Q1;

import java.util.Scanner;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Please enter num1: ");
        int num1 = input.nextInt();
        System.out.println();

        System.out.print("Please enter num2: ");
        int num2 = input.nextInt();
        System.out.println();

        System.out.print("Please enter num3: ");
        int num3 = input.nextInt();
        System.out.println();

        System.out.print("Please enter num4: ");
        int num4 = input.nextInt();
        System.out.println();

        double sum = num1 + num2 + num3 + num4;
        double average = sum / 4;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
