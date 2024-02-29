package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));

            List<Cow1> cow = new ArrayList<Cow1>();
            List<Horse1> horse = new ArrayList<Horse1>();

            double hIncome = 0;
            double cIncome = 0;

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
                cIncome = milkLBs * 0.20;
                Cow1 wow = new Cow1(weight, milkLBs, cornEaten, hayEaten);
                cow.add(wow);
                hayBales -= hayEaten;
                cornCobs -= cornEaten;
            }

            int horses = input.nextInt();
            for (int i = 0; i < horses; i++) {
                int weight = input.nextInt();
                int hayEaten = input.nextInt();
                int cornEaten = input.nextInt();
                int rides = input.nextInt();
                double rideCost = input.nextDouble();
                hIncome = rides * rideCost;
                Horse1 fred = new Horse1(weight, cornEaten, hayEaten, rides, rideCost);
                horse.add(fred);
                hayBales -= hayEaten;
                cornCobs -= cornEaten;
            }

            double totalIncome = cIncome + hIncome;

            System.out.println(totalIncome);
            System.out.println("The number of cows and horses is: " + (cows + horses));


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
