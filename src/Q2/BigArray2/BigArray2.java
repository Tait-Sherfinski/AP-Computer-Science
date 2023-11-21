package Q2.BigArray2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BigArray2 {
    public static void printCat(Cat cat) {
        System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            Cat[] cats = new Cat[50];

            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats[lcv] = new Cat(name, weight, age, cost);
            }

            // 1
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++) {
                printCat(cats[lcv]);
            }

            // 2
            System.out.println("\n2. The third cat is name: " + cats[2].getName());

            // 3
            cats[numCats-1].setWeight(cats[numCats-1].getWeight() + 10);
            System.out.println("3. The updated weight is: " + cats[numCats-1].getWeight());

            // 4
            int rascalIndex = 0;
            for (int lcv = 0; lcv < numCats; lcv++) {
                if (cats[lcv].getName().equals("Rascal"))
                    rascalIndex = lcv;
            }
            for (int lcv = rascalIndex; lcv < numCats - 1; lcv++)
                cats[lcv] = cats[lcv+1];
            numCats--;

            // 5
            for (int lcv = numCats; lcv > 1; lcv--)
                cats[lcv] = cats[lcv-1];
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numCats++;

            // 6
            cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
            numCats++;

            // 7
            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                if (cat != null) printCat(cat);
            }

            // 8
            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;

            // 9
            Cat tempCat = cats[1];
            cats[1] = cats[3];
            cats[3] = tempCat;

            // 10
            System.out.println("\n10. Current cat names are: ");
            for (Cat cat : cats) {
                if ( cat != null) System.out.print(cat.getName() + "\t");
            }
            System.out.println();

            // 11
            int i = 0;
            while (i < numCats) {
                if (cats[i].getCost() < 26) {
                    for (int j = i; j < numCats - 1; j++)
                        cats[j] = cats[j + 1];
                    numCats--;
                } else {
                    i++;
                }
            }

            System.out.println("\n11. The cats costing $26 or more actually cost: ");
            for (int lcv = 0; lcv < numCats; lcv++)
                System.out.print(cats[lcv].getCost());
            System.out.println();

            // 12
            System.out.println("\n12. The cats being put on a diet are: ");
            for (int lcv = 0; lcv < numCats; lcv++) {
                Cat cat = cats[lcv];
                if (cat.getWeight() > 15)
                    System.out.println(cat.getName() + "\t");
            }
            System.out.println();

            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
