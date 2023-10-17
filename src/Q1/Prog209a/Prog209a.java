package Q1.Prog209a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215a.dat"));

            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
