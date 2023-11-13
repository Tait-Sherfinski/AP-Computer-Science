package Q2;

public class BiggArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] = (int)(Math.random() * (91 - 20) + 20);
        }

        // 1
        for (int lcv = 0; lcv < array.length; lcv++) {
            System.out.print(array[lcv] + " ");
        }
        System.out.println();

        // 2
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();

        // 3
        System.out.println("The middle number is " + array[array.length / 2]);

        // 4
        double avg = array[0] + array[array.length - 1] + array[array.length / 2];
        System.out.println("Average of the first, middle, and last number is " + (avg/3));

        // 5
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);

        // 6
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] == smallest)
                array[lcv] = largest;
            else if (array[lcv] == largest)
                array[lcv] = smallest;
        }

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // 7
        int randnum = (int)(Math.random() * 10 + 1);
        array[array.length / 2] = randnum;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // 8
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] += 10;
        }
        for (int x : array) System.out.print(x + " ");
        System.out.println();

        // 9
        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is " + myThird);
    }
}
