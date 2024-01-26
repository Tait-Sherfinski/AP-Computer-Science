package Q3.Prog702p;

import Q3.Prog701g.Admin;
import Q3.Prog701g.Person;
import Q3.Prog701g.Student;
import Q3.Prog701g.Teacher;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat"));
            List<Animal> list = new ArrayList<Animal>();

            int num = input.nextInt();
            while (num != 99) {
                String n = input.next();
                String w = input.next();
                if (num == 1) {
                    double fw = input.nextDouble();
                    Animal i = new Hiccas(n, w, fw);
                    list.add(i);
                    System.out.println("\nHiccas name is: "  + n + " " + w);
                    System.out.println("It's fur is worth: " + fw);
                } else if (num == 2) {
                    int steps = input.nextInt();
                    Animal i = new Wallies(n, w, steps);
                    list.add(i);
                    System.out.println("\nWallies name is: " + n + " " + w);
                    System.out.println("Wallie has taken " + steps + " steps");
                } else if (num == 3) {
                    String sw = input.next();
                    Animal i = new Beepers(n, w, sw);
                    list.add(i);
                    System.out.println("\nBeepers name is: " + n + " " + w);
                    System.out.println("Beepers special word is: " + sw);
                }
                num = input.nextInt();
            }

            double total = 0;
            int count = 0;
            double totalSteps = 0;
            int wCount = 0;
            int numWords = 0;
            int wordLetters = 0;
            int hiccaCount = 0;
            int wallieCount = 0;
            int beeperCount = 0;


            for (Animal x : list) {
                if (x instanceof Hiccas) {
                    total += ((Hiccas)x).getFurWorth();
                    count++;
                    hiccaCount++;
                }
                if (x instanceof Wallies) {
                    totalSteps += ((Wallies)x).getSteps();
                    wCount++;
                    wallieCount++;
                }
                if (x instanceof Beepers) {
                    String word = ((Beepers)x).getSpecialWord();
                    numWords++;
                    beeperCount++;
                    for (int i = 0; i < numWords; i++) {
                        wordLetters += word.length();
                    }
                }
            }

            System.out.println("\nThe fur sum is: $" + total);
            System.out.println("Num Hiccas: " + hiccaCount);
            System.out.println("The number of steps is: " + totalSteps);
            System.out.println("Num Wallies: " + wallieCount);
            System.out.println("The length of the extra word is: " + wordLetters);
            System.out.println("Num Beepers: " + beeperCount);

            double avgFW = total/count;

            System.out.printf("\nThe average value of the hicca fur is: %.2f\n", avgFW);
            System.out.printf("The average number of steps taken by the wallies is: %.1f\n", totalSteps/wCount);
            System.out.println("The average size of the Beepers word is: " + wordLetters/numWords);



        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}

// Hiccas name is: Billy Buckner
//It's fur is worth: 3.25
//
//Wallies name is: Fred Ballony
//Wallie has taken 28 steps
//
//Beepers name is: Nick Cuccia
//Beepers special word is: coolbeans
//
//Hiccas name is: Murray Cox
//It's fur is worth: 4.0
//
//Hiccas name is: Carly Seifert
//It's fur is worth: 2.58
//
//Hiccas name is: Elias Smith
//It's fur is worth: 3.22
//
//Wallies name is: Katy Rumberger
//Wallie has taken 45 steps
//
//Wallies name is: Tanya Barton
//Wallie has taken 78 steps
//
//Wallies name is: Casey Bats
//Wallie has taken 97 steps
//
//Wallies name is: Brandon Davis
//Wallie has taken 68 steps
//
//Beepers name is: Ingrid Sink
//Beepers special word is: superdude
//
//Beepers name is: Nico Binge
//Beepers special word is: attaway
//
//Beepers name is: Mike Break
//Beepers special word is: done
//
//Hiccas name is: Brad Williamson
//It's fur is worth: 2.75
//
//Hiccas name is: Lorenzo Rapp
//It's fur is worth: 2.55
//
//The fur sum is: $18.35
//Num Hiccas: 6
//The number of steps is: 316.0
//Num Wallies: 5
//The length of the extra word is: 64
//Num Beepers: 4
//
//The average value of the hicca fur is: 3.06
//The average number of steps taken by the wallies is: 63.2
//The average size of the Beepers word is: 16
//
//Process finished with exit code 0
