package Q3.Farm;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat"));

            List<Animal1> animals = new ArrayList<Animal1>();
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
                Cow1 wow = new Cow1(weight, milkLBs, cornEaten, hayEaten);
                cow.add(wow);
                animals.add(wow);
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
                Horse1 fred = new Horse1(weight, cornEaten, hayEaten, rides, rideCost);
                horse.add(fred);
                animals.add(fred);
                hayBales -= hayEaten;
                cornCobs -= cornEaten;
            }

            int foodCost = 0;
            int totWeight = 0;
            int totAnimals = animals.size();
            for (int lcv = 0; lcv < totAnimals; lcv++) {
                if (animals.get(lcv) instanceof Horse1) {
                    Horse1 horse1 = (Horse1)animals.get(lcv);
                    hIncome += (horse1.getRideCost() * horse1.getRides());
                    foodCost += (horse1.getNumCorn() * cornCost) + (horse1.getNumHayBales() * hayCost);
                    totWeight += horse1.getWeight();
                }
            }

            for (int lcv = 0; lcv < totAnimals; lcv++) {
                if (animals.get(lcv) instanceof Cow1) {
                    Cow1 cow1 = (Cow1)animals.get(lcv);
                    cIncome += (cow1.getMilk() * cow1.getMilkPrice());
                    foodCost += (cow1.getNumCorn() * cornCost) + (cow1.getNumHayBales() * hayCost);
                    totWeight += cow1.getWeight();
                }
            }

            Cow1 james = new Cow1(1250, 80, 4, 3);
            animals.set(0, cow.get(0));

            double totIncome = (cIncome + hIncome);

            System.out.println("The total cost to feed all animals is $" + foodCost);
            System.out.println("The total income of all animals is $" + totIncome);
            System.out.println("The total weight of all animals is : " + totWeight);
            if (hayBales > 0 && cornCobs > 0) {
                System.out.println("There is enough food to feed all animals");
                System.out.println("There are " + hayBales + " hay bales left");
                System.out.println("There are " + cornCobs + " corn cobs left");
            }
            else System.out.println("There is not enough food to feed all animals");

            System.out.println("The number of cows and horses is: " + (cows + horses));

            System.out.println(animals.get(0).getWeight());


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
