package Q1.Prog52aCL;
import java.util.*;

public class Prog52aCL { // driver class (main)
    public static void main(String[] args) {
        // input section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = input.nextInt();
        System.out.print("Enter width: ");
        int w = input.nextInt();

        // calculation section
        CL52a wow = new CL52a(l, w);
        wow.calc();

        int area = wow.getArea();
        int perim = wow.getPerim();

        // output
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perim);
    }
}
