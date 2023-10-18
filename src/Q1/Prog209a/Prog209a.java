package Q1.Prog209a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.dat"));
            int num = 0;

            Cl209a wow = new Cl209a(num);
            wow.calc();

            int gt = wow.getGreaterThan();
            int lt = wow.getLessThan();

            System.out.println("The number of numbers less than 500 is: " + lt);
            System.out.println("The number of numbers greater than 500 is: " + gt);
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
