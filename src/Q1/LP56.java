package Q1;

import java.util.*;

public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = input.nextInt();

        int Sum = 0;

        while (num != 0) {
            Sum = Sum + num % 10;
            num = num / 10;
        }

        System.out.println("The sum of the digits is: " + Sum);
    }
}