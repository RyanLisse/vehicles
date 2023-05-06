package src;

public class Main {
    private static int milesPerGallon = 20;
    private static double gallonsOfGas = 10.0;
    private static int odometer = 0;

    public static void main(String[] args) {
        System.out.println("In vehicles Main");
        System.out.println("Second line");


        System.out.println("Odometer " + odometer + " Gallons of gas " + gallonsOfGas);

        drive(100);

        drive(60);
        drive(80);
    }

    private static void drive(int milesDriven) {
        gallonsOfGas -= (milesDriven / milesPerGallon);
        odometer += milesDriven;
        System.out.println("Odometer " + odometer + " Gallons of gas " + gallonsOfGas);
    }
}
