package Q1;

import java.util.*;

public class LP46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      Random r = new Random();
      Random rand = new Random();

      int a = 10;
      int b = 1;

      char operator = '?';
      double ans = 0;

      int num1 = rand.nextInt(11);
      int num2 = rand.nextInt(11);

      int max = Math.max(num1, num2);
      int min = Math.min(num1, num2);

      switch (r.nextInt(4)) {
        case 0: operator = '+';
          ans = max + min;
          break;
        case 1: operator = '-';
          ans = max - min;
          break;
        case 2: operator = '*';
          ans = max * min;
          break;
        case 3: operator = '/';
          ans = max / min;
          break;
        default: operator = '?';
      }

      System.out.println(max + " " + operator + " " + min + " = ");
      
      double userans = input.nextDouble();

      if (userans == ans) {
        System.out.println("Correct");
      } else {
        System.out.println("Incorrect");
      }
    }
}
