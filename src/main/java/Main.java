package src;

import java.util.ArrayList;


public class Main {
    private static final ArrayList<Vehicle> allVehicles = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("In vehicles Main");
        System.out.println("Second line");

        Vehicle myVehicle = new Vehicle();
        myVehicle.setMilesPerGallon(20);
        myVehicle.setGallonsOfGas(10.0);
        myVehicle.setOdometer(0);
        allVehicles.add(myVehicle);

        Vehicle myVehicle1 = new Vehicle();
        myVehicle1.setMilesPerGallon(25);
        myVehicle1.setGallonsOfGas(8);
        myVehicle1.setOdometer(10_000);
        allVehicles.add(myVehicle1);

        Vehicle myVehicle2 = new Vehicle();
        myVehicle2.setMilesPerGallon(15);
        myVehicle2.setGallonsOfGas(12);
        myVehicle2.setOdometer(20_000);
        allVehicles.add(myVehicle2);

        drive(100);
        drive(60);

    }


    private static void drive(int milesDriven) {
        for (Vehicle vehicle : allVehicles) {
            System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of gas " + vehicle.getGallonsOfGas());
           vehicle.go(milesDriven);
            System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of gas " + vehicle.getGallonsOfGas());
        }
    }
}
