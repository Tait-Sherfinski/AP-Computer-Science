package Q2.Prog214bArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214b.dat"));

            Cl214b[] list = new Cl214b[1000];
            int cnt = 0;

            while (input.hasNext()) {
                int empNum = input.nextInt();
                int yearToDate = input.nextInt();
                int myRate = input.nextInt();
                int shiftFactor = input.nextInt();
                int myHours = input.nextInt();

                Cl214b[] yikes = new Cl214b[empNum];
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
