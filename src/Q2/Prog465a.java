package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog285b.dat"));

            while (input.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
