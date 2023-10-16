package Q1;

import java.util.*;

public class LP514 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int Sum;
        Random random = new Random();
        System.out.println("Dice1: \tDice2: \tTotal:");
        for (int lcv = 0; lcv < 5; lcv++) {
          dice1 = random.nextInt(6) + 1;
          dice2 = random.nextInt(6) + 1;
          Sum = dice1 + dice2;
          System.out.println(dice1 + "\t\t" + dice2 + "\t\t" + Sum);
        }
        }
    }
