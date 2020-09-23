import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Random;

public class Distance {

    public static void main(String[] args) {

        //gets input
        int num = Integer.parseInt(args[0]);

        int num2 = num * 2;

        //creates Point2D Array
        double x;
        double y;

        Point2D myPointArray[] = new Point2D[num];

        Random rand = new Random();

        for (int i = 0; i < num; i++) {
            x = rand.nextDouble();
            y = rand.nextDouble();
            myPointArray[i] = new Point2D(x, y);
        }

        StdOut.println("Array of points (x,y)");
        StdOut.println(Arrays.toString(myPointArray));

        //compare points to find the closest two

        double smallestDistance = 10;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i != j) {
                    double distance = myPointArray[i].distanceTo(myPointArray[j]);
                    if (distance < smallestDistance) {
                        smallestDistance = distance;
                    }
                }
            }
        }

        StdOut.println("Shortest distance: " + smallestDistance);

    }
}
