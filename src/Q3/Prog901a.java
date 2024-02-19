package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog901a {

    public static void printFile(Scanner input) {
        System.out.println(input);
    }

    public static String reverseString(String s) {
        s = "abcdefghijklmnopqrstuvwxyz";
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j < s.length(); j++) {
                int count = 0;
                int temp = i;
                i = j;
                j = temp;

            }
        } return s;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog512h.dat"));

            String something = input.nextLine();
            System.out.println(something);
        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
