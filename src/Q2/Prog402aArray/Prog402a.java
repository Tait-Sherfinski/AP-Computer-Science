package Q2.Prog402aArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog402a.dat"));
            double[] Ids = new double[100];
            double[] score = new double[100];
            int count = 0;

            while (input.hasNext()) {
                double Id = input.nextDouble();
                Ids[count] = Id;
                count++;
            }
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
