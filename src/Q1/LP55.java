package Q1;

import java.util.*;

public class LP55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String num1 = input.nextLine();

        for (int lcv = 0; lcv < num1.length(); lcv++) {
            System.out.println(num1.charAt(lcv) + " ");
        }
    }
}
