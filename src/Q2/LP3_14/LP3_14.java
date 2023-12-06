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

    ClLP3_14 wow = new ClLP3_14(aNY, mNY, aNJ, mNJ, aC, mC);
    wow.calc();

    double aVotes = wow.getAVotes();
    double mVotes = wow.getMVotes();
    double total = wow.getTotal();

    System.out.println("Candidates\t\tVotes\tPercentage");
    System.out.println("Awbrey\t\t\t" + aVotes + "\t" + (aVotes / total) * 100);
    System.out.println("Martinez\t\t" + mVotes + "\t" + (mVotes / total) * 100);
    System.out.println("Total: " + total);
  }
}

// Election Results for New York:
//Awbrey: 314159
//Martinez: 271860
//Election Results for New Jersey
//Awbrey: 89008
//Martinez: 121032
//Election Results for Connecticut
//Awbrey: 213451
//Martinez: 231034
//Candidates		Votes	Percentage
//Awbrey			616618.0	49.70545180179018
//Martinez		623926.0	50.294548198209824
//Total: 1240544.0
//
//Process finished with exit code 0