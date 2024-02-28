package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));

            ArrayList<Cow> cow = new ArrayList<Cow>();
            ArrayList<Horse> horse = new ArrayList<Horse>();


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

            int horses = input.nextInt();
            for (int i = 0; i < horses; i++) {
                int weight = input.nextInt();
                int hayEaten = input.nextInt();
                int cornEaten = input.nextInt();
                int rides = input.nextInt();
                double rideCost = input.nextDouble();
                hayBales -= hayEaten;
                cornCobs -= cornEaten;
            }


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
