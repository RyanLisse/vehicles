package src;

import java.util.Arrays;

public class Main {
//    private static int milesPerGallon = 20;
//    private static double gallonsOfGas = 10.0;
//    private static int odometer = 0;


    private static int[] milesPerGallon = {20, 25, 15};
    private static double[] gallonsOfGas = {10.0, 8, 12};
    private static int[] odometer = {0, 10_000, 20_000};

    public static void main(String[] args) {
        System.out.println("In vehicles Main");
        System.out.println("Second line");


        drive(100);

        drive(60);

    }

    private static void drive(int milesDriven) {
        for (int i = 0; i < 3; i++) {


            System.out.println(i + " Odometer " + odometer[i] + " Gallons of gas " + gallonsOfGas[i]);
            gallonsOfGas[i] -= (milesDriven / milesPerGallon[i]);
            odometer[i] += milesDriven;
            System.out.println(i + " Odometer " + odometer[i] + " Gallons of gas " + gallonsOfGas[i]);
        }
    }
}
