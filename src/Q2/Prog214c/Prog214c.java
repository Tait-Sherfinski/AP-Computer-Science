package Q2.Prog214c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog214c.dat"));

            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
