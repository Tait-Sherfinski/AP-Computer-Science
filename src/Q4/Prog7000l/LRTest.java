package Q4.Prog7000l;

public class LRTest {
    public static void main(String[] args) {
        double[][] X_train = {
                {2.49, 1},
                {2.57, 1},
                {3.41, 1},
                {1.25, 1},
                {1.62, 1},
                {3.83, 1},
                {11.64, 1},
                {6.41, 1},
                {8.32, 1}
        };
        double[] y_train = {147.1, 110.6, 167.3, 181.0, 145.3, 117.9, 165.5, 134.8, 150.4};
        var lr = new LinearRegression(5, 100, 0.01, 0.001);
        lr.fit(X_train, y_train, 1000);
        System.out.println(lr);
        double newInput = 6.75;
        System.out.println("Predicted output for" + newInput + ": " + lr.predict(newInput));
        System.out.println("Compared to " + X_train[7][0] + ": " + y_train[7]);
        System.out.println("Compared to " + X_train[8][0] + ": " + y_train[8]);
    }
}