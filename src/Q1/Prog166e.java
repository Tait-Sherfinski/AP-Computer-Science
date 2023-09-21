package Q1;

public class Prog166e {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        double c = 0;

        // || = OR
        // && = AND
        while (a < 16 && b <= 15) {
            a += 1;
            if (a == b) {
                b++;
                if (a != 15) {
                    a = 1;
                }
            }
        }
        c = (double)a / b;
        System.out.printf("%d/%d\t\t%.5f\n", a,b,c);
    }
}
