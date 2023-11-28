package Q2.LP3_9;

import java.util.*;

public class LP3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int uYear = input.nextInt();
        System.out.print("Enter your birth month: ");
        int uMonth = input.nextInt();
        System.out.print("Enter your birth day: ");
        int uDay = input.nextInt();

        System.out.print("Enter current year: ");
        int cYear = input.nextInt();
        System.out.print("Enter current month: ");
        int cMonth = input.nextInt();
        System.out.print("Enter current day: ");
        int cDay = input.nextInt();

        ClLP3_9 wow = new ClLP3_9(uYear, uMonth, uDay, cYear, cMonth, cDay);
        wow.calc();

        double sleptHours = wow.getSleptHours();
        double aliveDays = wow.getAliveDays();

        System.out.println("You've been alive for " + aliveDays + " days");
        System.out.println("You've slept " + sleptHours + " hours");
    }
}
