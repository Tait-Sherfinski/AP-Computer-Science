package Q1;

import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        int number = input.nextInt();

        int longnum = (number * 9) * 12345679;
        System.out.print("5 x 9\n x 12345679\n = " + longnum + " Surprise!");
    }
}
