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
                } else if (num == 2) {
                    int steps = input.nextInt();
                    Animal i = new Wallies(n, w, steps);
                    list.add(i);
                } else if (num == 3) {
                    String sw = input.next();
                    Animal i = new Beepers(n, w, sw);
                    list.add(i);
                }
                num = input.nextInt();
            }

            double total = 0;
            int count = 0;
            double totalSteps = 0;
            int wCount = 0;
            int numWords = 0;
            int wordLetters = 0;


            for (Animal x : list) {
                if (x instanceof Hiccas) {
                    total += ((Hiccas)x).getFurWorth();
                    count++;
                }
                if (x instanceof Wallies) {
                    totalSteps += ((Wallies)x).getSteps();
                    wCount++;
                }
                if (x instanceof Beepers) {
                    String word = ((Beepers)x).getSpecialWord();
                    numWords++;
                    for (int i = 0; i < numWords; i++) {
                        wordLetters += word.length();
                    }
                }
            }

            System.out.printf("The average value of the hicca fur is: %.2f\n", total/count);
            System.out.printf("The average number of steps taken by the wallies is: %.1f\n", totalSteps/wCount);
            System.out.println("The average size of the Beepers word is: " + wordLetters/numWords);



        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
