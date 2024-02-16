package Q3.Prog703s;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog703s.txt"));
            List<Computer> list = new ArrayList<Computer>();

            int GreenGoldCount = 0;
            int version7Count = 0;
            int code5Count = 0;

            int num = input.nextInt();
            String name = input.nextLine();
            int number = input.nextInt();
            double value = input.nextDouble();
            if (num == 1) {
                String c = input.nextLine();
                if (c.equals("Green") || c.equals("Gold")) GreenGoldCount++;
                Computer i = new Apple(name, number, value, c);
                list.add(i);
            } num = input.nextInt();
            name = input.nextLine();
            number = input.nextInt();
            value = input.nextDouble();
            if (num == 2) {
                double WVNumber = input.nextDouble();
                if (WVNumber == 7.0) version7Count++;
                Computer i = new Windows(name, number, value, WVNumber);
                list.add(i);
            } num = input.nextInt();
            name = input.nextLine();
            number = input.nextInt();
            value = input.nextDouble();
            if (num == 3) {
                int hiddenCode = input.nextInt();
                if (hiddenCode % 5 == 0) code5Count++;
                Computer i = new Linux(name, number, value, hiddenCode);
                list.add(i);
            }

            System.out.println("There are " + GreenGoldCount + " apple computers that are green or gold");
            System.out.println("There are " + version7Count + " windows computers on version 7");
            System.out.println("There are " + code5Count + " linux computers with codes ending in 5");



        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
