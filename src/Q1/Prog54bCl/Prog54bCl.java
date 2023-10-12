package Q1.Prog54bCl;

import java.util.*;

public class Prog54bCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = input.nextInt();

        System.out.print("Enter num2: ");
        int n2 = input.nextInt();

        System.out.print("Enter num3: ");
        int n3 = input.nextInt();

        System.out.print("Enter num4: ");
        int n4 = input.nextInt();

        CL54b wow = new CL54b(n1, n2, n3, n4);
        wow.Calc();

        int Sum = wow.getSum();

        System.out.println("The sum is: " + Sum);
    }
}
