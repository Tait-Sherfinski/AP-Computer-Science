package Q3;

import java.util.*;

public class MSOE2022five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter shell weight: ");
        int shell = input.nextInt();
        int totalShellWeight = 0;
        while (shell != 0) {
            System.out.print("Enter shell weight: ");
            shell = input.nextInt();
            totalShellWeight += shell;
        }
        if (shell == 0) {
            int bucketCount = 0;
            while (totalShellWeight - 100 > 0) {
                while (totalShellWeight > 0) {
                    bucketCount++;
                    totalShellWeight -= 100;
                }
            }
            System.out.println(bucketCount);
        }
    }
}
