package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));

            int hayBales = input.nextInt();
            double hayCost = input.nextDouble();
            int cornCobs = input.nextInt();
            double cornCost = input.nextDouble();

            int cows = input.nextInt();
            for (int i = 0; i < cows; i++) {
                int weight = input.nextInt();
                int milkLBs = input.nextInt();
                int hayEaten = input.nextInt();
                int cornEaten = input.nextInt();
                hayBales -= hayEaten;
                cornCobs -= cornEaten;
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
