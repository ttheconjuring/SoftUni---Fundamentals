package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed3 {
// the worst code ever, 100/100 anyway
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Map<Integer, Integer>> carMileageFuelAvailableMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String carInfo = sc.nextLine();
            String[] carInfoArray = carInfo.split("\\|");
            String car = carInfoArray[0];
            int mileage = Integer.parseInt(carInfoArray[1]);
            int fuelAvailable = Integer.parseInt(carInfoArray[2]);
            carMileageFuelAvailableMap.putIfAbsent(car, new LinkedHashMap<>());
            carMileageFuelAvailableMap.get(car).putIfAbsent(mileage, fuelAvailable);
        }

        String command = sc.nextLine();

        String car;
        int mileage = 0;
        int availableFuel;
        int fuel = 0;
        int newMileage;

        while (!command.equals("Stop")) {
            String[] commandArray = command.split(" : ");
            switch (commandArray[0]) {
                case "Drive":
                    car = commandArray[1];
                    int distance = Integer.parseInt(commandArray[2]);
                    fuel = Integer.parseInt(commandArray[3]);

                    Map<Integer, Integer> mileageFuelAvailableMap = carMileageFuelAvailableMap.get(car);
                    mileage = 0;
                    availableFuel = 0;
                    for (Map.Entry<Integer, Integer> integerIntegerEntry : mileageFuelAvailableMap.entrySet()) {
                        mileage = integerIntegerEntry.getKey();
                        availableFuel = integerIntegerEntry.getValue();
                    }

                    if (availableFuel >= fuel) {
                        newMileage = mileage + distance;
                        int newAvailableFuel = availableFuel - fuel;
                        carMileageFuelAvailableMap.get(car).remove(mileage);
                        carMileageFuelAvailableMap.get(car).putIfAbsent(newMileage, newAvailableFuel);
                        System.out.println(car + " driven for " + distance + " kilometers. " + fuel + " liters of fuel consumed.");
                        if (newMileage >= 100000) {
                            System.out.println("Time to sell the " + car + "!");
                            carMileageFuelAvailableMap.remove(car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    car = commandArray[1];
                    fuel = Integer.parseInt(commandArray[2]);

                    mileageFuelAvailableMap = carMileageFuelAvailableMap.get(car);
                    mileage = 0;
                    availableFuel = 0;
                    for (Map.Entry<Integer, Integer> integerIntegerEntry : mileageFuelAvailableMap.entrySet()) {
                        mileage = integerIntegerEntry.getKey();
                        availableFuel = integerIntegerEntry.getValue();
                    }

                    if (availableFuel <= 75) {
                        int neededFuel = 75 - availableFuel;
                        if (neededFuel >= fuel) {
                            carMileageFuelAvailableMap.get(car).remove(mileage);
                            carMileageFuelAvailableMap.get(car).putIfAbsent(mileage, availableFuel + fuel);
                            System.out.println(car + " refueled with " + fuel + " liters");
                        } else {
                            carMileageFuelAvailableMap.get(car).remove(mileage);
                            carMileageFuelAvailableMap.get(car).putIfAbsent(mileage, 75);
                            System.out.println(car + " refueled with " + neededFuel + " liters");
                        }
                    }
                    break;
                case "Revert":
                    car = commandArray[1];
                    int kilometers = Integer.parseInt(commandArray[2]);

                    mileageFuelAvailableMap = carMileageFuelAvailableMap.get(car);
                    mileage = 0;
                    availableFuel = 0;
                    for (Map.Entry<Integer, Integer> integerIntegerEntry : mileageFuelAvailableMap.entrySet()) {
                        mileage = integerIntegerEntry.getKey();
                        availableFuel = integerIntegerEntry.getValue();
                    }

                    newMileage = mileage - kilometers;
                    carMileageFuelAvailableMap.get(car).remove(mileage);
                    carMileageFuelAvailableMap.get(car).putIfAbsent(newMileage, availableFuel);

                    if (newMileage < 10000) {
                        carMileageFuelAvailableMap.get(car).remove(mileage);
                        carMileageFuelAvailableMap.get(car).putIfAbsent(10000, availableFuel);
                    } else {
                        System.out.println(car + " mileage decreased by " + kilometers + " kilometers");
                    }

                    break;
            }
            command = sc.nextLine();
        }

        for (Map.Entry<String, Map<Integer, Integer>> stringMapEntry : carMileageFuelAvailableMap.entrySet()) {
            car = stringMapEntry.getKey();
            for (Map.Entry<Integer, Integer> integerIntegerEntry : stringMapEntry.getValue().entrySet()) {
                mileage = integerIntegerEntry.getKey();
                fuel = integerIntegerEntry.getValue();
            }
            System.out.println(car + " -> Mileage: " + mileage + " kms, Fuel in the tank: " + fuel + " lt.");
        }


        sc.close();
    }

}
