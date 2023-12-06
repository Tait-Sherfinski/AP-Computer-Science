package Q2.LP3_14;

import java.util.*;

public class LP3_14 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Election Results for New York: ");
    System.out.print("Awbrey: ");
    int aNY = input.nextInt();
    System.out.print("Martinez: ");
    int mNY = input.nextInt();
    System.out.println("Election Results for New Jersey");
    System.out.print("Awbrey: ");
    int aNJ = input.nextInt();
    System.out.print("Martinez: ");
    int mNJ = input.nextInt();
    System.out.println("Election Results for Connecticut");
    System.out.print("Awbrey: ");
    int aC = input.nextInt();
    System.out.print("Martinez: ");
    int mC = input.nextInt();

    ClLP3_14 wow = new ClLP3_14();
    wow.calc();

    int aVotes = wow.getAVotes();
    int mVotes = wow.getMVotes();
    int total = wow.getTotal();

    System.out.println("Candidates\t\tVotes\tPercentage\nAwbrey\t\t\t" + aVotes + "\t" + aVotes / total * 100 + "%\nMartinez\t\t" + mVotes + "\t" + mVotes);
  }
}