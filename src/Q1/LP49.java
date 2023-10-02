package Q1;

import java.util.*;

public class LP49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1 through 20: ");
        int num1 = input.nextInt();

        Random randomNum = new Random();
        int compNum = randomNum.nextInt(20);
        System.out.println("Computers Number: " + compNum);
        System.out.println("Players Number: " + num1);
        if (compNum == num1) {
            System.out.println("You Won!");
        } else {
            System.out.println("Better luck next time");
        }
    }
}
