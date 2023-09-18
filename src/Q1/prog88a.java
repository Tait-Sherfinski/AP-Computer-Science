package Q1;

public class prog88a {
    public static void main(String[] args) {
        // Math.random() * (max - min) + min
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (20 - 2)) + 2;
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2;
        int absdiff = Math.abs(diff);
        int max, min;

        if (num1 > num2) {
            max = num1;
        } else { // otherwise
            max = num2; }

        if (max == num1) {
            min = num2;
        } else { min = num1; }

        System.out.println("Original numbers are " + num1 + " and " + num2);

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Absolute Difference = " + absdiff);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
    }
}
