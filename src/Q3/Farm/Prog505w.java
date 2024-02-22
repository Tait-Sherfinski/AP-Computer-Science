package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();

            int cWeight = 0;
            int foodEaten = 0;

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();
            int cowPens = input.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int milk = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    Cow wow = new Cow(name, weight, milk, hayEaten, cornEaten);
                    animals.add(wow);
                    foodEaten += cornEaten;
                    foodEaten += hayEaten;
                    hay -= hayEaten;
                    corn -= cornEaten;
                    cWeight += weight;
                }
            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();
            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = input.next();
                    int weight = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    int rides = input.nextInt();
                    double rideCost = input.nextDouble();
                    Horse fred = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                    foodEaten += cornEaten;
                    foodEaten += hayEaten;
                    hay -= hayEaten;
                    corn -= cornEaten;
                    cWeight += weight;
                }
            }

            if (hay + corn - foodEaten > 0) {
                System.out.println("There is enough food to feed all animals");
            } else System.out.println("There is not enough food to feed all animals");

            System.out.println(cWeight);

            // TODO: report income of the day, if theres enough food to feed all


            double minHorseValue = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse)animals.get(lcv);
                    if (horse.value(cornCost, hayCost) < minHorseValue) {
                        minHorseValue = horse.value(cornCost, hayCost);
                        minHorseIndex = lcv;
                    }
                }
            }

            double maxCowValue = Double.MIN_VALUE;
            int maxCowIndex = 0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow)animals.get(lcv);
                    if (cow.value(cornCost, hayCost) > maxCowValue) {
                        maxCowValue = cow.value(cornCost, hayCost);
                        maxCowIndex = lcv;
                    }
                }
            }

            System.out.println(animals.get(maxCowIndex).getName());
            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
