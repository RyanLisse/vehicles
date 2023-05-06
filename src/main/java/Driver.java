import src.Vehicle;

import javax.swing.*;
import java.util.ArrayList;


public class Driver {
    private static final ArrayList<Vehicle> allVehicles = new ArrayList<>();

    public static void main(String[] args) {
        promptUser();
        displayOutput();
    }

    public static void promptUser() {
        int goAgain = JOptionPane.NO_OPTION;
        do {
            String nickname = JOptionPane.showInputDialog("What is the name of this vehicle?");
            String strMilesPerGallon = JOptionPane.showInputDialog("Enter miles per Gallon");
            int milesPerGallon = Integer.parseInt(strMilesPerGallon);

            String strGallonsOfGas = JOptionPane.showInputDialog("Enter Gallons Gas");
            double gallonsOfGas = Double.parseDouble(strGallonsOfGas);

            String strOdometer = JOptionPane.showInputDialog("Enter Odometer");
            int odometer = Integer.parseInt(strOdometer);

            Vehicle vehicle = new Vehicle();
            vehicle.setMilesPerGallon(milesPerGallon);
            vehicle.setGallonsOfGas(gallonsOfGas);
            vehicle.setOdometer(odometer);
            allVehicles.add(vehicle);
            goAgain = JOptionPane.showConfirmDialog(null, "Do you want to enter another vehicle?", "Go Again", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (goAgain == JOptionPane.YES_OPTION);

    }


    private static void displayOutput() {
        do {
            String strMilesDriven = JOptionPane.showInputDialog("How Far Do want to go");
            int milesDriven = Integer.parseInt(strMilesDriven);

            for (Vehicle vehicle : allVehicles) {
                System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of gas " + vehicle.getGallonsOfGas());
                vehicle.go(milesDriven);
                System.out.println("Odometer " + vehicle.getOdometer() + " Gallons of gas " + vehicle.getGallonsOfGas());
            }
        } while (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Do you want to take another trip?", "Go Again", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
    }
}
