package Q3;

import java.util.*;

public class MSOE2019one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two letters: ");
        String two = input.nextLine();
        System.out.print("Enter a line of text: ");
        String line = input.nextLine();

        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.substring(i).equals(two.substring(0, 1))) count++;
        }
        System.out.println(count);
    }
}
