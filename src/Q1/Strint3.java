package Q1;

import java.util.*;

public class Strint3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int lcv = 0; lcv < str.length(); lcv++) {
            String c = str.substring(lcv, lcv+1);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeating character is: " + c);
                break;
            }
        }
    }
}
