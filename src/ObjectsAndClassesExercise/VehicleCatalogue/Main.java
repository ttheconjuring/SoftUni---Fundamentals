package ObjectsAndClassesExercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vehicleData = sc.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

        while (!vehicleData.equals("End")) {
            String[] vehicleDataArray = vehicleData.split("\\s+");
            String type = vehicleDataArray[0];
            String model = vehicleDataArray[1];
            String color = vehicleDataArray[2];
            int horsePower = Integer.parseInt(vehicleDataArray[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);
            vehicleData = sc.nextLine();
        }

        String modelOfVehicle = sc.nextLine();

        while (!modelOfVehicle.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(modelOfVehicle)) {
                    vehicle.print();
                    break;
                }
            }
            modelOfVehicle = sc.nextLine();
        }

        sc.close();

        int cars = 0;
        double sumOfCarsHorsePower = 0;
        int trucks = 0;
        double sumOfTrucksHorsePower = 0;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("car")) {
                cars++;
                sumOfCarsHorsePower += vehicle.getHorsePower();
            } else {
                trucks++;
                sumOfTrucksHorsePower += vehicle.getHorsePower();
            }
        }

        double averageHorsePowerOfCar = sumOfCarsHorsePower / cars;
        double averageHorsePowerOfTruck = sumOfTrucksHorsePower / trucks;

        if (cars == 0 && trucks == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else if (cars == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHorsePowerOfTruck);
        } else if (trucks == 0) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePowerOfCar);
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsePowerOfCar);
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHorsePowerOfTruck);
        }

    }

}
