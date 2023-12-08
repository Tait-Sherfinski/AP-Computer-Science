package Q2.Prog214c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214c.dat"));

            String gT = input.nextLine();
            double gl = input.nextDouble();
            Cl214c wow = new Cl214c(gT, gl);
            
            double total = wow.getTotal();
            System.out.println("Total: " + total);
            
            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
