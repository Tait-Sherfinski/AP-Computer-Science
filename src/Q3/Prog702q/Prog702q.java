package Q3.Prog702q;

import Q3.Prog702q.Cars;
import Q3.Prog702q.Trucks;
import Q3.Prog702q.Buses;
import Q3.Prog702q.Vehicle;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.txt"));
            List<Vehicle> list = new ArrayList<Vehicle>();

                int num = input.nextInt();
                String n = input.next();
                int t = input.nextInt();
                if (num == 1) {
                    double w = input.nextDouble();
                    double v = w;
                    Vehicle i = new Cars(n, t, v, w);
                    list.add(i);
                }
                if (num == 2) {
                    int m = input.nextInt();
                    double v = 50000 - m * 0.25;
                    Vehicle i = new Trucks(n, t, v, m);
                    list.add(i);
                }
                if (num == 3) {
                    String c = input.next();
                    double v = 50000;
                    Vehicle i = new Buses(n, t, v, c);
                    list.add(i);
                }



            int numVehicles = 0;
            int totCarVal = 0;
            int carTires = 0;
            int truckTires = 0;
            int busTires = 0;
            int truckVal = 0;
            int busVal = 0;
            int totalWorth = 0;

            for (Vehicle x : list) {
                if (x instanceof Cars) {
                    totCarVal += ((Cars)x).getWorth();
                    totalWorth += totCarVal;
                    numVehicles++;
                    carTires++;
                }
                if (x instanceof Trucks) {
                    truckVal += ((Trucks)x).getValue();
                    totalWorth += truckVal;
                    numVehicles++;
                    truckTires++;
                }
                if (x instanceof Buses) {
                    busVal += ((Buses)x).getValue();
                    totalWorth += busVal;
                    numVehicles++;
                    busTires++;
                }
            }

            System.out.println("The total number of vehicles is: " + numVehicles);
            System.out.println("The total value of the cars is: " + totCarVal);
            System.out.println("The total that all of the vehicles are worth is: " + totalWorth);

        } catch (IOException e) {
            System.out.println("Can't find data file");
        }
    }
}
