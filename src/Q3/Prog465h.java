package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat"));
            int num = input.nextInt();
            int num2 = input.nextInt();
            int[][] mat = new int[num][num2];
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    mat[row][col] = input.nextInt();
                    if (mat[row][col] > 0) {
                        System.out.println(row);
                    }
                }
            }


            for (int[] row : mat) {
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
            else System.out.println("The original array is equally efficient");


            int num3 = input.nextInt();
            int num4 = input.nextInt();
            int[][] mat2 = new int[num3][num4];
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

            int count2 = 0;
            for (int[] i : mat2) {
                for (int j : i) {
                    if (j < 1) count2++;
                }
            } if (count2 > 25) System.out.println("The original array is sparse");
            else if (count2 <= 15) System.out.println("The original array is abundant");
            else System.out.println("The original array is equally efficient");


            int num5 = input.nextInt();
            int num6 = input.nextInt();
            int[][] mat3 = new int[num5][num6];
            for (int row = 0; row < mat2.length; row++) {
                for (int col = 0; col < mat2[0].length; col++) {
                    mat3[row][col] = input.nextInt();
                }
            }

            for (int[] row : mat3) {
                for (int n : row)
                    System.out.print(n + "\t");
                System.out.println();
            }

            int count3 = 0;
            for (int[] i : mat2) {
                for (int j : i) {
                    if (j < 1) count3++;
                }
            } if (count3 > 25) System.out.println("The original array is sparse");
            else if (count3 <= 15) System.out.println("The original array is abundant");
            else System.out.println("The original array is equally efficient");

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
