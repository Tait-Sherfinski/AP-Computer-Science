package Q1.Prog88aCl;

import java.util.*;

public class Prog88aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();

        Cl88a wow = new Cl88a(n1, n2);
        wow.calc();

        int Sum = wow.getSum();
        int diff = wow.getDiff();
        int prod = wow.getProduct();
        int average = wow.getAverage();
        int abs = wow.getAbs();
        int max = wow.getMax();
        int min = wow.getMin();

        System.out.println("Sum: " + Sum + "\nDifference: " + diff + "\nProduct: " + prod + "\nAverage: " + average +
        "\nAbsolute Difference: " + abs + "Max: " + max + "Min: " + min);
    }
}
