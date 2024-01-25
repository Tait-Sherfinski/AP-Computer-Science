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
            int totalSteps = 0;
            String large = "";
            String small = "";

            for (Animal x : list) {
                if (x instanceof Hiccas) {
                    total += ((Hiccas)x).getFurWorth();
                    count++;
                }
                if (x instanceof Wallies)
                    totalSteps += ((Wallies)x).getSteps();
                if (x instanceof Beepers) {
                    String word = ((Beepers)x).getSpecialWord();
                    if (word.length() > large.length())
                        large = word;
                    if (word.length() < small.length())
                        small = word;
                }
            }



        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
