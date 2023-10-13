package Q1.Prog76aCl;

import java.util.*;

public class Prog76aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you hate: ");
        int n = input.nextInt();

        Cl76a wow = new Cl76a(n);
        wow.calc();

        int num2 = wow.getMyNum2();

        System.out.println("Surprise! " + num2);
    }
}
