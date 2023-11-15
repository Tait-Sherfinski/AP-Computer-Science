package Q2;

import java.util.*;

public class MSOE2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lowercase word: ");
        String word = input.nextLine();
        String reverse = "";
        Boolean same = false;

        for (int lcv = word.length() - 1; lcv >= 0; lcv--) {
            reverse = reverse + word.charAt(lcv);
        }

        if (reverse.equals(word)) same = true;
        else same = false;

        System.out.println("Is the word palindromic? " + same);
    }
}
