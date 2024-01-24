package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat"));
            int[][] mat = new int[5][6];
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = input.nextInt();
                }
            }

            for (int[] row : mat) {
                for (int n : row)
                    System.out.print(n + "\t");
                System.out.println();
            }

            int[][] mat2 = new int[5][6];
            for (int row = 0; row < mat2.length; row++) {
                for (int col = 0; col < mat2[0].length; col++) {
                    mat2[row][col] = input.nextInt();
                }
            }

            for (int[] row : mat2) {
                for (int n : row)
                    System.out.print(n + "\t");
                System.out.println();
            }

            int count = 0;
            for (int[] i : mat) {
                for (int j : i) {
                    if (j < 1) count++;
                }
            } if (count > 25) System.out.println("The original array is sparse");
            else if (count <= 15) System.out.println("The original array is abundant");

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
