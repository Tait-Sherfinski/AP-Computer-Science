package Q1.Prog213e;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213e.dat"));
            int age = 0;

            while (input.hasNext()) {
                age = input.nextInt();
                Cl213e wow = new Cl213e(age);
                wow.calc();
                int distribution = wow.getDistribution();
                double percent = wow.getPercent();
                String group = wow.getGroup();
                System.out.println("\nGroup: " + group);
                System.out.println("Distribution: " + distribution);
                System.out.println("Percentage: %" + percent);
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}

// Group: <20
//Distribution: 3
//Percentage: %17.65
//
//Group: >79
//Distribution: 2
//Percentage: %11.76
//
//Group: 60-79
//Distribution: 3
//Percentage: %17.65
//
//Group: 60-79
//Distribution: 3
//Percentage: %17.65
//
//Group: 20-39
//Distribution: 5
//Percentage: %29.41
//
//Group: 20-39
//Distribution: 5
//Percentage: %29.41
//
//Group: <20
//Distribution: 3
//Percentage: %17.65
//
//Group: 20-39
//Distribution: 5
//Percentage: %29.41
//
//Group: 40-59
//Distribution: 4
//Percentage: %23.53
//
//Group: 40-59
//Distribution: 4
//Percentage: %23.53
//
//Group: 60-79
//Distribution: 3
//Percentage: %17.65
//
//Group: <20
//Distribution: 3
//Percentage: %17.65
//
//Group: <20
//Distribution: 3
//Percentage: %17.65
//
//Group: 40-59
//Distribution: 4
//Percentage: %23.53
//
//Group: 40-59
//Distribution: 4
//Percentage: %23.53
//
//Group: 20-39
//Distribution: 5
//Percentage: %29.41
//
//Group: 40-59
//Distribution: 4
//Percentage: %23.53
//
//Group: >79
//Distribution: 2
//Percentage: %11.76
//
//Group: 20-39
//Distribution: 5
//Percentage: %29.41
//
//Group: <20
//Distribution: 3
//Percentage: %17.65
//
//Group: 40-59
//Distribution: 4
//Percentage: %23.53
//
//Group: 40-59
//Distribution: 4
//Percentage: %23.53
//
//Group: 40-59
//Distribution: 4
//Percentage: %23.53
//
//Process finished with exit code 0
