package Q1.Prog213fCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213fCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213f.dat"));
            double kwh = 0.0;

            while (input.hasNext()) {
                kwh = input.nextDouble();
                Cl213f wow = new Cl213f(kwh);
                wow.calc();
                double cost = wow.getCost();
                System.out.println("Total Electricity Bill: $" + cost);
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
