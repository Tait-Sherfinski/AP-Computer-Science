package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465a.dat"));
            int[][] mat1 = new int[4][4];
            for (int row = 0; row < mat1.length; row++) {
                for (int col = 0; col < mat1[0].length; col++) {
                    mat1[row][col] = input.nextInt();
                }
            }

            int[][] mat2 = new int[4][4];
            for (int row = 0; row < mat2.length; row++) {
                for (int col = 0; col < mat2[0].length; col++) {
                    mat2[row][col] = input.nextInt();
                }
            }

            int[][] largeNums = new int[4][4];


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
