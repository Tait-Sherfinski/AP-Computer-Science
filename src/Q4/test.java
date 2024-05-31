package Q4;

import java.util.*;

public class test {
    public static void main(String[] args) {
        double finalGrade = 0.0;
        double summ = 0.8;
        double form = 0.2;
        Scanner input = new Scanner(System.in);
        System.out.print("Total Summative points: ");
        double totalSpoints = input.nextDouble();
        System.out.print("Possible Summative points: ");
        double pSpoints = input.nextDouble();
        System.out.print("Total formative points: ");
        double totalFpoints = input.nextDouble();
        System.out.print("Possible formative points: ");
        double pFpoints = input.nextDouble();
        System.out.print("summative or formative: ");
        String SorF = input.next();
        System.out.print("Points from assignment: ");
        double aPoints = input.nextDouble();
        System.out.print("Possible points from assignment: ");
        double pPoints = input.nextDouble();
        if (SorF.equals("summative")) {
            double temp = ((totalFpoints / pFpoints) * form) + ((totalSpoints / pSpoints) * summ);
            finalGrade += temp + ((aPoints / pPoints) * summ) * 100;
        }
        else if (SorF.equals("formative")) {
            double temp = ((totalFpoints / pFpoints) * form) + ((totalSpoints / pSpoints) * summ);
            finalGrade += temp + ((aPoints / pPoints) * form) * 100;
        }
        System.out.println(finalGrade);
    }
}
