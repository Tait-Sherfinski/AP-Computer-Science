package Q1.Prog213e;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat"));
            int age = 0;

            while (input.hasNext()) {
                age = input.nextInt();
                Cl213e wow = new Cl213e(age);
                wow.calc();
                int distribution = wow.getDistribution();
                double percent = wow.getPercent();
                String group = wow.getGroup();
                System.out.println("Group: " + group);
                System.out.println("Distribution: " + distribution);
                System.out.println("Percentage: %" + percent);
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
