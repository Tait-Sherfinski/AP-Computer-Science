package Q2.Prog402aArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
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
