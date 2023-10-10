package Q1.Prog285b;

import java.util.*;
import java.io.File;
import java.io.IOException;

public class Prog285b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat"));

            System.out.println("ID:\t\tCode:\tCommission:");
            while (input.hasNext()) {
                int id = input.nextInt();
                int code = input.nextInt();
                double sales = input.nextDouble();

                Salesperson fred = new Salesperson(id, code, sales);
                fred.setComm();
                System.out.println(fred.toString());
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
