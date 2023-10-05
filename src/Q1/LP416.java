package Q1;

import java.util.*;

public class LP416 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an angle in degrees: ");
    double userangle = input.nextDouble();
    double angle = Math.toRadians(userangle);

    double sine = Math.sin(angle);
    double cosine = Math.cos(angle);
    double tangent = Math.tan(angle);

    System.out.printf("Sine: %.3f", sine);
    System.out.printf("\nCosine: %.3f", cosine);
    System.out.printf("\nTangent: %.3f", tangent);
  }
}