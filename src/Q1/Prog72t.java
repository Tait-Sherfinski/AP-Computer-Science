package Q1;

import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first time: ");
        int time1 = input.nextInt();

        System.out.print("Enter second time: ");
        int time2 = input.nextInt();

        double math = Math.abs(time1 - time2);
        if (time2 > time1) {
            math = (2400 - math) * 1.03821656;
        }
        System.out.println("Standard time: " + math);
    }
}
