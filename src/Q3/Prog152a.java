package Q3;

public class Prog152a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i < 9669; i+=3) {
            sum += i;
        }
        System.out.println("The sum of multiples from 3 to 9669 is " + sum);
    }
}
