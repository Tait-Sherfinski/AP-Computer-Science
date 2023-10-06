package Q1;

import java.util.*;

public class LP56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num1 = input.nextInt();

        String newnum = Integer.toString(num1);

        for (int lcv = 0; lcv < 1; lcv++) {
            int newInt = Integer.parseInt(newnum.substring(0, newnum.length()));
            System.out.println("The sum of the digits is: " + newInt);
        }
    }
}