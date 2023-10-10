package Q1;
import java.util.*;

public class LP517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "Hello";

        System.out.print("Enter the password: ");
        String userpas1 = input.nextLine();

        if (userpas1.equals(password)) System.out.println("Welcome");
        else if (userpas1 != password) {
            System.out.println("The password typed is incorrect");
            System.out.print("Enter the password: ");
            String userpas2 = input.nextLine();
            if (userpas2.equals(password)) System.out.println("Welcome");
            else if (userpas2 != password) {
                System.out.println("The password typed is incorrect");
                System.out.print("Enter the password: ");
                String userpas3 = input.nextLine();
                if (userpas3.equals(password)) System.out.println("Welcome");
                else System.out.println("Access denied");
            }
        }
    }
}
