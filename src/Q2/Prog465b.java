package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465b.dat"));

            int[][] mat = new int[3][4];
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = input.nextInt();
                }
            }

            int[][] sub100;
            for (int[] n : mat) {
                for (int j : n) {
                    if (j < 100) {
                        System.out.println(j);
                    }
                }
            }

            for (int[] row : mat) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }


        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
